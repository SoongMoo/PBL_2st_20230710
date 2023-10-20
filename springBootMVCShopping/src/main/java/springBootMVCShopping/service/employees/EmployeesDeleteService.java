package springBootMVCShopping.service.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootMVCShopping.mapper.EmployeeMapper;
@Service
public class EmployeesDeleteService {
	@Autowired
	EmployeeMapper employeeMapper;
	public void execute(String empsDel []) {
		employeeMapper.employeesDelete(empsDel);
	}
}
