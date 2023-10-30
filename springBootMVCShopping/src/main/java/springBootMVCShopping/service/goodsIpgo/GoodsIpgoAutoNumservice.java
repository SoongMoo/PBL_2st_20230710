package springBootMVCShopping.service.goodsIpgo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.mapper.GoodsMapper;

@Service
public class GoodsIpgoAutoNumservice {
	@Autowired
	GoodsMapper goodsMapper;
	public void execute(Model model) {
		String num = goodsMapper.goodsAutoNum("goodsipgo", "ipgo_num", "hk");
		model.addAttribute("ipgoNum", num);
	}
}
