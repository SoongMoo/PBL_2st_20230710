package controller.user;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import model.MemberDTO;
import model.UserDAO;

public class UserWriteService {
	public void execute(HttpServletRequest request) {
		try {
			request.setCharacterEncoding("utf-8");
		}catch(Exception e) {}
		String memberId = request.getParameter("memberId");
		String memberPw = request.getParameter("memberPw");
		String memberName = request.getParameter("memberName");
		String memberPhone1 = request.getParameter("memberPhone1");
		String memberPhone2 = request.getParameter("memberPhone2");
		String memberAddr = request.getParameter("memberAddr");
		String memberAddrDetail = request.getParameter("memberAddrDetail");
		String memberPost = request.getParameter("memberPost");
		String memberEmail = request.getParameter("memberEmail");
		String memberBirth = request.getParameter("memberBirth");
		String memberGender = request.getParameter("memberGender");
		
		MemberDTO dto = new MemberDTO();
		dto.setMemberAddr(memberAddr);
		dto.setMemberAddrDetail(memberAddrDetail);
		dto.setMemberEmail(memberEmail);
		dto.setMemberGender(memberGender);
		dto.setMemberId(memberId);
		dto.setMemberName(memberName);
		dto.setMemberPhone1(memberPhone1);
		dto.setMemberPhone2(memberPhone2);
		dto.setMemberPost(memberPost);
		dto.setMemberPw(memberPw);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = sdf.parse(memberBirth);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		dto.setMemberBirth(date);
		
		UserDAO dao = new UserDAO();
		dao.userInsert(dto);
		
	}
}
