package springBootMVCShopping.service.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.domain.ReviewDTO;
import springBootMVCShopping.repository.ReviewRepository;

@Service
public class ReviewDetailService {
	@Autowired
	ReviewRepository reviewRepository;
	public ReviewDTO execute(Integer reviewNum) {
		ReviewDTO dto = reviewRepository.reviewSelect(reviewNum);
		return dto;
	}
}
