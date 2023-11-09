package springBootMVCShopping.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.domain.ReviewDTO;
import springBootMVCShopping.service.goods.GoodsDetailService;
import springBootMVCShopping.service.review.ReviewDeleteService;
import springBootMVCShopping.service.review.ReviewDetailService;
import springBootMVCShopping.service.review.ReviewUpdateService;
import springBootMVCShopping.service.review.ReviewWriteService;

@Controller
@RequestMapping("review")
public class ReviewController {
	@Autowired
	GoodsDetailService goodsDetailService;
	@RequestMapping(value="goodsReview" , method=RequestMethod.GET)
	public String goodsReview(
			@ModelAttribute("goodsNum") String goodsNum,
			@ModelAttribute("purchaseNum")String purchaseNum
			,Model model){
		goodsDetailService.execute(goodsNum, model);
		return "thymeleaf/review/goodsReview";
	}
	@Autowired
	ReviewWriteService reviewWriteService;
	@RequestMapping(value = "reviewWrite", method = RequestMethod.POST)
	public String reviewWrite(
			@RequestParam(value="goodsNum") String goodsNum,
			@RequestParam(value="reviewContent") String reviewContent,
			@RequestParam(value="purchaseNum") String purchaseNum,
			HttpSession session) {
		reviewWriteService.execute(goodsNum,reviewContent,purchaseNum,session );
		return "redirect:/purchase/orderList";
	}
	
	
	
	@RequestMapping(value="goodsReviewUpdate", method =RequestMethod.GET)
	public String goodsReviewUpdate(
			@ModelAttribute(value="reviewNum") String reviewNum,
			@RequestParam(value="goodsNum") String goodsNum,
			Model model) {
		goodsDetailService.execute(goodsNum, model);
		return "thymeleaf/review/goodsReviewUpdate";
	}
	
	@Autowired
	ReviewDetailService reviewDetailService;
	@RequestMapping(value="goodsReviewUpdate", method =RequestMethod.POST)
	public void goodsReviewUpdate(
			@RequestParam(value="reviewNum") Integer reviewNum
			,HttpServletResponse response) {
		ReviewDTO dto = reviewDetailService.execute(reviewNum);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String reviewDate = sdf.format(dto.getReviewDate());
		response.setCharacterEncoding("utf-8");
		String reviewJson   = "{\"reviewNum\":\"" + dto.getReviewNum() + "\"";
			   reviewJson  += " ,\"reviewContent\":\"" + dto.getReviewContent() + "\"";
			   reviewJson  += " ,\"reviewDate\":\"" + reviewDate + "\"}";
		try {
			response.getWriter().print(reviewJson);
		} catch (IOException e) { 
			e.printStackTrace();
		};	   
	}

	@Autowired
	ReviewDeleteService reviewDeleteService ;
	@GetMapping("goodsReviewDelete")
	public String goodsReviewDelete(
			@RequestParam(value="reviewNum") String reviewNum) {
		reviewDeleteService.execute(reviewNum);
		return "redirect:/purchase/orderList";
	}
	@Autowired
	ReviewUpdateService reviewUpdateService;
	@RequestMapping(value="goodsReviewModify", method =RequestMethod.POST)
	public String goodsReviewUpdate(
			@RequestParam(value="reviewNum") Integer reviewNum,
			@RequestParam(value="reviewContent") String reviewContent
			) {
		reviewUpdateService.execute(reviewNum, reviewContent);
		return "redirect:/purchase/orderList";
	}
}















