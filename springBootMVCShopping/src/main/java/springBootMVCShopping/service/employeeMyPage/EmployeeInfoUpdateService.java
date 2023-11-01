package springBootMVCShopping.service.employeeMyPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.EmployeeCommand;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.EmployeeDTO;
import springBootMVCShopping.mapper.EmployeeMyMapper;

@Service
public class EmployeeInfoUpdateService {
	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	EmployeeMyMapper employeeMyMapper;
	public int execute(EmployeeCommand employeeCommand , HttpSession session, BindingResult result) {
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		if(! passwordEncoder.matches(employeeCommand.getEmpPw(), auth.getUserPw())) {
			result.rejectValue("empPw", "employeeCommand.empPw", "비밀번호가 틀렸습니다.");
			return 0;
		}else {
			
			EmployeeDTO dto = new EmployeeDTO();
			
			dto.setEmpAddr(employeeCommand.getEmpAddr());
			dto.setEmpAddrDetail(employeeCommand.getEmpAddrDetail());
			dto.setEmpEmail(employeeCommand.getEmpEmail());
			dto.setEmpId(employeeCommand.getEmpId());
			dto.setEmpJumin(employeeCommand.getEmpJumin());
			dto.setEmpName(employeeCommand.getEmpName());
			dto.setEmpNum(employeeCommand.getEmpNum());
			dto.setEmpPhone(employeeCommand.getEmpPhone());
			dto.setEmpPost(employeeCommand.getEmpPost());
			dto.setEmpPw(employeeCommand.getEmpPw());
			dto.setEmpRegiDate(employeeCommand.getEmpRegiDate());
			
			employeeMyMapper.employeeInfoUpdate(dto);
			return 1;
		}
		
	}
}
