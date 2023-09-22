package model;

import java.sql.SQLException;

public class MemberMyDAO extends DataBaseInfo{
	public MemberDTO memberInfo(String memberId) {
		MemberDTO dto = new MemberDTO();
		con = getConnection();
		sql = " select MEMBER_ID, MEMBER_NAME, MEMBER_PHONE1, MEMBER_PHONE2"
			+ "       ,MEMBER_ADDR, MEMBER_ADDR_DETAIL, member_post "
			+ "       ,GENDER, MEMBER_BIRTH, MEMBER_EMAIL, member_regist"
			+ "		  ,member_num "
			+ " from members "
			+ " where member_id = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memberId);
			rs = pstmt.executeQuery();
			rs.next();
			dto.setMemberId(rs.getString(1));
			dto.setMemberName(rs.getString(2));
			dto.setMemberPhone1(rs.getString(3));
			dto.setMemberPhone2(rs.getString(4));
			dto.setMemberAddr(rs.getString(5));
			dto.setMemberAddrDetail(rs.getString(6));
			dto.setMemberPost(rs.getString(7));
			dto.setMemberGender(rs.getString(8));
			dto.setMemberBirth(rs.getDate(9));
			dto.setMemberEmail(rs.getString(10));
			dto.setMemberRegist(rs.getDate(11));
			dto.setMemberNum(rs.getString(12));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;
	}
	public void memberInfoUpdate(MemberDTO dto) {
		sql = " update members "
			+ " set member_name = ?, member_addr = ?"
			+ "    ,member_addr_detail=?, member_post = ?"
			+ "    ,member_phone1 = ?, member_phone2 = ?"
			+ "    ,member_birth = ?, member_email = ?"
			+ "    ,gender = ?"
			+ " where member_id = ?";
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
			pstmt.setString(10, dto.getMemberId());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개 행이(가) 수정되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void memberDrop(String memberId) {
		con = getConnection();
		sql = " delete from members "
			+ " where member_id = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memberId);
			int i = pstmt.executeUpdate();
			System.out.println(i + "개이(가) 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void memberPwUpdate(String memberId, String newPw) {
		con = getConnection();
		sql = " update members "
			+ " set member_pw = ? "
			+ " where member_id = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, newPw);
			pstmt.setString(2, memberId);
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 수정되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
}
