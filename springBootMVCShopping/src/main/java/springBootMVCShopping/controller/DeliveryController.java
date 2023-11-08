package springBootMVCShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import springBootMVCShopping.command.DeliveryCommand;
import springBootMVCShopping.service.delivery.DeliveryInsertService;

@Controller
@RequestMapping("delivery")
public class DeliveryController {
	@Autowired
	DeliveryInsertService deliveryInsertService;
	@PostMapping("deliveryAction")
	public String deliveryAction(DeliveryCommand deliveryCommand) {
		deliveryInsertService.execute(deliveryCommand);
		return "redirect:/purchase/purchaseDetail?purchaseNum="+deliveryCommand.getPurchaseNum();
	}
}
