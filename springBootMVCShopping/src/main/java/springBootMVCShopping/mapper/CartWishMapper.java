package springBootMVCShopping.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import springBootMVCShopping.domain.GoodsDTO;

@Mapper
public interface CartWishMapper {
	public List<GoodsDTO> goodsSelectAll(String goodsNum);
	public Integer wishGoodsSelect(String goodsNum,String memberNum);
	public int wishInsert(String goodsNum,String memberNum);
	public int wishDelete(String goodsNum,String memberNum);
}
