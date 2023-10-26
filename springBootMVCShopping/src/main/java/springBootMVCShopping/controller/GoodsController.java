package springBootMVCShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.GoodsCommand;
import springBootMVCShopping.service.goods.GoodsDeleteService;
import springBootMVCShopping.service.goods.GoodsDetailService;
import springBootMVCShopping.service.goods.GoodsListService;
import springBootMVCShopping.service.goods.GoodsUpdateService;
import springBootMVCShopping.service.goods.GoodsWriteService;

@Controller
@RequestMapping("goods")
public class GoodsController {
	@Autowired
	GoodsWriteService goodsWriteService;
	@Autowired
	GoodsListService goodsListService;
	@Autowired
	GoodsDetailService goodsDetailService;
	@Autowired
	GoodsUpdateService goodsUpdateService;
	@Autowired
	GoodsDeleteService goodsDeleteService;
	@RequestMapping("goodsDel/{goodsNum}")
	public String goodsDel(@PathVariable("goodsNum") String goodsNum) {
		goodsDeleteService.execute(goodsNum);
		return "redirect:../goodsList";
	}
	@PostMapping("goodsUpdate")
	public String goodsUpdate(GoodsCommand goodsCommand,HttpSession session) {
		goodsUpdateService.execute(goodsCommand, session);
		return "redirect:goodsDetail?goodsNum="+goodsCommand.getGoodsNum();
	}
	
	@GetMapping("goodsUpdate")
	public String goodsUpdate(@RequestParam("goodsNum") String goodsNum, Model model) {
		goodsDetailService.execute(goodsNum, model);
		return "thymeleaf/goods/goodsModify";
	}
	@GetMapping("goodsDetail")
	public String goodsDetail(
			@RequestParam("goodsNum") String goodsNum, Model model) {
		goodsDetailService.execute(goodsNum, model);
		return "thymeleaf/goods/goodsInfo";
	}
	@RequestMapping(value="goodsList" , method=RequestMethod.GET)
	public String  goodsList(Model model) {
		goodsListService.execute(null, model);
		return "thymeleaf/goods/goodsList";
	}
	@GetMapping("goodsWrite")
	public String goodsWrite() {
		return "thymeleaf/goods/goodsForm";
	}
	@RequestMapping(value="goodsWrite" , method=RequestMethod.POST)
	public String goodsWrite(GoodsCommand goodsCommand,
			HttpSession session) {
		goodsWriteService.execute(goodsCommand, session);
		return "redirect:goodsList";
	}
}
