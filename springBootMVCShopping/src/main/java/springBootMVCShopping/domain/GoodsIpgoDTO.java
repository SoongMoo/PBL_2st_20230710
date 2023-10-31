package springBootMVCShopping.domain;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Alias("goodsIpgo")
@AllArgsConstructor
@NoArgsConstructor
public class GoodsIpgoDTO {
	String ipgoNum;
	String goodsNum;
	Integer ipgoQty;
	Date ipgoDate;
	Date madeDate;
	Integer ipgoPrice;
	String empNum;
}
