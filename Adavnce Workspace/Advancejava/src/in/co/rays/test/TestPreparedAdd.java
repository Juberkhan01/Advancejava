package in.co.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class TestPreparedAdd {
	public static void main(String[] args) throws Exception {
		
		
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","root");
		
		PreparedStatement ps = conn.prepareStatement("insert into marksheet values(21 , 'priyanshu' , 116 , 89, 89,89)");
		
		int i = ps.executeUpdate();
		
		System.out.println("data inserted = " + i);
		
		
		
		
		
	}

}
