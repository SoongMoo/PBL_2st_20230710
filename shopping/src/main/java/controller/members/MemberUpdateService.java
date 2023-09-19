package controller.members;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import model.MemberDAO;
import model.MemberDTO;




public class MemberUpdateService {
	public void execute(HttpServletRequest request) {
		String memberNum = request.getParameter("memberNum");
		String memberId = request.getParameter("memberId");
		String memberPw = request.getParameter("memberPw");
		String memberName = request.getParameter("memberName");
		String memberPhone1 = request.getParameter("memberPhone1");
		String memberPhone2 = request.getParameter("memberPhone2");
		String memberAddr = request.getParameter("memberAddr");
		String memberAddrDetail = request.getParameter("memberAddrDetail");
		String memberGender = request.getParameter("memberGender");
		String memberBirth = request.getParameter("memberBirth");
		String memberEmail = request.getParameter("memberEmail");
		String memberPost = request.getParameter("memberPost");
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		try {
			date = sdf.parse(memberBirth);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(memberGender);	
		MemberDTO dto = new MemberDTO();
		dto.setMemberAddr(memberAddr);
		dto.setMemberAddrDetail(memberAddrDetail);
		dto.setMemberEmail(memberEmail);
		dto.setMemberGender(memberGender);
		dto.setMemberId(memberId);
		dto.setMemberName(memberName);
		dto.setMemberNum(memberNum);
		dto.setMemberPhone1(memberPhone1);
		dto.setMemberPhone2(memberPhone2);
		dto.setMemberPw(memberPw);
		dto.setMemberBirth(date);
		dto.setMemberPost(memberPost);
		
		MemberDAO dao = new MemberDAO();
		dao.memberUpdate(dto);
	}
}
