package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ListData {
	public Connection conn;
	public Statement stmt;
	public ResultSet rs;
	public ResultSetMetaData rsmd;
	
	public ListData() {
		/*
		 * There are 7 steps to connect to a database and fetch
		 * the content of a table that resides in the database.
		 * 
		 * +----+--------------+--------------------------+------------+
		 * | id | name         | email_id                 | mobile_no  |
		 * +----+--------------+--------------------------+------------+
		 * |  1 | Milan Das    | milandas63@gmail.com     | 7978168568 |
		 * |  2 | Moumita Shaw | moumitashaw507@gmail.com | NULL       |
		 * |  3 | Ankit Kumar  | ankit.ku3101@gmail.com   | NULL       |
		 * |  4 | Avinash Das  | dasavinash786@gmail.com  | NULL       |
		 * +----+--------------+--------------------------+------------+
		 */
		
		try {
			// Step-1 Load and Register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Class.forName("com.mysql.jdbc.Driver");
			//Class.forName("org.gjt.mm.mysql.Driver");
			
			// Step-2 Create Connection Object
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gift_group1","root","");
			
			// Step-3 Create Statement Object
			stmt = conn.createStatement();
			
			// Step-4 Create ResultSet Object
			rs = stmt.executeQuery("SELECT * FROM student_list");
			rsmd = rs.getMetaData();

			// Step-5 Manipulate the ResultSet
			for(int i=1; i<=rsmd.getColumnCount(); i++) {
				System.out.print(rsmd.getColumnName(i)+" ");
			}
			System.out.println();
			while(rs.next()) {
//				System.out.println(rs.getString("id") + " " +
//								   rs.getString("name") + " " +
//								   rs.getString("email_id") + " " +
//								   rs.getString("mobile_no")
//								  );
				for(int i=1; i<=rsmd.getColumnCount(); i++) {
					System.out.print(rs.getString(i)+"\t");
				}
				System.out.println();
			}

			// Step-6 Close Objects
			rs.close();
			stmt.close();
			conn.close();
		} catch(Exception e) {
			System.err.println(e);
		}
		
	}

	public static void main(String[] args) {
		new ListData();
	}

}
