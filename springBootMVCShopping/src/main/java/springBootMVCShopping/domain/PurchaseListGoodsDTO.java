package springBootMVCShopping.domain;

import org.apache.ibatis.type.Alias;
import org.checkerframework.checker.units.qual.A;

import lombok.Data;

@Data
@Alias("purchaseListGoods")

public class PurchaseListGoodsDTO {
	PurchaseListDTO purchaseList;
	GoodsDTO goods;
	ReviewDTO review;
}
