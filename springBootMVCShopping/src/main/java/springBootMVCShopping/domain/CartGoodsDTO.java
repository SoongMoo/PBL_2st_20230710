package springBootMVCShopping.domain;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("cartGoodsDTO")
public class CartGoodsDTO {
	CartDTO cartDTO;
	GoodsDTO goodsDTO;
	Integer totalPrice;
}
