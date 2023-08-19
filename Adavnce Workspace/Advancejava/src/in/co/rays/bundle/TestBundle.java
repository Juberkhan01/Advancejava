package in.co.rays.bundle;

import java.util.ResourceBundle;

public class TestBundle {
		
		public static void main(String[] args) throws Exception {
			
			 ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.bundle.app_sp");
				
			   	System.out.println( "spanies = "+ rb.getString("spn"));
			   	  
			   	rb = ResourceBundle.getBundle("in.co.rays.bundle.app_pa_IN");
			   	  
			   	System.out.println( " panjabi = "+ rb.getString("pung"));
			   	  
			   	rb = ResourceBundle.getBundle("in.co.rays.bundle.app_hi");
			   	  
			   	System.out.println( " hindi = "+ rb.getString("greeting"));
			   	  
			   	rb = ResourceBundle.getBundle("in.co.rays.bundle.app_ru_RU");
			   	
			   	System.out.println( "russien = "+ rb.getString( "rsn"));  
			   	
			   	rb = ResourceBundle.getBundle("in.co.rays.bundle.app_it");
			   	  
			   	System.out.println( "itlatian= "+ rb.getString( "itl"));  
			   	
			   	
			
//			  System.out.println(rb.getString("Url"));
//			  System.out.println(rb.getString("User"));
//			  System.out.println(rb.getString("Password"));
//			  System.out.println(Integer.parseInt(rb.getString("Acquire")));
//			  System.out.println(Integer.parseInt(rb.getString("Initial")));
//			  System.out.println(Integer.parseInt(rb.getString("Maximum")));
//			 
//			
			
		}

	
			
				

	}



