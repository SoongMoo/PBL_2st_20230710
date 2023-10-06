package controller.review;

import javax.servlet.http.HttpServletRequest;

import model.ReviewDAO;
import model.ReviewDTO;

public class ReviewDetailService {
	public void execute(HttpServletRequest request) {
		String goodsNum = request.getParameter("goodsNum");
		String purchaseNum = request.getParameter("purchaseNum");
		ReviewDAO dao = new ReviewDAO();
		ReviewDTO dto = dao.reviewDetail(purchaseNum, goodsNum);
		request.setAttribute("dto", dto);
	}
}
