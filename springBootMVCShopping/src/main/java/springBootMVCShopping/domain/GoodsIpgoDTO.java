package springBootMVCShopping.domain;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("goodsIpgo")
public class GoodsIpgoDTO {
	String ipgoNum;
	String goodsNum;
	Integer ipgoQty;
	Date ipgoDate;
	Date madeDate;
	Integer ipgoPrice;
	String empNum;
}
