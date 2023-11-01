package springBootMVCShopping.service.employeeMyPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.EmployeeCommand;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.EmployeeDTO;
import springBootMVCShopping.mapper.EmployeeMyMapper;

@Service
public class EmployeeInfoService {
	@Autowired
	EmployeeMyMapper employeeMyMapper;
	public void execute(HttpSession session, Model model) {
	
		AuthInfoDTO authInfo = (AuthInfoDTO)session.getAttribute("auth");
		String empId = authInfo.getUserId();
		
		EmployeeDTO dto = employeeMyMapper.employeeInfo(empId);
		EmployeeCommand employeeCommand = new EmployeeCommand();
		employeeCommand.setEmpAddr(dto.getEmpAddr());
		employeeCommand.setEmpAddrDetail(dto.getEmpAddrDetail());
		employeeCommand.setEmpEmail(dto.getEmpEmail());
		employeeCommand.setEmpId(dto.getEmpId());
		employeeCommand.setEmpJumin(dto.getEmpJumin());
		employeeCommand.setEmpName(dto.getEmpName());
		employeeCommand.setEmpNum(dto.getEmpNum());
		employeeCommand.setEmpPhone(dto.getEmpPhone());
		employeeCommand.setEmpPost(dto.getEmpPost());
		employeeCommand.setEmpRegiDate(dto.getEmpRegiDate());
		model.addAttribute("employeeCommand", employeeCommand);
		
		
		
		
		
	}
}
