package springBootMVCShopping.service.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.domain.StartEndPageDTO;
import springBootMVCShopping.mapper.MemberMapper;
import springBootMVCShopping.service.StartEndPageService;

@Service
public class MemberListService {
	@Autowired
	MemberMapper memberMapper;
	String searchWord;
	@Autowired
	StartEndPageService startEndPageService;
	public void execute(Model model, String searchWord, int page) {
		if(searchWord != null ) {
			this.searchWord = searchWord.trim();
		}
		StartEndPageDTO sepDTO = startEndPageService.execute(page, this.searchWord);
 		int count = memberMapper.memberCount(this.searchWord);
		
 		List<MemberDTO> list = memberMapper.selectAll(sepDTO);
 		startEndPageService.execute(page, count, model, list, this.searchWord);
	}
}
