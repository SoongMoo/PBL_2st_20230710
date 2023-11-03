package springBootMVCShopping.domain;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;
@Data
@Alias("cart")
public class CartDTO {
	Integer cartNum;
	String memberNum;
	String goodsNum;
	Integer cartQty;
	Date cartDate;
	String [] goodsNums;
}
