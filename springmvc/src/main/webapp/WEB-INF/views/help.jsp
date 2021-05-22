<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@page import="java.time.LocalDateTime"%>
     <%@page isELIgnored="false" %>
     
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HELP PAGE</title>
</head>
<body>
<%
/* String name=(String)request.getAttribute("name");
Integer id=(Integer)request.getAttribute("id");
LocalDateTime time=(LocalDateTime)request.getAttribute("time"); */
%>

	<h1>
		Hello My name is
		<%-- <%= name %> --%>
		${name}
	</h1>
	<h2>This is help page.How can I help you</h2>
	<h1>
		ID is
		<%-- <%=id %> --%>
		${id}
	</h1>
	<h2>
		Time is=
		<%-- <%= time %> --%>
		${time}
	</h2>
	
	<hr>
	<c:forEach var="item"  items="${marks}">
	<%-- <h1>${item}</h1> --%>
	<h1><c:out value="${item}"></c:out></h1>
	
	</c:forEach>
	
	
	
</body>
</html>