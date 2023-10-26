package springBootMVCShopping.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import springBootMVCShopping.domain.GoodsDTO;

@Mapper
public interface GoodsMapper {
	public int goodsInsert(GoodsDTO dto);
	public List<GoodsDTO> allSelect();
	public GoodsDTO selectOne(String goodsNum);
	public int goodsUpdate(GoodsDTO dto);
	public int goodsDelete(String goodsNum);
}
