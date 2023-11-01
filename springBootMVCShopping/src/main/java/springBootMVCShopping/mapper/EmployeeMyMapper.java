package springBootMVCShopping.mapper;

import org.apache.ibatis.annotations.Mapper;

import springBootMVCShopping.domain.EmployeeDTO;

@Mapper
public interface EmployeeMyMapper {
	public EmployeeDTO employeeInfo(String empId);
	public int employeePwUpdate(String userPw, String empId);
	public int employeeInfoUpdate(EmployeeDTO dto);
}
