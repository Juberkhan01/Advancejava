
package in.co.rays.User;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import in.co.rays.Util.JDBCDataSource;

public class UserModel {
	
	
	public Integer nextPk()  throws Exception {
		
		int Pk = 0 ;
		
		
		Connection conn = JDBCDataSource.getConnection();
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		 
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:33006/advanacejava", "root","root");
//		
		PreparedStatement ps = conn.prepareStatement("select  max(id) from user");
		
		  ResultSet rs = ps.executeQuery();
		  
		  while (rs.next()) {
			  
			   Pk = rs.getInt(1);
			
		}
            return Pk+1;
            
	}
	public UserBean findByPk(int id)  throws Exception{

		
		Connection conn = JDBCDataSource.getConnection();
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava", "root", "root");
		
		PreparedStatement ps = conn.prepareStatement(" select * from user where id = ?");
		
		ps.setInt(1, id);
		
		   ResultSet rs = ps.executeQuery();
		   
		   UserBean bean = null;
		   
		   while (rs.next()) {
			   
			   bean = new UserBean();
			   
			  bean.setId(rs.getInt(1));
			  bean.setFirstName(rs.getString(2));
			  bean.setLastName(rs.getString(3));
			  bean.setLoginId(rs.getString(4));
			  bean.setPassword(rs.getString(5));
			  bean.setDob(rs.getDate(6));
			  bean.setAddresh(rs.getString(7));
			  
		}
		
		  return bean;
		
		
		
	}

	
	
		 public void add(UserBean bean) throws Exception{
			 
			 
				Connection conn = JDBCDataSource.getConnection();
				
//			 Class.forName("com.mysql.cj.jdbc.Driver");
//			 
//			 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava", "root", "root");
//			 
			 PreparedStatement ps = conn.prepareStatement("insert into user values(? , ? , ? , ? , ? , ? , ? )");
			 
			 
			 ps.setInt(1, nextPk());
			// ps.setInt(1, bean.getId());
			 ps.setString(2, bean.getFirstName());
			 ps.setString(3, bean.getLastName());
			 ps.setString(4, bean.getLoginId());
			 ps.setString(5, bean.getPassword());
			 ps.setDate(6, new java.sql.Date(bean.getDob().getTime()));
			 ps.setString(7, bean.getAddresh());
			 
			 int i = ps.executeUpdate();
			 
			 System.out.println("data inserted = " + i);
			 
			 
		 }
		 public void update(UserBean bean) throws Exception{
			 
			 
				Connection conn = JDBCDataSource.getConnection();
				
//			 Class.forName("com.mysql.cj.jdbc.Driver");
//			 
//			 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava", "root", "root");
			 
			 PreparedStatement ps = conn.prepareStatement("update user set first_name = ? ,last_name = ? , loginId = ? , password = ? , dob = ? ,addresh = ? where id = ?");
			 
			 ps.setString(1, bean.getFirstName());
			 ps.setString(2, bean.getLastName());
			 ps.setString(3, bean.getLoginId());
			 ps.setString(4, bean.getPassword() );
			 ps.setDate(5, new java.sql.Date( bean.getDob().getTime()));
			 ps.setString(6, bean.getAddresh());
			 ps.setInt(7, bean.getId());
			 
			 int i = ps.executeUpdate();
			 
			 System.out.println("data updated = " + i);
			 
			 
		 }
		 
		 public List search(UserBean bean) throws Exception {
			
				Connection conn = JDBCDataSource.getConnection();
			 
//			 Class.forName("com.mysql.cj.jdbc.Driver");
//			 
//			 Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava", "root", "root");
			 
			StringBuffer sql =  new StringBuffer("select * from user where 1=1");
			
			if (bean!=null) {
				
				if (bean.getDob()!=null && bean.getDob().getTime() >0) {
					
					sql.append(" and dob like '" + new java.sql.Date(bean.getDob().getTime())+"%'");
					
				}
				
			}
			System.out.println(sql.toString());
			
			PreparedStatement ps = conn.prepareStatement(sql.toString());
			
			
		ResultSet rs = 	ps.executeQuery();
		
		
			List list = new ArrayList();
			
			while (rs.next()) {
				
				bean = new UserBean();
				
				bean.setId(rs.getInt(1));
				bean.setFirstName(rs.getString(2));
				bean.setLastName(rs.getString(3));
				bean.setLoginId(rs.getString(5));
				bean.setPassword(rs.getString(6));
				bean.setAddresh(rs.getString(7));
				
				
				list.add(bean);
				
				
				
				
			}
			return list;
			
			 
		 }
		 public void delete(int id) throws Exception {
		
				Connection conn = JDBCDataSource.getConnection();
			 
//			 Class.forName("com.mysql.cj.jdbc.Driver");
//			 
//			 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava", "root", "root");
//			 
			 PreparedStatement  ps = conn.prepareStatement("delete from user where id   = ? ");
			 
			ps.setInt(1,id);
			
			int i = ps.executeUpdate();
			
			System.out.println("data deleted  = " + i );
			
			
			
			
			 
		 }
}
