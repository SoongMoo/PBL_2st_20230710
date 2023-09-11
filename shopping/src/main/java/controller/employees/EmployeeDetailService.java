package controller.employees;

import javax.servlet.http.HttpServletRequest;

import model.EmployeeDAO;
import model.EmployeeDTO;

public class EmployeeDetailService {
	public void execute(HttpServletRequest request) {
		String empNum = request.getParameter("num");
		EmployeeDAO dao = new EmployeeDAO();
		EmployeeDTO dto = dao.selectOne(empNum);
		request.setAttribute("dto", dto);
	}
}
