package controller.members;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import model.MemberDAO;
import model.MemberDTO;




public class MemberWriteService {
	public void execute(HttpServletRequest request) {
		String memberNum = request.getParameter("memberNum");
		String memberId = request.getParameter("memberId");
		String memberPw = request.getParameter("memberPw");
		String memberName = request.getParameter("memberName");
		String memberPhone = request.getParameter("memberPhone");
		String memberAddr = request.getParameter("memberAddr");
		String memberGender = request.getParameter("memberGender");
		String memberBirth = request.getParameter("memberBirth");
		String memberEmail = request.getParameter("memberEmail");
		
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		try {
			date = sdf.parse(memberBirth);
		} catch (ParseException e) {
			e.printStackTrace();
		}
				
		MemberDTO dto = new MemberDTO();
		dto.setMemberAddr(memberAddr);
		dto.setMemberEmail(memberEmail);
		dto.setMemberGender(memberGender);
		dto.setMemberId(memberId);
		dto.setMemberName(memberName);
		dto.setMemberNum(memberNum);
		dto.setMemberPhone1(memberPhone);
		dto.setMemberPw(memberPw);
		dto.setMemberBirth(date);
		
		MemberDAO dao = new MemberDAO();
		dao.memberWrite(dto);	
	}
}