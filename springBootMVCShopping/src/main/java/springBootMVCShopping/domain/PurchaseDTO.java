package springBootMVCShopping.domain;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("purchase")
public class PurchaseDTO {
	String purchaseNum;
	Date purchaseDate;
	Integer purchasePrice;
	String deliveryAddr;
	String deliveryAddrDetail;
	String deliveryPost;
	String deliveryPhone;
	String message;
	String purchaseStatus;
	String memberNum;
	String deliveryName;
	
	String userEmail;
	String purchaseName;
	
	
}
