package springBootMVCShopping.service.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.ReviewDTO;
import springBootMVCShopping.repository.ReviewRepository;

@Service
public class ReviewWriteService {
	@Autowired
	ReviewRepository reviewRepository;
	public void execute(String goodsNum, String reviewContent,String purchaseNum,
			HttpSession session) {
		AuthInfoDTO auth= (AuthInfoDTO)session.getAttribute("auth");
		ReviewDTO dto = new ReviewDTO();
		dto.setGoodsNum(goodsNum);
		dto.setPurchaseNum(purchaseNum);
		dto.setReviewContent(reviewContent);
		dto.setMemberId(auth.getUserId());
		reviewRepository.reviewWrite(dto);
	}
}
