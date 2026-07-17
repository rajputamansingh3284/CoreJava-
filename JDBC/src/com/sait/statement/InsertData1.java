package com.sait.statement;

import java.sql.*;

public class InsertData1 {

	public static void main(String[] args) {
		try {
			Connection c=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sait",
					"root","harsh421");
			PreparedStatement ps=c.prepareStatement(
					"insert into student(name,phone)values(?,?)");
			ps.setString(1,"Drax");
			ps.setString(2,"1222333355");
			ps.executeUpdate();
			System.out.println("Data Inserted!!");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}