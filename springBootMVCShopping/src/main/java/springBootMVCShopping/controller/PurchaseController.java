package springBootMVCShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.PurchaseCommand;
import springBootMVCShopping.service.IniPayReqService;
import springBootMVCShopping.service.purchase.GoodsBuyService;
import springBootMVCShopping.service.purchase.GoodsOrderService;
import springBootMVCShopping.service.purchase.IniPayReturnService;
import springBootMVCShopping.service.purchase.OrderProcessListService;
import springBootMVCShopping.service.purchase.PaymentDeleteService;

@Controller
@RequestMapping("purchase")
public class PurchaseController {
	@Autowired
	GoodsBuyService goodsBuyService;
	@Autowired
	IniPayReqService iniPayReqService;
	@Autowired
	GoodsOrderService goodsOrderService;
	@Autowired
	OrderProcessListService orderProcessListService;
	@RequestMapping(value="goodsBuy", method=RequestMethod.POST)
	public String goodsBuy(
			@RequestParam(value="prodCk") String [] prodCk,
			HttpSession session, Model model) {
		goodsBuyService.execute(prodCk,session,model);
		return "thymeleaf/purchase/goodsOrder";
	}
	@PostMapping("goodsOrder")
	public String goodsOrder(PurchaseCommand purchaseCommand,HttpSession session, Model model,
			HttpServletResponse response) {
		String purchaseNum = goodsOrderService.execute(purchaseCommand,session, model);
		return "redirect:paymentOk?purchaseNum="+purchaseNum;
		
	}
	@GetMapping("paymentOk")
	public String paymentOk(
			@RequestParam(value="purchaseNum") String purchaseNum
			,HttpSession session
			,Model model) {
		try {
			iniPayReqService.execute(purchaseNum,model,session); // 호출메서드
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "thymeleaf/purchase/payment";
	}
	@Autowired
	IniPayReturnService iniPayReturnService; 
	@PostMapping("INIstdpay_pc_return")
	public String payReturn(HttpServletRequest request,HttpSession session, Model model) {
		iniPayReturnService.execute(request, session, model);
		return "thymeleaf/purchase/buyfinished";
	}
	@GetMapping("close")
	public String close() {
		return "thymeleaf/purchase/close";
	}
	@RequestMapping("orderList")
	public String orderList(HttpSession session, Model model) {
		orderProcessListService.execute(session, model);
		return "thymeleaf/purchase/orderList";
	}
	@Autowired
	PaymentDeleteService paymentDeleteService;
	@RequestMapping("paymentDel")
	public String paymentDel(
			@RequestParam("purchaseNum") String purchaseNum) {
		paymentDeleteService.execute(purchaseNum);
		return "redirect:orderList";
	}
}
