package springBootMVCShopping.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import springBootMVCShopping.domain.EmployeeDTO;
import springBootMVCShopping.domain.StartEndPageDTO;


@Mapper
public interface EmployeeMapper {
	public Integer employeeInsert(EmployeeDTO dto);
	public String autoNum();
	public List<EmployeeDTO> employeeAllSelect(StartEndPageDTO dto);
	public EmployeeDTO employeeOneSelect(String empNum);
	public Integer employeeUpdate(EmployeeDTO dto);
	public Integer employeeDelete(String empNum);
	public Integer employeesDelete(String empsDel[]);
	public Integer employeeCount(String searchWord);
}





























