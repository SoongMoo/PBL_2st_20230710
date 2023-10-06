package controller.review;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import model.ReviewDAO;

public class GoodsReviewUpdateService {
	public void execute(HttpServletRequest request) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String reviewNum = request.getParameter("reviewNum");
		String reviewContent = request.getParameter("reviewContent");
		ReviewDAO dao = new ReviewDAO();
		dao.reviewUpdate(reviewNum, reviewContent);
	}
}
