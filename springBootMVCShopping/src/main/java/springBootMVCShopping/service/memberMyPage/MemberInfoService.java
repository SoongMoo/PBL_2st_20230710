package springBootMVCShopping.service.memberMyPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.MemberCommand;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.mapper.MemberMyMapper;
@Service
public class MemberInfoService {
	@Autowired
	MemberMyMapper memberMyMapper; 
	public void execute(HttpSession session , Model model) {
		AuthInfoDTO authInfo = (AuthInfoDTO)session.getAttribute("auth");
		String memberId = authInfo.getUserId();
		MemberDTO dto =  memberMyMapper.memberInfo(memberId);
		MemberCommand memberCommand = new MemberCommand();
		memberCommand.setMemberAddr(dto.getMemberAddr());
		memberCommand.setMemberAddr2(dto.getMemberAddrDetail());
		memberCommand.setMemberBirth(dto.getMemberBirth());
		memberCommand.setMemberEmail(dto.getMemberEmail());
		memberCommand.setMemberGender(dto.getGender());
		memberCommand.setMemberId(dto.getMemberId());
		memberCommand.setMemberName(dto.getMemberName());
		memberCommand.setMemberNum(dto.getMemberNum());
		memberCommand.setMemberPhone1(dto.getMemberPhone1());
		memberCommand.setMemberPhone2(dto.getMemberPhone2());
		memberCommand.setMemberPost(dto.getMemberPost());
		memberCommand.setMemberRegiDate(dto.getMemberRegistDate());
		memberCommand.setPoint(dto.getPoint());
		model.addAttribute("memberCommand", memberCommand);
	}
}
