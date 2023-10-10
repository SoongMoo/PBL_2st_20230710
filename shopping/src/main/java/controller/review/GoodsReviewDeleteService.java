package controller.review;

import javax.servlet.http.HttpServletRequest;

import model.ReviewDAO;

public class GoodsReviewDeleteService {
	public void execute(HttpServletRequest request) {
		String reviewNum = request.getParameter("reviewNum");
		ReviewDAO dao = new ReviewDAO();
		dao.reviewDelete(reviewNum);
	}
}
