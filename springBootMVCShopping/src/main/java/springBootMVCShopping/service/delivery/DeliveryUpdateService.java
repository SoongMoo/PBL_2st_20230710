package springBootMVCShopping.service.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootMVCShopping.repository.DeliveryRepository;

@Service
public class DeliveryUpdateService {
	@Autowired
	DeliveryRepository deliveryRepository;
	public void execute(String purchaseNum) {
		deliveryRepository.deliveryStateUpdate(purchaseNum);
	}
}
