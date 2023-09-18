package model;

import java.sql.SQLException;

public class FindDAO extends DataBaseInfo{
	public String findId(String userPhone, String userEmail) {
		String userId = null;
		con = getConnection();
		sql = " select member_id"
			+ " from members "
			+ " where member_email = ? "
			+ " and (member_phone1 = ? or member_phone2 = ?) "
			+ " union "
			+ " select emp_id "
			+ " from employees "
			+ " where emp_phone = ? and emp_email =? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userEmail);
			pstmt.setString(2, userPhone);
			pstmt.setString(3, userPhone);
			pstmt.setString(4, userPhone);
			pstmt.setString(5, userEmail);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				userId = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return userId;
	}
	public AuthInfoDTO userEmail(String userId, String userPhone) {
		AuthInfoDTO dto = null;
		con = getConnection();
		sql = " select member_email , 'mem'"
			+ " from members "
			+ " where member_id = ? "
			+ " and (member_phone1 = ? or member_phone2 = ?) "
			+ " union "
			+ " select emp_email  , 'emp'"
			+ " from employees "
			+ " where emp_phone = ? and emp_id =? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.setString(2, userPhone);
			pstmt.setString(3, userPhone);
			pstmt.setString(4, userPhone);
			pstmt.setString(5, userId);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto = new AuthInfoDTO();
				dto.setUserEmail(rs.getString(1));
				dto.setGrade(rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return dto ;
	}
	public void pwUpdate(AuthInfoDTO dto) {
		con = getConnection();
		if (dto.getGrade().equals("emp")) {
			sql = " update employees "
				+ " set emp_pw = ? "
				+ " where emp_id = ? ";
		}else {
			sql = " update members "
				+ " set member_pw  = ? "
				+ " where member_id  = ?"; 
		}

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getUserPw());
			pstmt.setString(2, dto.getUserId());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 수정되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
