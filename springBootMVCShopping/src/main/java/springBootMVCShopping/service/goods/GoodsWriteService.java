package springBootMVCShopping.service.goods;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.GoodsCommand;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.GoodsDTO;
import springBootMVCShopping.mapper.EmployeeMapper;
import springBootMVCShopping.mapper.GoodsMapper;

@Service
public class GoodsWriteService {
	@Autowired
	EmployeeMapper employeeMapper;
	@Autowired
	GoodsMapper goodsMapper;
	public void execute(GoodsCommand goodsCommand,HttpSession session) {
		GoodsDTO dto = new GoodsDTO();
		dto.setGoodsContent(goodsCommand.getGoodsContent());
		dto.setGoodsName(goodsCommand.getGoodsName());
		dto.setGoodsNum(goodsCommand.getGoodsNum());
		dto.setGoodsPrice(goodsCommand.getGoodsPrice());
		dto.setDeliveryCost(goodsCommand.getDeliveryCost());
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		String empId = auth.getUserId();
		String empNum = employeeMapper.getEmpNum(empId);
		dto.setEmpNum(empNum);
		
		///// 파일정보
		URL resource = getClass().getClassLoader().getResource("static/upload");
		String fileDir = resource.getFile(); //springBootMVCShopping/bin/main
		System.out.println(fileDir);
		/// 대문이미지
		MultipartFile mf = goodsCommand.getGoodsMainStore();
		String originalFile = mf.getOriginalFilename(); //a.b.c.d.hwp
		String extension = originalFile.substring(originalFile.lastIndexOf("."));//.hwp
		String storeName = UUID.randomUUID().toString().replace("-", "");//28648wqgfus8
		String storeFileName = storeName + extension;
		dto.setGoodsMainStore(storeFileName); // storeFile
		dto.setGoodsMainStoreImg(originalFile); 
		// 파일저장
		File file = new File(fileDir + "/"+ storeFileName);
		try {mf.transferTo(file);
		} catch (Exception e) {e.printStackTrace();}
		
		if(!goodsCommand.getGoodsImages()[0].getOriginalFilename().isEmpty()) {
			String originalTotal = ""; 
			String storeTotal = "";
			for(MultipartFile mtf : goodsCommand.getGoodsImages()) {
				originalFile = mtf.getOriginalFilename();
				extension = originalFile.substring(originalFile.lastIndexOf("."));
				storeName = UUID.randomUUID().toString().replace("-", "");
				storeFileName = storeName + extension;
				file = new File(fileDir + "/"+ storeFileName);
				try {mtf.transferTo(file);
				} catch (Exception e) {e.printStackTrace();}
				originalTotal += originalFile + "-";
				storeTotal += storeFileName + "-";
			}
			dto.setGoodsImages(storeTotal);
			dto.setGoodsImagesImg(originalTotal);
		}	
		goodsMapper.goodsInsert(dto);
	}
}










