package springBootMVCShopping.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import springBootMVCShopping.domain.GoodsIpgoDTO;

@Mapper
public interface GoodsIpgoMapper {
	public List<GoodsIpgoDTO> goodsIpgoAllSelect();
}
