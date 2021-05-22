<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 class="text-center">${Header}</h3>
	<p class="text-center">${desc }</p>
	<hr>
<h1>WELCOME ${user.userName }</h1>
<h1>EMAIL IS ${user.email }</h1>
<h1>PASSWORD is ${user.userPassword } try to secure it</h1>
</body>
</html>