<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LoginFail</title>
</head>

<body>
<body>
	<h3>Login Failed</h3>
	<br> Invalid User Name/Password provided :
	<%=request.getParameter("user")%>
</body>
</html>