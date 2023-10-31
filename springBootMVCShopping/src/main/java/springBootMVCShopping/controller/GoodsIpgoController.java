package springBootMVCShopping.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.GoodsIpgoCommand;
import springBootMVCShopping.service.goodsIpgo.GoodsIpgoAutoNumservice;
import springBootMVCShopping.service.goodsIpgo.GoodsIpgoListService;
import springBootMVCShopping.service.goodsIpgo.GoodsIpgoService;
import springBootMVCShopping.service.goodsIpgo.GoodsItemService;

@Controller
@RequestMapping("goods")
public class GoodsIpgoController {
	@Autowired
	GoodsIpgoAutoNumservice goodsIpgoAutoNumservice;
	@Autowired
	GoodsItemService goodsItemService;
	@Autowired
	GoodsIpgoListService goodsIpgoListService;
	@Autowired
	GoodsIpgoService goodsIpgoService;
	@RequestMapping(value="goodsIpgo",method = RequestMethod.GET )
	public String goodsIpgo(Model model) {
		goodsIpgoAutoNumservice.execute(model);
		return "thymeleaf/goodsIpgo/goodsIpgo";
	}
	@GetMapping(value="goodsItem")
	public String goodsItem() {
		return "thymeleaf/goodsIpgo/goodsItem";
	}
	@PostMapping(value="goodsItemList")
	@ResponseBody
	public Map<String, Object> goodsItem(
			@RequestParam(value = "searchWord", required = false) String searchWord,
			@RequestParam(value = "page" , required = false, defaultValue = "1" ) int page) {
		Map<String, Object> map = goodsItemService.execute(searchWord, page);
		return map;
	}
	@RequestMapping(value="ipgoRegist",method = RequestMethod.POST )
	public String ipgoRegist(GoodsIpgoCommand goodsIpgoCommand, HttpSession session) {
		goodsIpgoService.execute(goodsIpgoCommand, session);
		return "redirect:goodsIpgoList";
	}
	
	@GetMapping("goodsIpgoList")
	public String g이숭무oodsIpgoList() {
		return "thymeleaf/goodsIpgo/goodsIpgoList";
	}

	@PostMapping("goodsIpgoList")
	public ModelAndView goodsIpgoList(Model model) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("jsonView");
		goodsIpgoListService.execute(model);
		return mav;
	}

	
}
