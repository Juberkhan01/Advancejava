package in.co.rays.Test;



	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
	import java.sql.ResultSet;
import java.sql.Statement;

import in.co.rays.util.JDBCDataSource;




	public class TestJDBC {

		public static void main(String[] args) throws Exception {
for (int i = 1; i <= 50; i++) {
	
	testGet(); 
	
	
	System.out.println(" juber" + i);
	
	
	
}
		

				

			}

		

		private static void testGet() throws Exception {

			Connection conn = JDBCDataSource.getConnection();

			PreparedStatement ps = conn.prepareStatement("select * from marksheet where id = 2");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				System.out.print(rs.getInt(1));
				System.out.print("\t" + rs.getString(2));
				System.out.print("\t" + rs.getInt(3));
				System.out.print("\t" + rs.getInt(4));
				System.out.print("\t" + rs.getInt(5));
				System.out.println("\t" + rs.getInt(6));

			}

		}
		
	}




	
	
	
	


