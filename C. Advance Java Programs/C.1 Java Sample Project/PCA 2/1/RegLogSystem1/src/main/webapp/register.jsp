<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>

<h2>User Registration</h2>

<form action="register" method="post">

    Username:
    <input type="text" name="username" required>
    <br><br>

    Email:
    <input type="email" name="email" required>
    <br><br>

    Password:
    <input type="password" name="password" required>
    <br><br>

    <a href="login.jsp"><input type="button" value="Login"></a>
    <input type="submit" value="Register">
    
</form>

</body>
</html>