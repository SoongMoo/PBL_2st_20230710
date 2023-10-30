package springBootMVCShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import springBootMVCShopping.service.goodsIpgo.GoodsIpgoListService;

@Controller
@RequestMapping("goods")
public class GoodsIpgoController {
	@Autowired
	GoodsIpgoListService goodsIpgoListService;
	@RequestMapping("goodsIpgoList")
	public @ResponseBody ModelAndView goodsIpgoList(Model model) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("jsonView");
		goodsIpgoListService.execute(model);
		return mav;
	}
}
