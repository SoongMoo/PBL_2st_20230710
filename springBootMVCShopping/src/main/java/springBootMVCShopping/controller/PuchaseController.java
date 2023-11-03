package springBootMVCShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.service.purchase.GoodsBuyService;

@Controller
@RequestMapping("puchase")
public class PuchaseController {
	@Autowired
	GoodsBuyService goodsBuyService;
	@RequestMapping(value="goodsBuy", method=RequestMethod.POST)
	public String goodsBuy(
			@RequestParam(value="prodCk") String [] prodCk,
			HttpSession session, Model model) {
		goodsBuyService.execute(prodCk,session,model);
		return "thymeleaf/purchase/goodsOrder";
	}
}
