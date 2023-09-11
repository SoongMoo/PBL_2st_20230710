package controller.employees;

import javax.servlet.http.HttpServletRequest;

import model.EmployeeDAO;

public class EmployeeAutoNumService {
	public void execute(HttpServletRequest request) {
		EmployeeDAO dao = new EmployeeDAO();
		String empNum = dao.empAutoNum();
		request.setAttribute("empNum", empNum);
	}
}
