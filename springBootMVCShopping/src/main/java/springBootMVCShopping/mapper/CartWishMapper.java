package springBootMVCShopping.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import springBootMVCShopping.domain.GoodsDTO;

@Mapper
public interface CartWishMapper {
	public List<GoodsDTO> goodsSelectAll(String goodsNum);
	public Integer wishGoodsSelect(String goodsNum,String memberNum);
	public int wishInsert(String goodsNum,String memberNum);
	public int wishDelete(String goodsNum,String memberNum);
	public List<GoodsDTO> wishGoodsList(String memberNum);
	public int wishGoodsDeletes(@Param("goodsNums") String wishGoodsDels[],
			@Param("memberNum") String memberNum);
}
