package com.naught.carter.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConUtil {
	
	private static Connection conn=null;
	public static Connection getConnection(){
		if (conn==null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/carter?user=root&password=root&useUnicode=true&characterEncoding=UTF-8");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	public static void realse(ResultSet rs, PreparedStatement psmt){
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (psmt != null) {
			try {
				psmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
