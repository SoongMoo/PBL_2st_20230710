package controller.review;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.AuthInfoDTO;
import model.ReviewDAO;
import model.ReviewDTO;

public class ReviewWriteService {
	public void execute(HttpServletRequest request) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String goodsNum = request.getParameter("goodsNum");
		String purchaseNum = request.getParameter("purchaseNum");
		String reviewContent = request.getParameter("reviewContent");
		HttpSession session = request.getSession();
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		
		ReviewDTO dto = new ReviewDTO();
		dto.setGoodsNum(goodsNum);
		dto.setMemberId(auth.getUserId());
		dto.setPurchaseNum(purchaseNum);
		dto.setReviewContent(reviewContent);
		
		ReviewDAO dao = new ReviewDAO();
		dao.reviewInsert(dto);
		
	}
}
