package springBootMVCShopping.service.goodsIpgo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootMVCShopping.domain.GoodsIpgoDTO;
import springBootMVCShopping.mapper.GoodsIpgoMapper;
@Service
public class GoodsIpgoDetailService {
	@Autowired
	GoodsIpgoMapper goodsIpgoMapper;
	public GoodsIpgoDTO execute(String ipgoNum,String goodsNum) {
		GoodsIpgoDTO dto = goodsIpgoMapper.selectIpgoGoods(ipgoNum, goodsNum);
		return dto;
	}
}
