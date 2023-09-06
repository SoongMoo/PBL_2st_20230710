package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardDAO {
	Connection con;
	String jdbcURL;
	String sql;
	PreparedStatement pstmt;
	public BoardDAO() {
		jdbcURL = "jdbc:postgresql://localhost:5432/hkshopping";
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(jdbcURL,"postgres","1234");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void boardInsert(BoardDTO dto) {
		sql = " insert into board(subject, contents, writer)"
			+ " values(?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getSubject());
			pstmt.setString(2, dto.getContents());
			pstmt.setString(3, dto.getWriter());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개의 행이(가) 삽입되었습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
