<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
	<h1>Login page</h1>
	<br><hr>
	<form action="greet" method="post">
		<h2>Username: <input type="text" name="uname"><br>
			Password: <input type="password" name="upass"><br>
			<input type="submit" value="login" name="submit">
			<input type="reset" value="reset" name="reset">
		</h2>
	</form>
	</center>
</body>
</html>