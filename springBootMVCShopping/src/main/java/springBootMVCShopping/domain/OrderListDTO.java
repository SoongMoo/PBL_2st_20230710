package springBootMVCShopping.domain;

import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.Data;
import springBootMVCShopping.command.DeliveryCommand;

@Data
@Alias("orderList")
public class OrderListDTO {
	PurchaseDTO purchaseDTO; // 1
	PaymentDTO paymentDTO;
	DeliveryCommand delivery;
	List<PurchaseListGoodsDTO> purchaseListGoodsDTOs; // n
}
