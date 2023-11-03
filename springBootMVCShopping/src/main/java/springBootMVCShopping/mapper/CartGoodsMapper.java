package springBootMVCShopping.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import springBootMVCShopping.domain.CartDTO;
import springBootMVCShopping.domain.CartGoodsDTO;
import springBootMVCShopping.domain.GoodsDTO;

@Mapper
public interface CartGoodsMapper {
	public GoodsDTO goodsSelect(String goodsNum);
	public CartDTO cartSelect(Integer cartNum);
	public CartGoodsDTO goodsPriceMulCartQty(@Param("goodsNum")String goodsNum,
			@Param("memberNum") String memberNum);
}
