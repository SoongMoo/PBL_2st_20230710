package springBootMVCShopping.service.goods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.domain.GoodsDTO;
import springBootMVCShopping.domain.StartEndPageDTO;
import springBootMVCShopping.mapper.GoodsMapper;
import springBootMVCShopping.service.StartEndPageService;

@Service
public class GoodsListService {
	@Autowired
	GoodsMapper goodsMapper;
	@Autowired
	StartEndPageService startEndPageService;
	String searchWord;
	public void execute(String searchWord , Model model, int page) {
		if(searchWord != null ) {
			this.searchWord = searchWord.trim();
		}
		StartEndPageDTO sepDTO = startEndPageService.execute(page, this.searchWord);
		List<GoodsDTO> list = goodsMapper.allSelect(sepDTO);	
		
		int count = goodsMapper.goodsCount(this.searchWord);
		startEndPageService.execute(page, count, model, list, this.searchWord);
	}
}
