package controller.goods;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import model.GoodsDAO;
import model.GoodsDTO;

public class GoodsDeleteService {
	public void execute(HttpServletRequest request) {
		String goodsNum = request.getParameter("num");
		GoodsDAO dao = new GoodsDAO();
		GoodsDTO dto = dao.selectOne(goodsNum);
		
		String mainImage = dto.getGoodsMainStore();
		String images[] = dto.getGoodsImages().split("`");
		int i = dao.goodsDelete(goodsNum);
		if(i > 0 ) {
			String realPath = 
					request.getServletContext()
						   .getRealPath("goods/images");
			File file= new File(realPath + "/" + mainImage);
			if(file.exists()) file.delete();
	
			if (images.length > 0 ) {
				for(String fileName : images) {
					file= new File(realPath + "/" + fileName);
					if(file.exists()) file.delete();
				}
			}
		}
	}
}
