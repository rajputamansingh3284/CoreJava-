package com.sait.statement;

import java.sql.*;
public class InsertData {

	public static void main(String[] args) {
		try {
			Connection c=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sait",
					"root","harsh421");
			Statement st=c.createStatement();
			st.executeUpdate(
					"insert into student(name,phone)values('Drax','882173998')");
			System.out.println("Data Inserted!!");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}