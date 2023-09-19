package controller.goods;

import javax.servlet.http.HttpServletRequest;

import model.GoodsDAO;
import model.GoodsDTO;

public class GoodsDetailService {
	public void execute(HttpServletRequest request) {
		String goodsNum = request.getParameter("num");
		GoodsDAO dao = new GoodsDAO();
		GoodsDTO dto = dao.selectOne(goodsNum);
		request.setAttribute("dto", dto);
	}
}