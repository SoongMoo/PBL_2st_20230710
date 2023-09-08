package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
	String jdbcURL;
	String jdbcDriver;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;

	public BoardDAO() {
		jdbcDriver = "org.postgresql.Driver";
		jdbcURL = "jdbc:postgresql://localhost:5432/hkshopping";
	}

	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(jdbcURL, "postgres", "1234");
		} catch (Exception e) {

			e.printStackTrace();
		}
		return conn;
	}

	public void boardInsert(BoardDTO dto) {
		con = getConnection();
		String sql = " insert into board(WRITER,SUBJECT, CONTENTs)" + " values(?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getBoardWriter());
			pstmt.setString(2, dto.getBoardSubject());
			pstmt.setString(3, dto.getBoardContent());
			int i = pstmt.executeUpdate();
			System.out.println(i + " 개 행이(가) 삽입되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (Exception e) {
				}
			if (con != null)
				try {
					con.close();
				} catch (Exception e) {
				}
		}
	}

	public List<BoardDTO> selectAll() {
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		con = getConnection();
		String sql = "select num,writer,subject,contents" + " from board" + " order by num desc";

		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();// 출력될 모든 레코드를갖지고 옮 
			while (rs.next()) {
				BoardDTO dto = new BoardDTO();
				dto.setBoardContent(rs.getString("contents"));
				dto.setBoardNum(rs.getInt("NUM"));
				dto.setBoardSubject(rs.getString("SUBJECT"));
				dto.setBoardWriter(rs.getString("WRITER"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public BoardDTO selectOne(String num) {
		BoardDTO dto = new BoardDTO();
		con = getConnection(); 
		String sql = "select NUM, WRITER, SUBJECT, CONTENTS"
				+ " from board "
				+ " where NUM = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(num));
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto.setBoardContent(rs.getString("CONTENTS"));
				dto.setBoardNum(rs.getInt("NUM"));
				dto.setBoardSubject(rs.getString("SUBJECT"));
				dto.setBoardWriter(rs.getString("WRITER"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try{rs.close();}catch(Exception e) {}
			if(pstmt != null) try{pstmt.close();}catch(Exception e) {}
			if(con != null) try{con.close();}catch(Exception e) {}
		}		
		return dto;
	}
	public void boardUpdate(BoardDTO dto) {
		con = getConnection();
		String sql = "update board"
			+ " set WRITER = ? , SUBJECT = ?, CONTENTS = ? "
			+ " where num = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getBoardWriter());
			pstmt.setString(2, dto.getBoardSubject());
			pstmt.setString(3, dto.getBoardContent());
			pstmt.setInt(4, dto.getBoardNum());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개 행이(가) 수정되었습니다.");
		}catch(Exception e) {e.printStackTrace(); 
		}finally {
			if(pstmt != null) try{pstmt.close();}catch(Exception e) {}
			if(con != null) try{con.close();}catch(Exception e) {}
		}
	}
	public void boardDel(String num) {
		con = getConnection();
		String sql = "delete from board where num = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(num));
			int i = pstmt.executeUpdate();
			System.out.println(i +" 개 행이(가) 삭제되었습니다.");
		}catch(Exception e) {e.printStackTrace();
		} finally {
			if(pstmt != null) try{pstmt.close();}catch(Exception e) {}
			if(con != null) try{con.close();}catch(Exception e) {}
		}
	}

}
