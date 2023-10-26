package springBootMVCShopping.command;

import lombok.Data;

@Data
public class GoodsCommand {
	String goodsNum;
	String goodsName;
	Integer goodsPrice;
	Integer deliveryCost;
	String goodsContent;
}
