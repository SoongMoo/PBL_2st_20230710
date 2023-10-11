package controller.inquire;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.AuthInfoDTO;
import model.InquireDAO;
import model.InquireDTO;
import model.MemberDTO;
import model.MemberMyDAO;

public class InquireListService {
	public void execute(HttpServletRequest request) {
		String goodsNum = request.getParameter("goodsNum");
		InquireDAO dao = new InquireDAO();
		List<InquireDTO> list = dao.inquireSelectAll(goodsNum);
		request.setAttribute("goodsNum", goodsNum);
		request.setAttribute("list", list);
		request.setAttribute("newLine", "\n");
		
		HttpSession session = request.getSession();
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		if(auth != null) {
			MemberMyDAO memDao = new MemberMyDAO();
			MemberDTO dto =  memDao.memberInfo(auth.getUserId());
			request.setAttribute("memberNum", dto.getMemberNum());
		}
	}
}