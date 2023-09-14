package controller.memberMyPage;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.AuthInfoDTO;
import model.MemberDTO;
import model.MemberMyDAO;

public class MemberInfoUpdateService {
	public int execute(HttpServletRequest request) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String memberName = request.getParameter("memberName");
		String memberId = request.getParameter("memberId");
		String memberAddr = request.getParameter("memberAddr");
		String memberAddrDetail = request.getParameter("memberAddrDetail");
		String memberPost = request.getParameter("memberPost");
		String memberPhone1 = request.getParameter("memberPhone1");
		String memberPhone2 = request.getParameter("memberPhone2");
		String memberGender = request.getParameter("memberGender");
		String memberBirth = request.getParameter("memberBirth");
		String memberEmail = request.getParameter("memberEmail");
		String memberPw = request.getParameter("memberPw");
		
		HttpSession session = request.getSession();
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("dto");
		if (!auth.getUserPw().equals(memberPw)) {
			return 0;
		}else {
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
			
			MemberMyDAO dao = new MemberMyDAO();
			dao.memberInfoUpdate(dto);
			return 1;
		}
		
		
		
	}
}
