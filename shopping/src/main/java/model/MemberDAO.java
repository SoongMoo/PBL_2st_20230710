package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.MemberDTO;

public class MemberDAO extends DataBaseInfo{
	public String memberAutoNum() {
		String memberNum = "";
		con = getConnection();
		sql = "select concat('mem',coalesce(max(substr(member_num,4))::integer,1000000) + 1)"
			+ "from members";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
			memberNum = rs.getString(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return memberNum; 
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
		sql = " update members "
				+ " set member_name = ?, member_addr = ?"
				+ "    ,member_addr_detail=?, member_post = ?"
				+ "    ,member_phone1 = ?, member_phone2 = ?"
				+ "    ,member_birth = ?, member_email = ?"
				+ "    ,gender = ?"
				+ " where member_num = ?";
			try {
				con = getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, dto.getMemberName());
				pstmt.setString(2, dto.getMemberAddr());
				pstmt.setString(3, dto.getMemberAddrDetail());
				pstmt.setString(4, dto.getMemberPost());
				pstmt.setString(5, dto.getMemberPhone1());
				pstmt.setString(6, dto.getMemberPhone2());
				pstmt.setDate(7, 
						new java.sql.Date(dto.getMemberBirth().getTime()));
				pstmt.setString(8, dto.getMemberEmail());
				pstmt.setString(9, dto.getMemberGender());
				pstmt.setString(10, dto.getMemberNum());
				int i = pstmt.executeUpdate();
				System.out.println(i + "개 행이(가) 수정되었습니다.");
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				close();
			}
		
	}
	public MemberDTO selectOne(String memberNum) {
		MemberDTO dto = null;
		con = getConnection();
		sql = " select MEMBER_NUM,MEMBER_ID,MEMBER_PW,MEMBER_NAME,MEMBER_PHONE1,MEMBER_PHONE2,"
				+ "	   MEMBER_ADDR,MEMBER_ADDR_detail,MEMBER_post, GENDER, MEMBER_BIRTH,MEMBER_EMAIL,"
				+ "	   member_regist"
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
				dto.setMemberGender(rs.getString("GENDER"));
				dto.setMemberId(rs.getString("MEMBER_ID"));
				dto.setMemberName(rs.getString("MEMBER_NAME"));
				dto.setMemberNum(rs.getString("MEMBER_NUM"));
				dto.setMemberPhone1(rs.getString("MEMBER_PHONE1"));
				dto.setMemberAddrDetail(rs.getString("MEMBER_ADDR_detail"));
				dto.setMemberPhone2(rs.getString("MEMBER_PHONE2"));
				dto.setMemberPost(rs.getString("MEMBER_post"));
				dto.setMemberRegist(rs.getDate("member_regist"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;
	}
	public List<MemberDTO> selectAll(){
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		con = getConnection();
		sql = " select MEMBER_NUM,MEMBER_ID,MEMBER_PW,MEMBER_NAME,MEMBER_PHONE1,MEMBER_PHONE2,"
				+ "	   MEMBER_ADDR,MEMBER_ADDR_detail,MEMBER_post, GENDER, MEMBER_BIRTH,MEMBER_EMAIL,"
				+ "	   member_regist"
		    + " from members ";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setMemberAddr(rs.getString("MEMBER_ADDR"));
				dto.setMemberBirth(rs.getDate("MEMBER_BIRTH"));
				dto.setMemberEmail(rs.getString("MEMBER_EMAIL"));
				dto.setMemberGender(rs.getString("GENDER"));
				dto.setMemberId(rs.getString("MEMBER_ID"));
				dto.setMemberName(rs.getString("MEMBER_NAME"));
				dto.setMemberNum(rs.getString("MEMBER_NUM"));
				dto.setMemberPhone1(rs.getString("MEMBER_PHONE1"));
				dto.setMemberAddrDetail(rs.getString("MEMBER_ADDR_detail"));
				dto.setMemberPhone2(rs.getString("MEMBER_PHONE2"));
				dto.setMemberPost(rs.getString("MEMBER_post"));
				dto.setMemberRegist(rs.getDate("member_regist"));
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
		sql = "insert into members(MEMBER_NUM,MEMBER_ID,MEMBER_PW,MEMBER_NAME,MEMBER_PHONE1,MEMBER_PHONE2,"
				+ "                MEMBER_ADDR,MEMBER_ADDR_detail,MEMBER_post, GENDER, MEMBER_BIRTH,MEMBER_EMAIL, "
				+ "				   member_regist)"
				+ "values(?,?,?,?,?,?,?,?,?,?,?,?, now())";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getMemberNum());
			pstmt.setString(2, dto.getMemberId());
			pstmt.setString(3, dto.getMemberPw());
			pstmt.setString(4, dto.getMemberName());
			pstmt.setString(5, dto.getMemberPhone1());
			pstmt.setString(6, dto.getMemberPhone2());
			pstmt.setString(7, dto.getMemberAddr());
			pstmt.setString(8, dto.getMemberAddrDetail());
			pstmt.setString(9, dto.getMemberPost());
			pstmt.setString(10, dto.getMemberGender());
			pstmt.setDate(11,
					new java.sql.Date(dto.getMemberBirth().getTime()));
			pstmt.setString(12, dto.getMemberEmail());
			int i = pstmt.executeUpdate();
			System.out.println(i+"개가 삽입되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
