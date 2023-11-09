package springBootMVCShopping.service.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootMVCShopping.repository.ReviewRepository;

@Service
public class ReviewDeleteService {
	@Autowired
	ReviewRepository reviewRepository;
	public void execute(String reviewNum) {
		reviewRepository.reviewDelete(Integer.parseInt(reviewNum));
	}
}
