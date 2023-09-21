package controller.goods;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.AuthInfoDTO;
import model.EmployeeDAO;
import model.GoodsDAO;
import model.GoodsDTO;

public class GoodsWriteService {
	public void execute(HttpServletRequest request) {
		int fileSize = 1024 * 1024 * 100 ;
		String realPath = request.getServletContext()
				                 .getRealPath("goods/images");
		System.out.println(realPath);
		
		try {
			/// 객체가 만들어지면서 파일 저장
			MultipartRequest multi = 
					new MultipartRequest(request, realPath,fileSize,
							"utf-8", new DefaultFileRenamePolicy());
			
			String goodsNum = multi.getParameter("goodsNum");
			String goodsName = multi.getParameter("goodsName");
			String goodsPrice = multi.getParameter("goodsPrice");
			String goodscontent = multi.getParameter("goodsContent");
			String deliveryCost = multi.getParameter("deliveryCost");
			
			String mainImageStoreName =
					multi.getFilesystemName("mainImage");
			String mainOriginalName = 
					multi.getOriginalFileName("mainImage");
			String image1StoreName = 
					multi.getFilesystemName("image1");
			String image1OriginalName =
					multi.getOriginalFileName("image1");
			String image2StoreName = 
					multi.getFilesystemName("image2");
			String image2OriginalName =
					multi.getOriginalFileName("image2");
			String image3StoreName = 
					multi.getFilesystemName("image3");
			String image3OriginalName =
					multi.getOriginalFileName("image3");
			String goodsImages = image1StoreName + "`" 
			                   + image2StoreName + "`"
			                   + image3StoreName;
			String goodsImagesImg = image1OriginalName + "`"
					              + image2OriginalName + "`"
					              + image3OriginalName;
			System.out.println(goodsImages);
			System.out.println(goodsImagesImg);
			
			GoodsDTO dto = new GoodsDTO();
			dto.setGoodsContent(goodscontent);
			dto.setGoodsName(goodsName);
			dto.setGoodsNum(goodsNum);
			dto.setGoodsPrice(Integer.parseInt(goodsPrice));
			dto.setDeliveryCost(Integer.parseInt(deliveryCost));
			
			dto.setGoodsMainStore(mainImageStoreName);
			dto.setGoodsMainStoreImg(mainOriginalName);
			dto.setGoodsImages(goodsImages);
			dto.setGoodsImagesImg(goodsImagesImg);
			
			HttpSession session = request.getSession();
			AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("dto");
			String empId = auth.getUserId();
			EmployeeDAO empDao = new EmployeeDAO();
			String empNum = empDao.getEmpNum(empId);
			dto.setEmployeeNum(empNum);
			
			GoodsDAO dao = new GoodsDAO();
			dao.goodsInsert(dto);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
