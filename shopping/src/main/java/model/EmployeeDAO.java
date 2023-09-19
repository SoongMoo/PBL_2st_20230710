package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	String jdbcURL;
	String jdbcDriver;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;
	
	public EmployeeDAO() {
		jdbcDriver = "org.postgresql.Driver";
		jdbcURL = "jdbc:postgresql://localhost:5432/hkshopping";
	}
	
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(jdbcURL,"postgres", "1234");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public String empAutoNum() {
		String empNum = "";
		con = getConnection();
		sql = "select concat('emp',coalesce(substr(max(emp_num),4)::integer,1000000) + 1)"
			+ "from employees";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
			empNum = rs.getString(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return empNum; 
	}
	
	public void employeeInsert(EmployeeDTO dto) {
		con = getConnection();
		sql = "insert into employees("
				+ " emp_num, emp_name, emp_id, emp_pw,"
				+ " emp_addr, emp_addr_detail, emp_post,"
				+ " emp_phone, emp_email, emp_enter_date,"
				+ " emp_jumin)"
			+ "values(?,?,?,?,?,?,?,?,?,?,?)"; 
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getEmpNum());
			pstmt.setString(2, dto.getEmpName());
			pstmt.setString(3, dto.getEmpId() );
			pstmt.setString(4, dto.getEmpPw());
			pstmt.setString(5, dto.getEmpAddr());
			pstmt.setString(6, dto.getEmpAddrDetail());
			pstmt.setString(7, dto.getEmpPost());
			pstmt.setString(8, dto.getEmpPhone());
			pstmt.setString(9, dto.getEmpEmail());
			pstmt.setDate(10,  new java.sql.Date(dto.getEmpEnterDate().getTime()));
			pstmt.setString(11,dto.getEmpJumin());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개 행이(가) 삽입되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public List<EmployeeDTO> selectAll(){
		List<EmployeeDTO> list = new ArrayList<EmployeeDTO>();
		con = getConnection();
		sql = "select emp_num, emp_name, emp_id, emp_pw,"
			+ "	 emp_addr, emp_addr_detail, emp_post,"
			+ "	 emp_phone, emp_email, emp_enter_date,"
			+ "	 emp_jumin"
			+ " from employees";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmployeeDTO dto = new EmployeeDTO();
				///     컬럼명 또는 컬럼이 나열된 순서번호를 적어줄 수 있다. 
				dto.setEmpAddr(rs.getString(5));
				dto.setEmpAddrDetail(rs.getString(6));
				dto.setEmpEmail(rs.getString("emp_email"));
				dto.setEmpEnterDate(rs.getDate("emp_enter_date"));
				dto.setEmpId(rs.getString(3));
				dto.setEmpJumin(rs.getString(11));
				dto.setEmpName(rs.getString(2));
				dto.setEmpNum(rs.getString(1));
				dto.setEmpPhone(rs.getString(8));
				dto.setEmpPost(rs.getString(7));
				dto.setEmpPw(rs.getString(4));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public EmployeeDTO selectOne(String empNum) {
		EmployeeDTO dto = new EmployeeDTO();
		con = getConnection();
		sql = "select emp_num, emp_name, emp_id, emp_pw,"
				+ "	 emp_addr, emp_addr_detail, emp_post,"
				+ "	 emp_phone, emp_email, emp_enter_date,"
				+ "	 emp_jumin"
				+ " from employees"
				+ " where emp_num = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, empNum);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto.setEmpAddr(rs.getString(5));
				dto.setEmpAddrDetail(rs.getString(6));
				dto.setEmpEmail(rs.getString("emp_email"));
				dto.setEmpEnterDate(rs.getDate("emp_enter_date"));
				dto.setEmpId(rs.getString(3));
				dto.setEmpJumin(rs.getString(11));
				dto.setEmpName(rs.getString(2));
				dto.setEmpNum(rs.getString(1));
				dto.setEmpPhone(rs.getString(8));
				dto.setEmpPost(rs.getString(7));
				dto.setEmpPw(rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;
	}
	
	public void employeeUpdate(EmployeeDTO dto) {
		con = getConnection();
		sql = "update employees "
			+ " set emp_name = ?, emp_Addr = ? , emp_Addr_Detail = ?,"
			+ "     emp_Post = ?, emp_Phone = ?, emp_Jumin = ? "
			+ "     emp_Email = ?, emp_Enter_Date = ?"
			+ " where emp_Num = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getEmpName());
			pstmt.setString(2, dto.getEmpAddr());
			pstmt.setString(3, dto.getEmpAddrDetail());
			pstmt.setString(4, dto.getEmpPost());
			pstmt.setString(5, dto.getEmpPhone());
			pstmt.setString(7, dto.getEmpEmail());
			pstmt.setDate(8, new java.sql.Date(dto.getEmpEnterDate().getTime()));
			pstmt.setString(6,dto.getEmpJumin());
			pstmt.setString(9,dto.getEmpNum());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개 행이(가) 수정되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public String getEmpNum(String empId) {
		String empNum = "";
		con = getConnection();
		sql = " select emp_num from employees "
			+ " where emp_id = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, empId);
			rs = pstmt.executeQuery();
			rs.next();
			empNum = rs.getString(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return empNum;
	}
	public void employeeDelete(String empNum) {
		con = getConnection();
		sql = " delete from employees where emp_num = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, empNum);
			int i = pstmt.executeUpdate();
			System.out.println(i + "개 행이(가) 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
}
