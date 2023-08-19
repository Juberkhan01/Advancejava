<%@page import="in.co.rays.Model.UserModel"%>
<%@page import="in.co.rays.Bean.UserBean"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	  	<%@ include file="Header.jsp"%>
	  	
<h1> welcome  view</h1>
 
<%-- <%
		String firstName =  request.getParameter("firstName");
		String lastName =  request.getParameter("lastName");
		String loginId=  request.getParameter("loginId");
		String password =  request.getParameter("password");
		String dob =  request.getParameter("dob");
		String addresh =  request.getParameter("addresh");
	
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		UserBean  bean = new UserBean();
		
		bean.setFirstName(firstName);
		bean.setLastName(lastName);
		bean.setLoginId(loginId);
		bean.setPassword(password);
		bean.setDob(sdf.parse(dob));
		bean.setAddresh(addresh);
		
		UserModel model = new UserModel();
		model.add(bean);
		
%>

<h1><%= firstName %></h1>
<h1><%= lastName %></h1>
<h1><%= loginId %></h1>
<h1><%= password %></h1>
<h1><%=  dob  %></h1>
<h1><%= addresh %></h1> --%>

</body>
</html>