package in.co.rays.Ctl;


	import java.io.IOException;

	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	import org.apache.catalina.User;

import in.co.rays.Bean.UserBean;
import in.co.rays.Model.UserModel;
@WebServlet("/LoginCtl")
	public class LoginCtl extends HttpServlet {

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

			resp.sendRedirect("loginView.jsp");

		}

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

			String op = req.getParameter("operation");
			

			if(op.equals("SignIn")) {

				String loginId = req.getParameter("LoginId");
				String password = req.getParameter("password");

				UserModel model = new UserModel();

				try {
					UserBean bean = model.authenticate(loginId, password);

					if (bean != null) {
						
						req.setAttribute("user", bean);

						RequestDispatcher rd = req.getRequestDispatcher("WelcomeCtl");

						rd.forward(req, resp);

					} else {

						req.setAttribute("msg", "LoginId & Password is invalid...!!");

						RequestDispatcher rd = req.getRequestDispatcher("loginView.jsp");

						rd.forward(req, resp);

					}

				} catch (Exception e) {
					e.printStackTrace();
				}

			}

			if (op.equals("SignUp")) {

				resp.sendRedirect("UserCtl");

			}

		}
	


	}


