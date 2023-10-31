package springBootMVCShopping.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import springBootMVCShopping.domain.GoodsIpgoDTO;

@Mapper
public interface GoodsIpgoMapper {
	public List<GoodsIpgoDTO> goodsIpgoAllSelect();
	public int goodsIpgoInsert(GoodsIpgoDTO dto);
	public GoodsIpgoDTO selectIpgoGoods(String ipgoNum, String goodsNum);
	public int ipgoGoodsNumDelete(@Param("ipgoNum") String ipgoNum, 
								  @Param("goodsNum") String goodsNum);
	public int goodsIpgoUpdate(GoodsIpgoDTO dto);
}
