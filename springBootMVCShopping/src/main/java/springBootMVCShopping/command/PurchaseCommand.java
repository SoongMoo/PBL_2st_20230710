package springBootMVCShopping.command;

import lombok.Data;

@Data
public class PurchaseCommand {
	Integer sumTotalPrice;
	Integer sumDeliveryCost;
	Integer sumPrice;
	String goodsNums;
	String deliverName;
	String deliveryAddr;
	String deliveryAddrDetail;
	String deliveryPost;
	String deliveryPhone;
	String message;
}
