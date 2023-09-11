package controller.employees;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import model.EmployeeDAO;
import model.EmployeeDTO;

public class EmployeeJoinService {
	public void execute(HttpServletRequest request) {
		try {
			// 한글 깨짐 방지
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
		}
		String empNum = request.getParameter("empNum");
		String empName = request.getParameter("empName");
		String empId = request.getParameter("empId");
		String empPw = request.getParameter("empPw");
		String empAddr = request.getParameter("empAddr");
		String empAddrDetail = request.getParameter("empAddrDetail");
		String empPost = request.getParameter("empPost");
		String empPhone = request.getParameter("empPhone");
		String empJumin = request.getParameter("empJumin");
		String empEmail = request.getParameter("empEmail");
		String empEnterDate = request.getParameter("empEnterDate");
		
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEmpAddr(empAddr);
		dto.setEmpAddrDetail(empAddrDetail);
		dto.setEmpEmail(empEmail);
		dto.setEmpId(empId);
		dto.setEmpJumin(empJumin);
		dto.setEmpName(empName);
		dto.setEmpNum(empNum);
		dto.setEmpPhone(empPhone);
		dto.setEmpPost(empPost);
		dto.setEmpPw(empPw);
		///                                          문자열의 형식
		SimpleDateFormat  sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date empDate =  null;
		try {
			// 문자열인 날짜를 날짜 형식으로 변환
			empDate = sdf.parse(empEnterDate);
		} catch (ParseException e) {}
		// 날짜형식으로 변환된 데이터를 DTO에 저장 
		dto.setEmpEnterDate(empDate);
		
		EmployeeDAO dao = new EmployeeDAO();
		dao.employeeInsert(dto);
	}
}
