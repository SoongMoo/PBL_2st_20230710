package controller.goods;

import javax.servlet.http.HttpServletRequest;

import model.GoodsDAO;

public class GoodsDeleteService {
	public void execute(HttpServletRequest request) {
		String goodsNum = request.getParameter("num");
		GoodsDAO dao = new GoodsDAO();
		dao.goodsDelete(goodsNum);
	}
}
