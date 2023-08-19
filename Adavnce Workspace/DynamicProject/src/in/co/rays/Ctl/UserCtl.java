package in.co.rays.Ctl;

import java.io.IOException;
import java.rmi.ServerException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.Bean.UserBean;
import in.co.rays.Model.UserModel;

@WebServlet("/UserCtl")
public class UserCtl  extends HttpServlet {
	
@Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	resp.sendRedirect("UserRegistration.jsp");
}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

			 String firstName = req.getParameter("firstName");
			 String lastName = req.getParameter("lastName");
			 String loginId = req.getParameter("loginId");
			 String password = req.getParameter("password");
			 String dob = req.getParameter("dob");
			 String addresh = req.getParameter("addresh");
			 
			 SimpleDateFormat sdf =  new SimpleDateFormat("dd-MM-yyyy");
			 
			 UserBean bean = new UserBean();
			 bean.setFirstName(firstName);
			 bean.setLastName(lastName);
			 bean.setLoginId(loginId);
			 bean.setPassword(password);
			 
			 try {
				 
				 bean.setDob(sdf.parse(dob));
				 
				
			} catch (Exception e) {
				
				e.printStackTrace();
				 
				
			}
			 bean.setAddresh(addresh);
			 
			 
			 UserModel model = new UserModel();
			 
			 try {
			
				bean  = model.findBylogin(loginId);
				
				if (bean != null) {
					
					req.setAttribute("msg", "user already exist.........!!");
					
				}
				else {
					model.add(bean);
					
					req.setAttribute("msg", "user register succesfully........!!!!!");
				}
				 
				 
			} catch (Exception e) {
  
				e.printStackTrace();
			
			}
			 resp.sendRedirect("UserRegistration.jsp");
	
	
	
	}

}
