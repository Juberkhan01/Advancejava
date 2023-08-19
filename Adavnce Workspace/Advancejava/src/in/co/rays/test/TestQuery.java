package in.co.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestQuery {

	
		 public static void main(String[] args) throws Exception {
			
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 
			 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava", "root", "root");
			 
			 Statement stmt = conn.createStatement();
			 
			 
			 ResultSet rs = stmt.executeQuery("select * from marksheet ");
			 
			  while (rs.next()) {

				  System.out.println();
				  
			}
			 
		}
}
