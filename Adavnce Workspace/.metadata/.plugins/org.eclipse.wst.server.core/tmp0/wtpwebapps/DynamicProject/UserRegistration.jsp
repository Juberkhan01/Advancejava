<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<center>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>
	<h4 style="border: 6px solid green;">

		<form action="userCtl" method=post>

			<h1>
				<p style="background-color: pink;">WELCOME</p>
			</h1>
			<table>

				<h5 style="border: 2px dotted red;">

					<H1>
						<p style="color: blue;">
							<i>REGISTER HERE </i>
						</p>
					</H1>
				</h5>
				<tr>

					<th>firstName :</th>
					<td><input type="text" placeholder="enter your  first name "
						name="firstName"></td>

				</tr>
				<tr>

					<th>lastName :</th>
					<td><input type="text" placeholder="enter your last name "
						name="lastName"></td>

				</tr>
				<tr>

					<th>loginId :</th>
					<td><input type="text" placeholder="enter your email ID"
						name="loginId"></td>

				</tr>
				<tr>

					<th>password :</th>
					<td><input type="password" placeholder="enter your password"
						name="password"></td>

				</tr>

				<tr>

					<th>DOB :</th>
					<td><input type="date" name="dob"></td>

				</tr>
				<tr>

					<th>addresh:</th>
					<td><input type="text" Placeholder="enter your addresh"
						name="addresh"></td>

				</tr
				>
				<tr>

					<th></th>
					<td><input type="submit" values="singup"></td>

				</tr>

				<tr>


					<th></th>
					<td>
						<button class="signup-button">Sign in</button>
					</td>
				</tr>

				<tr>

					<th><a href="https://www.google.com/">Visit :- google.com!</a>
					</th>

				</tr>
				

			</table>
		</form>
	</h4>


</body>
</html>