package springBootMVCShopping.domain;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("goods")
public class GoodsDTO {
	String goodsNum;
	String goodsName;
	Integer goodsPrice;
	Integer deliveryCost;
	String goodsContent;
	String empNum;
	
	String goodsMainStore;
	String goodsMainStoreImg;
	String goodsImages;
	String goodsImagesImg;
	int visitCount;
	Date goodsRegist;
	String updateEmpNum;
	Date goodsUpdateDate;
}
