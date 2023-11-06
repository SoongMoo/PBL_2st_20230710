package springBootMVCShopping.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

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
import springBootMVCShopping.domain.PurchaseDTO;
import springBootMVCShopping.service.IniPayReqService;
import springBootMVCShopping.service.purchase.GoodsBuyService;
import springBootMVCShopping.service.purchase.GoodsOrderService;
import springBootMVCShopping.service.purchase.IniPayReturnService;

@Controller
@RequestMapping("purchase")
public class PurchaseController {
	@Autowired
	GoodsBuyService goodsBuyService;
	@Autowired
	IniPayReqService iniPayReqService;
	@Autowired
	GoodsOrderService goodsOrderService;
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
		PurchaseDTO dto = goodsOrderService.execute(purchaseCommand,session, model);
		System.out.println("goodsOrder 끝");
		String purchaseName = "";
		try {
			purchaseName = URLEncoder.encode(dto.getPurchaseName(), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return "redirect:paymentOk?purchaseNum="+dto.getPurchaseNum()
		                         +"&purchaseName="+purchaseName
		                         +"&buyeremail="+dto.getUserEmail();
		
	}
	@GetMapping("paymentOk")
	public String paymentOk(
			@RequestParam(value="purchaseNum") String purchaseNum
			,@RequestParam(value="purchaseName") String purchaseName
			,@RequestParam(value="buyeremail") String buyeremail
			,Model model) {
		try {
			iniPayReqService.execute(purchaseNum,purchaseName, buyeremail ,model); // 호출메서드
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "thymeleaf/purchase/payment";
	}
	@Autowired
	IniPayReturnService iniPayReturnService; 
	@GetMapping("INIstdpay_pc_return")
	public String payReturn(HttpServletRequest request,HttpSession session, Model model) {
		iniPayReturnService.execute(request, session, model);
		return "thymeleaf/purchase/buyfinished";
	}
	@GetMapping("close")
	public String close() {
		return "thymeleaf/purchase/close";
	}
	
}
