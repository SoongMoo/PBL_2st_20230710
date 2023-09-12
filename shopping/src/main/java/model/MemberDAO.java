package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.MemberDTO;

public class MemberDAO {
	String jdbcDriver;
	String jdbcURL;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;
	public MemberDAO() {
		jdbcDriver = "org.postgresql.Driver";
		jdbcURL = "jdbc:postgresql://localhost:5432/hkshopping";
	}
	public Connection getConnection() {
		Connection conn= null;
		try {
			Class.forName(jdbcDriver);
			conn = 
			   DriverManager.getConnection(jdbcURL,"hk1234","oracle");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public void memberDelete(String memberNum) {
		con = getConnection();
		sql = " delete from members "
			+ " where member_num = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memberNum);
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void memberUpdate(MemberDTO dto) {
		con = getConnection();
		sql = " update members"
			+ " set MEMBER_NAME = ? , MEMBER_PHONE1=?, "
			+ "    MEMBER_ADDR = ? , MEMBER_GENDER = ?, "
			+ "    MEMBER_BIRTH = ?, MEMBER_EMAIL =? "
			+ " where MEMBER_NUM = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getMemberName());
			pstmt.setString(2, dto.getMemberPhone1());
			pstmt.setString(3, dto.getMemberAddr());
			pstmt.setString(4, dto.getMemberGender());
			pstmt.setDate(5,
				new java.sql.Date(dto.getMemberBirth().getTime()));
			pstmt.setString(6, dto.getMemberEmail());
			pstmt.setString(7, dto.getMemberNum());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 수정되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public MemberDTO selectOne(String memberNum) {
		MemberDTO dto = null;
		con = getConnection();
		sql = " select MEMBER_NUM,MEMBER_ID,MEMBER_PW,MEMBER_NAME,MEMBER_PHONE1,"
			+ "     MEMBER_ADDR, MEMBER_GENDER, MEMBER_BIRTH,MEMBER_EMAIL"
			+ " from members "
			+ " where member_num = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memberNum);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto = new MemberDTO();
				dto.setMemberAddr(rs.getString("MEMBER_ADDR"));
				dto.setMemberBirth(rs.getDate("MEMBER_BIRTH"));
				dto.setMemberEmail(rs.getString("MEMBER_EMAIL"));
				dto.setMemberGender(rs.getString("MEMBER_GENDER"));
				dto.setMemberId(rs.getString("MEMBER_ID"));
				dto.setMemberName(rs.getString("MEMBER_NAME"));
				dto.setMemberNum(rs.getString("MEMBER_NUM"));
				dto.setMemberPhone1(rs.getString("MEMBER_PHONE1"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return dto;
	}
	public List<MemberDTO> selectAll(){
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		con = getConnection();
		sql = " select MEMBER_NUM,MEMBER_ID,MEMBER_PW,MEMBER_NAME,MEMBER_PHONE1,"
			+ "     MEMBER_ADDR, MEMBER_GENDER, MEMBER_BIRTH,MEMBER_EMAIL"
		    + " from members ";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setMemberAddr(rs.getString("MEMBER_ADDR"));
				dto.setMemberBirth(rs.getDate("MEMBER_BIRTH"));
				dto.setMemberEmail(rs.getString("MEMBER_EMAIL"));
				dto.setMemberGender(rs.getString("MEMBER_GENDER"));
				dto.setMemberId(rs.getString("MEMBER_ID"));
				dto.setMemberName(rs.getString("MEMBER_NAME"));
				dto.setMemberNum(rs.getString("MEMBER_NUM"));
				dto.setMemberPhone1(rs.getString("MEMBER_PHONE1"));
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	public void memberWrite(MemberDTO dto) {
		con = getConnection();
		sql = "insert into members(MEMBER_NUM,MEMBER_ID,MEMBER_PW,MEMBER_NAME,MEMBER_PHONE1,"
				+ "                MEMBER_ADDR, MEMBER_GENDER, MEMBER_BIRTH,MEMBER_EMAIL )"
				+ "values(?,?,?,?,?,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getMemberNum());
			pstmt.setString(2, dto.getMemberId());
			pstmt.setString(3, dto.getMemberPw());
			pstmt.setString(4, dto.getMemberName());
			pstmt.setString(5, dto.getMemberPhone1());
			pstmt.setString(6, dto.getMemberAddr());
			pstmt.setString(7, dto.getMemberGender());
			pstmt.setDate(8,
					new java.sql.Date(dto.getMemberBirth().getTime()));
			pstmt.setString(9, dto.getMemberEmail());
			int i = pstmt.executeUpdate();
			System.out.println(i+"개가 삽입되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
