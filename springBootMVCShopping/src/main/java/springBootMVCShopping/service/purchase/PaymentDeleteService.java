package springBootMVCShopping.service.purchase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootMVCShopping.mapper.PurchaseMapper;

@Service
public class PaymentDeleteService {
	@Autowired
	PurchaseMapper purchaseMapper;
	public void execute(String purchaseNum) {
		int i = purchaseMapper.paymentDelete(purchaseNum);
		if(i >= 1) {
			purchaseMapper.purchaseStatusUpdate("입금대기중" ,purchaseNum);
		}
	}
}
