package springBootMVCShopping.service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootMVCShopping.command.MemberCommand;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.mapper.MemberMapper;
@Service
public class MemberUpdateService {
	@Autowired
	MemberMapper memberMapper;
	public void execute(MemberCommand memberCommand) {
		MemberDTO dto = new MemberDTO();
		dto.setGender(memberCommand.getMemberGender());
		dto.setMemberAddr(memberCommand.getMemberAddr());
		dto.setMemberAddrDetail(memberCommand.getMemberAddr2());
		dto.setMemberBirth(memberCommand.getMemberBirth());
		dto.setMemberEmail(memberCommand.getMemberEmail());
		dto.setMemberName(memberCommand.getMemberName());
		dto.setMemberNum(memberCommand.getMemberNum());
		dto.setMemberPhone1(memberCommand.getMemberPhone1());
		dto.setMemberPhone2(memberCommand.getMemberPhone2());
		dto.setMemberPost(memberCommand.getMemberPost());
		dto.setPoint(memberCommand.getPoint());
		memberMapper.memberUpdate(dto);
	}
}
