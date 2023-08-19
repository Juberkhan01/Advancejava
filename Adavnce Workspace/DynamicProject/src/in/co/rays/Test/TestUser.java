package in.co.rays.Test;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import in.co.rays.Bean.UserBean;
import in.co.rays.Model.UserModel;


public class TestUser {
	
	public static void main(String[] args) throws Exception {
		
		testadd();
		//testupdate();
		//testdelete();
		// testsearch();
	}

	

	private static void testadd() throws Exception {
		
		String  dob = "2003-11-08";
		
		SimpleDateFormat sdf = new SimpleDateFormat( "YYYY-MM-dd");
		
		UserBean bean = new UserBean();
		
		//bean.setId(6);
		bean.setFirstName("abhishek");
		bean.setLastName("patel");
		bean.setLoginId("abhi7patel19@gmail.com");
		bean.setPassword("abhi2123");
		bean.setDob(sdf.parse(dob));
		bean.setAddresh("bhopal");
		
		UserModel model = new UserModel();
		
		model.add(bean);
		
		
		
	}

	
		private static void testupdate() throws Exception{
			
			UserModel Model = new UserModel();
			
			UserBean bean =  Model.findByPk(1);
			
			if (bean!=null) {
				
				bean.setFirstName("juber ");
				bean.setLastName("pathan");
				
				Model.update(bean);
				
				System.out.println("data exist and upadated ......!!!!");
				

			} else {
				
				System.out.println("user not exist .....!!!");

			}
			
		}
		
		private static void testsearch() throws Exception {
			
			String dob = "1998-09-26";
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			UserBean  bean= new UserBean();
			
			bean.setDob(sdf.parse(dob));
			
			UserModel model = new UserModel();
			
			List list = model.search(bean);
			
			
		Iterator it =  list.iterator();
		
		while (it.hasNext()) {
			
			bean = new UserBean();
			
			System.out.println("\t" + bean.getId());
			System.out.println("\t" + bean.getFirstName());
			System.out.println("\t"+ bean.getLastName() );
			System.out.println("\t"+bean.getLoginId());
			System.out.println("\t"+ bean.getPassword());
			System.out.println("\t"+ bean.getDob());
			System.out.println("\t"+ bean.getAddresh() );
			
			
		}
			
	}
		private static void testdelete() throws Exception {
			
			UserModel model = new UserModel();
			
			model.delete(2);
			
			
		}

}
