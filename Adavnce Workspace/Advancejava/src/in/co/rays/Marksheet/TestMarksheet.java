package in.co.rays.Marksheet;

import java.util.Iterator;
import java.util.List;

public class TestMarksheet {
	 public static void main(String[] args) throws Exception {
		
		 
		testAdd();
		//testupdate();
		// testdelete();
		 //testFindByRoll();
		 // testSearch();
		 
	}
public static void testAdd() throws Exception {
	 
	 MarksheetBean bean = new  MarksheetBean();
	 //bean.setId(22);
	 bean.setName("juber");
	 bean.setRollNo(127);
	 bean.setPhysics(78);
	 bean.setChemistry(78);
	 bean.setMaths(90);
	 
	 MarksheetModel model = new MarksheetModel();
	 model.add(bean);
}
	public static void testupdate() throws Exception {

	MarksheetBean bean = new  MarksheetBean();
	
	bean.setId(11);
	bean.setName("kusum");
	bean.setRollNo(122);
	bean.setPhysics(78);
	bean.setChemistry(78);
	bean.setMaths(90);
	

	MarksheetModel model = new MarksheetModel();
	model.update(bean);
	
	
}
	public static void testdelete() throws Exception {
	
		MarksheetModel model = new MarksheetModel();
		model.delete(21);
	
	}
	
	public static void testFindByRoll() throws Exception {

		MarksheetModel model = new  MarksheetModel();
		
		MarksheetBean  bean = model.FindByRoll(10);
		
		if (bean != null) {
			
			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getRollNo());
			System.out.println(bean.getPhysics());
			System.out.println(bean.getChemistry());
			System.out.println(bean.getMaths());
			
		
			
		}
		else {
			
			System.out.println("Roll nmber do'nt exist .........!!!!");
		}
		
		
	}
	private static void testSearch() throws Exception {

		MarksheetBean bean = new MarksheetBean();
		 bean.setName("j");
		// bean.setId(1);
		// bean.setRollNo(101);

		MarksheetModel model = new MarksheetModel();

		List list = model.search(bean, 1, 5);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			bean = (MarksheetBean) it.next();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getRollNo());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemistry());
			System.out.println("\t" + bean.getMaths());

		}

	}

   /*	
   public static void testSearch() throws Exception {

		MarksheetModel model = new  MarksheetModel();
		
		List  list = model.Search();
	    
		 Iterator it = list.iterator();
		 
		  while (it.hasNext()) {
			  
			  MarksheetBean bean =  (MarksheetBean) it.next();
		
			  System.out.print( "\t" +bean.getId() );
			  System.out.print("\t " +bean.getName() );
			  System.out.print("\t" + bean.getRollNo() );
			  System.out.print( "\t" + bean.getPhysics() );
			  System.out.print( "\t" +bean.getChemistry() );
			  System.out.println( "\t" + bean.getMaths() );
		}
		
	}  
	*/
}
