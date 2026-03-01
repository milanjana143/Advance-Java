<%@ page import="model.UserBean" %>

<jsp:useBean id="user" class="model.UserBean" />

<jsp:setProperty name="user" property="*" />

<%
    int status = user.registerUser();

    if(status > 0){
        out.println("<h3>Registration Successful!</h3>");
    } else {
        out.println("<h3>Registration Failed!</h3>");
    }
%>