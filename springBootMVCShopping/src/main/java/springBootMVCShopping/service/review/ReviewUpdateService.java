package springBootMVCShopping.service.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootMVCShopping.domain.ReviewDTO;
import springBootMVCShopping.repository.ReviewRepository;
@Service
public class ReviewUpdateService {
	@Autowired
	ReviewRepository reviewRepository;
	public void execute(Integer reviewNum,String reviewContent) {
		ReviewDTO dto = new ReviewDTO();
		dto.setReviewNum(reviewNum);
		dto.setReviewContent(reviewContent);
		reviewRepository.reviewUpdate(dto);
	}
}
