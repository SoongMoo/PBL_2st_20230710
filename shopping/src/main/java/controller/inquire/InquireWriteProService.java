package controller.inquire;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.AuthInfoDTO;
import model.InquireDAO;
import model.InquireDTO;
import model.MemberDTO;
import model.MemberMyDAO;

public class InquireWriteProService {
	public void execute(HttpServletRequest request) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String inquireSubject = request.getParameter("inquireSubject");
		String inquireContent = request.getParameter("inquireContent");
		String queryType = request.getParameter("queryType");
		String goodsNum = request.getParameter("goodsNum");
		
		HttpSession session = request.getSession();
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		MemberMyDAO memDao = new MemberMyDAO();
		MemberDTO memDto = memDao.memberInfo(auth.getUserId());
		
		InquireDTO dto =  new InquireDTO();	
		dto.setGoodsNum(goodsNum);
		dto.setInquireContent(inquireContent);
		dto.setInquireKind(queryType);
		dto.setInquireSubject(inquireSubject);
		dto.setMemberNum(memDto.getMemberNum());
		
		InquireDAO dao = new InquireDAO();
		dao.inquireInsert(dto);
	}
}
