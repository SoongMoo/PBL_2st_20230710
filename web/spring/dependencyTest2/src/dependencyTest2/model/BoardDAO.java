package dependencyTest2.model;

import java.sql.SQLException;

public class BoardDAO extends DataBaseInfo{
	public void boardInsert(BoardDTO dto) {
		con = getConnection();
		sql = " insert into board (WRITER,SUBJECT, CONTENTs) "
		+ " values(?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getWriter());
			pstmt.setString(2, dto.getSubject());
			pstmt.setString(3, dto.getContents());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
	}
}
