package springBootMVCShopping.domain;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Alias("purchase")
@NoArgsConstructor // default생성자 
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
	
	public PurchaseDTO(String purchaseNum, Date purchaseDate, Integer purchasePrice, String deliveryAddr,
			String deliveryAddrDetail, String deliveryPost, String deliveryPhone, String message, String purchaseStatus,
			String memberNum, String deliveryName) {
		this.purchaseNum = purchaseNum;
		this.purchaseDate = purchaseDate;
		this.purchasePrice = purchasePrice;
		this.deliveryAddr = deliveryAddr;
		this.deliveryAddrDetail = deliveryAddrDetail;
		this.deliveryPost = deliveryPost;
		this.deliveryPhone = deliveryPhone;
		this.message = message;
		this.purchaseStatus = purchaseStatus;
		this.memberNum = memberNum;
		this.deliveryName = deliveryName;
	}
}
