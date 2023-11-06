package springBootMVCShopping.domain;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("payment")
public class PaymentDTO {
	String purchaseNum;
	String confirmnumber;
	String cardnum;
	String tid;
	String totalprice;
	String resultmessage;
	String paymethod;
	String appldate;
	String appltime;
	String purchasename;
}
