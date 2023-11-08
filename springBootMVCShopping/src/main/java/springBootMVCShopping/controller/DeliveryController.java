package springBootMVCShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springBootMVCShopping.command.DeliveryCommand;
import springBootMVCShopping.service.delivery.DeliveryDeleteService;
import springBootMVCShopping.service.delivery.DeliveryInsertService;
import springBootMVCShopping.service.delivery.DeliveryUpdateService;

@Controller
@RequestMapping("delivery")
public class DeliveryController {
	@Autowired
	DeliveryInsertService deliveryInsertService;
	@Autowired
	DeliveryDeleteService deliveryDeleteService;
	@PostMapping("deliveryAction")
	public String deliveryAction(DeliveryCommand deliveryCommand) {
		deliveryInsertService.execute(deliveryCommand);
		return "redirect:/purchase/purchaseDetail?purchaseNum="+deliveryCommand.getPurchaseNum();
	}
	@PostMapping("deliveryDel")
	public String deliveryDel(
			@RequestParam("purchaseNum") String purchaseNum){
		deliveryDeleteService.execute(purchaseNum);
		
		return "redirect:/purchase/purchaseDetail?purchaseNum="+purchaseNum;
	}
	@Autowired
	DeliveryUpdateService deliveryUpdateService;
	@GetMapping("deliveryState")
	public String deliveryState(@RequestParam("purchaseNum") String purchaseNum) {
		deliveryUpdateService.execute(purchaseNum);
		return "redirect:/purchase/purchaseList";
	}
}





