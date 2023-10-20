package springBootMVCShopping.service.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import springBootMVCShopping.command.EmployeeCommand;
import springBootMVCShopping.domain.EmployeeDTO;
import springBootMVCShopping.mapper.EmployeeMapper;

@Service
public class EmployeeInsertService {
	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	EmployeeMapper employeeMapper;
	public void execute(EmployeeCommand employeeCommand) {
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEmpAddr(employeeCommand.getEmpAddr());
		dto.setEmpAddrDetail(employeeCommand.getEmpAddrDetail());
		dto.setEmpEmail(employeeCommand.getEmpEmail());
		dto.setEmpId(employeeCommand.getEmpId());
		dto.setEmpName(employeeCommand.getEmpName());
		dto.setEmpNum(employeeCommand.getEmpNum());
		dto.setEmpPhone(employeeCommand.getEmpPhone());
		dto.setEmpPost(employeeCommand.getEmpPost());
		dto.setEmpPw( passwordEncoder.encode(employeeCommand.getEmpPw()));
		dto.setEmpJumin(employeeCommand.getEmpJumin());
		employeeMapper.employeeInsert(dto);
	}
}































