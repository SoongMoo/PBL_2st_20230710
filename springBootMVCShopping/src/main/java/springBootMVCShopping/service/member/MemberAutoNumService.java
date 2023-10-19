package springBootMVCShopping.service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.command.MemberCommand;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.mapper.MemberMapper;

@Service
public class MemberAutoNumService {
	@Autowired
	MemberMapper MemberMapper;
	public void execute(Model model) {
		String memberNum = MemberMapper.memberAutoNum();
		MemberCommand dto = new MemberCommand();
		dto.setMemberNum(memberNum);
		model.addAttribute("memberCommand", dto);
	}
}
