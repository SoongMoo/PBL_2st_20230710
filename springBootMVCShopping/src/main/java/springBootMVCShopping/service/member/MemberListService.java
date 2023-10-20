package springBootMVCShopping.service.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.mapper.MemberMapper;

@Service
public class MemberListService {
	@Autowired
	MemberMapper memberMapper;
	String searchWord;
	public void execute(Model model, String searchWord) {
		if(searchWord != null ) {
			this.searchWord = searchWord.trim();
		}
		List<MemberDTO> list = memberMapper.selectAll(this.searchWord);
		model.addAttribute("dtos", list);
		model.addAttribute("searchWord", this.searchWord);
	}
}
