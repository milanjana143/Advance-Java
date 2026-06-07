<%@ page session="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>

<h2>Welcome <%= session.getAttribute("username") %></h2>

<a href="login.jsp"><input type="button" value="Logout"></a>

</body>
</html>