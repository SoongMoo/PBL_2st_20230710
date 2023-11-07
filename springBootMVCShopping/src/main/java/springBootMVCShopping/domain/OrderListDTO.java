package springBootMVCShopping.domain;

import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("orderList")
public class OrderListDTO {
	PurchaseDTO purchaseDTO; // 1
	PaymentDTO paymentDTO;
	List<PurchaseListGoodsDTO> purchaseListGoodsDTOs; // n
}
