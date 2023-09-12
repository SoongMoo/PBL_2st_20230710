package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	String jdbcDriver;
	String jdbcURL;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;
	public  UserDAO() {
		jdbcDriver="oracle.jdbc.driver.OracleDriver";
		jdbcURL="jdbc:oracle:thin:@localhost:1521:xe";
	}
	public Connection getConnection() {
		Connection conn= null;
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(jdbcURL,"hk1234","oracle");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	public void userInsert(MemberDTO dto) {
		con = getConnection();
		sql = " insert into members(MEMBER_NUM,MEMBER_ID,MEMBER_PW"
			+ "                    ,MEMBER_NAME, MEMBER_PHONE1"
			+ "                    ,MEMBER_PHONE2,MEMBER_ADDR "
			+ "					   ,member_addr_detail,member_post"
			+ "                    ,GENDER,MEMBER_EMAIL"
			+ "                    ,MEMBER_BIRTH,Member_regist"
			+ "					   ,point) "
			+ " values(()"
			+ ",?,?,?,?,?,?,?,?,?,?,?,now(),0)";
	}
	
	
	
	
	
	
	
	
	
}
