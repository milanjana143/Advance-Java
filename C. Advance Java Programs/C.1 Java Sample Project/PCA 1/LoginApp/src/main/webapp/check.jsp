<%@ page import="java.sql.*" %>

<%
String uname = request.getParameter("username");
String pass = request.getParameter("password");

boolean status = false;

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/logindb",
        "root",
        "1234");

    PreparedStatement ps = con.prepareStatement(
        "SELECT * FROM users WHERE username=? AND password=?");

    ps.setString(1, uname);
    ps.setString(2, pass);

    ResultSet rs = ps.executeQuery();

    if(rs.next()) {
        status = true;
    }

    con.close();

} catch(Exception e) {
    e.printStackTrace();
}

if(status) {
    session.setAttribute("user", uname);
    response.sendRedirect("home.jsp");
} else {
    out.println("<h3>Invalid Username or Password!</h3>");
}
%>