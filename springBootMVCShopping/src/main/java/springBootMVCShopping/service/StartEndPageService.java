package springBootMVCShopping.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.domain.StartEndPageDTO;
@Service
public class StartEndPageService {
	int limit;
	public StartEndPageDTO execute(int page, String searchWord) {
		limit = 3; // 한페이지에 몇개를 보여줄것인지?
		// 2page == 4 ~ 6 // 1page = 1 ~ 3
 		int startRow = ((page - 1) * limit) + 1;
 		//             1      + 3     -1
 		int endRow = startRow + limit -1 ;
 		StartEndPageDTO sepDTO = new StartEndPageDTO();
 		sepDTO.setEndRow(endRow);
 		sepDTO.setSearchWord(searchWord);
 		sepDTO.setStartRow(startRow);
 		return sepDTO;
	}
	public void execute(int page, int count, Model model, 
										List list, String searchWord) {
		int limitPage = 10;
		int startPage = (int)((double)page / limitPage + 0.95 -1) * limitPage + 1 ;
		int endPage = startPage + limitPage -1 ;
		int maxPage = (int)((double)count / limit + 0.95);
		if(maxPage < endPage) endPage = maxPage;
		model.addAttribute("dtos", list);
		model.addAttribute("searchWord", searchWord);
		model.addAttribute("page", page);
		model.addAttribute("startPage", startPage);
		model.addAttribute("endPage", endPage);
		model.addAttribute("count", count);
		model.addAttribute("maxPage", maxPage);
	}
}
