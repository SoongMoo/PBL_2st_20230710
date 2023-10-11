package controller.inquire;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import model.InquireDAO;
import model.InquireDTO;

public class InquireListEmpService {
	public void execute(HttpServletRequest request) {
		InquireDAO dao = new InquireDAO();
		List<InquireDTO> list = dao.inquireSelectAll(null);
		request.setAttribute("dtos", list);
	}
}
