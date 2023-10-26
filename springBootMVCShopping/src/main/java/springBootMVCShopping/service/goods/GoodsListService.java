package springBootMVCShopping.service.goods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.domain.GoodsDTO;
import springBootMVCShopping.mapper.GoodsMapper;

@Service
public class GoodsListService {
	@Autowired
	GoodsMapper goodsMapper;
	String searchWord;
	public void execute(String searchWord , Model model) {
		this.searchWord = searchWord;
		List<GoodsDTO> list = goodsMapper.allSelect();	
		model.addAttribute("dtos", list);
		
		model.addAttribute("searchWord", this.searchWord);
	}
}
