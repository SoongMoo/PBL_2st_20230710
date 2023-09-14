package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseInfo {
	String jdbcDriver;
	String jdbcURL;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;
	public  DataBaseInfo() {
		jdbcDriver = "org.postgresql.Driver";
		jdbcURL = "jdbc:postgresql://localhost:5432/hkshopping";
	}
	public Connection getConnection() {
		Connection conn= null;
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(jdbcURL,"postgres","1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
