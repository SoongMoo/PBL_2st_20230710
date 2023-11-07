package springBootMVCShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springBootMVCShopping.service.purchase.PurchaseDetailService;
import springBootMVCShopping.service.purchase.PurchaseListService;
import springBootMVCShopping.service.purchase.PurchaseStatusService;

@Controller
@RequestMapping("purchase")
public class EmpPurchaseController {
	@Autowired
	PurchaseListService purchaseListService;
	@Autowired
	PurchaseStatusService purchaseStatusService;
	@RequestMapping("purchaseList")
	public String purchaseList(Model model) {
		purchaseListService.execute(model);
		return "thymeleaf/purchase/purchaseList";
	}
	@RequestMapping("purchaseStatus")
	public String purchaseStatus(
			@RequestParam("purchaseNum")String purchaseNum) {
		purchaseStatusService.execute(purchaseNum);
		return "redirect:purchaseList";
		
	}
	@Autowired
	PurchaseDetailService purchaseDetailService;
	@RequestMapping("purchaseDetail")
	public String purchaseDetail(
			@RequestParam(value="purchaseNum") String purchaseNum
			,Model model) {
		purchaseDetailService.execute(purchaseNum, model);
		model.addAttribute("newLineChar", "\n");
		return "thymeleaf/purchase/purchaseDetail";
	}
}
