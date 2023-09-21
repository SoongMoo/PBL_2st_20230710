package controller.ipgo;

import javax.servlet.http.HttpServletRequest;

import model.GoodsIpgoDAO;

public class GoodsIpgoDeleteService {
	public void execute(HttpServletRequest request) {
		String ipgoNum = request.getParameter("ipgoNum");
		String goodsNum = request.getParameter("num"); 
		
		GoodsIpgoDAO dao = new GoodsIpgoDAO();
		dao.goodsIpgoDelete(ipgoNum, goodsNum);
	}
}
