package springBootMVCShopping.service.goods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.command.GoodsCommand;
import springBootMVCShopping.mapper.GoodsMapper;

@Service
public class GoodsAutoNumService {
	@Autowired
	GoodsMapper goodsMapper;
	public void execute(Model model) {
		String goodsNum = goodsMapper.goodsAutoNum();
		GoodsCommand goodsCommand = new GoodsCommand();
		goodsCommand.setGoodsNum(goodsNum);
		model.addAttribute("goodsCommand", goodsCommand);
	}
}
