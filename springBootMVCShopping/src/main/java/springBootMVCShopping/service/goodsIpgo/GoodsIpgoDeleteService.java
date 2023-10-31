package springBootMVCShopping.service.goodsIpgo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootMVCShopping.mapper.GoodsIpgoMapper;

@Service
public class GoodsIpgoDeleteService {
	@Autowired
	GoodsIpgoMapper goodsIpgoMapper;
	public void execute(String ipgoNum, String goodsNum) {
		goodsIpgoMapper.ipgoGoodsNumDelete(ipgoNum, goodsNum);
	}
}
