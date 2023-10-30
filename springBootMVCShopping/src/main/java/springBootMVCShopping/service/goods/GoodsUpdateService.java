package springBootMVCShopping.service.goods;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.FileCommand;
import springBootMVCShopping.command.GoodsCommand;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.GoodsDTO;
import springBootMVCShopping.mapper.EmployeeMapper;
import springBootMVCShopping.mapper.GoodsMapper;

@Service
public class GoodsUpdateService {
	@Autowired
	EmployeeMapper employeeMapper;
	@Autowired
	GoodsMapper goodsMapper;

	public void execute(GoodsCommand goodsCommand, HttpSession session, BindingResult result
			, Model model) {
		GoodsDTO dto = new GoodsDTO();
		dto.setGoodsContent(goodsCommand.getGoodsContent());
		dto.setGoodsName(goodsCommand.getGoodsName());
		dto.setGoodsNum(goodsCommand.getGoodsNum());
		dto.setGoodsPrice(goodsCommand.getGoodsPrice());
		dto.setDeliveryCost(goodsCommand.getDeliveryCost());
		AuthInfoDTO auth = (AuthInfoDTO) session.getAttribute("auth");
		String empId = auth.getUserId();
		String empNum = employeeMapper.getEmpNum(empId);
		dto.setUpdateEmpNum(empNum);

		List<FileCommand> list = (List<FileCommand>) session.getAttribute("fileList");
		GoodsDTO goodsDTO = goodsMapper.selectOne(goodsCommand.getGoodsNum());
		
		///// 파일정보
		URL resource = getClass().getClassLoader().getResource("static/upload");
		String fileDir = resource.getFile(); // springBootMVCShopping/bin/main
		System.out.println(fileDir);
		MultipartFile mf;
		String originalFile;
		String extension;
		String storeName;
		String storeFileName;
		File file;
		if (!goodsCommand.getGoodsMainStore().getOriginalFilename().isEmpty() ) {
			/// 대문이미지
			mf = goodsCommand.getGoodsMainStore();
			originalFile = mf.getOriginalFilename(); // a.b.c.d.hwp
			extension = originalFile.substring(originalFile.lastIndexOf("."));// .hwp
			storeName = UUID.randomUUID().toString().replace("-", "");// 28648wqgfus8
			storeFileName = storeName + extension;
			dto.setGoodsMainStore(storeFileName); // storeFile
			dto.setGoodsMainStoreImg(originalFile);
			// 파일저장
			file = new File(fileDir + "/" + storeFileName);
			try {
				mf.transferTo(file);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			if (list != null) {
				for (FileCommand fileCommand : list) {
					if (fileCommand.getStoreFile().equals(goodsDTO.getGoodsMainStore())) {
						result.rejectValue("goodsMainStore", "error");
						model.addAttribute("error", "대문이미지를 선택해주세요.");
						model.addAttribute("goodsCommand", goodsDTO);
						session.removeAttribute("fileList");
						return;
					}
				}
			}
		}
		List<String> goodsImages = new ArrayList<String>();
		List<String> goodsOrgImages = new ArrayList<String>();
		if (goodsDTO.getGoodsImages() != null) {
			String[] images = goodsDTO.getGoodsImages().split("-");
			String[] orgImages = goodsDTO.getGoodsImagesImg().split("-");
			for (String img : images) {
				goodsImages.add(img); // 리스트삭제가 용이하다.
			}
			for (String img : orgImages) {
				goodsOrgImages.add(img);
			}
			// session에 있는 값을 list에서 삭제
			if (list != null) {
				System.out.println("실행");
				System.out.println(goodsImages);
				for (FileCommand fileCommand : list) {
					for (String str : goodsImages) {
						if (fileCommand.getStoreFile().equals(str)) {
							System.out.println(fileCommand.getStoreFile());
							System.out.println(str);
							System.out.println(fileCommand.getOrgFile());
							goodsImages.remove(fileCommand.getStoreFile());
							goodsOrgImages.remove(fileCommand.getOrgFile());
							break;
						}
					}
				}
				System.out.println(goodsImages);
			}
		}
		///// 설명이미지
		String originalTotal = "";
		String storeTotal = "";
		if (!goodsCommand.getGoodsImages()[0].getOriginalFilename().isEmpty()) {
			for (MultipartFile mtf : goodsCommand.getGoodsImages()) {
				originalFile = mtf.getOriginalFilename();
				extension = originalFile.substring(originalFile.lastIndexOf("."));
				storeName = UUID.randomUUID().toString().replace("-", "");
				storeFileName = storeName + extension;
				file = new File(fileDir + "/" + storeFileName);
				try {
					mtf.transferTo(file);
				} catch (Exception e) {
					e.printStackTrace();
				}
				originalTotal += originalFile + "-";
				storeTotal += storeFileName + "-";
			}
		}
		// 추가된 이미지 추가
		for (String img : goodsImages) {
			storeTotal += img + "-";
		}
		for (String img : goodsOrgImages) {
			originalTotal += img + "-";
		}
		dto.setGoodsImages(storeTotal);
		dto.setGoodsImagesImg(originalTotal);
		int i = goodsMapper.goodsUpdate(dto);
		/// session에 있는 파일을 삭제
		if(i > 0 ) {
			if(list != null) {
				for(FileCommand fileCommand : list) {
					file = new File(fileDir + "/" + fileCommand.getStoreFile());
					if(file.exists())file.delete();					
				}
			}
		}
		session.removeAttribute("fileList");
	}
}
















