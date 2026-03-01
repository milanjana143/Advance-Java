<%@ page language="java" %>

<html>
<head>
    <title>Factorial Calculator</title>
</head>
<body>

<h2>Factorial Calculator</h2>

<form method="post">
    Enter Number:
    <input type="number" name="num" required>
    <input type="submit" value="Calculate">
</form>

<%! 
    // Declaration method
    int factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
%>

<%
    String number = request.getParameter("num");
    if(number != null) {
        int n = Integer.parseInt(number);
        int result = factorial(n);
%>

<h3>Factorial of <%= n %> is: <%= result %></h3>

<%
    }
%>

</body>
</html>