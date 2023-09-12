package controller.members;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import model.MemberDAO;
import model.MemberDTO;




public class MemberListService {
	public void execute(HttpServletRequest request) {
		MemberDAO dao = new MemberDAO();
		List<MemberDTO> list = dao.selectAll();
		request.setAttribute("list", list);
	}
}
