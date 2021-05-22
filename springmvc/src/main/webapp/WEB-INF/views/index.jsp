<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOME PAGE</title>
</head>
<body>
<h1>This is home page</h1>
<h1>Called by Home Controller</h1>
<h1>url/home</h1>
<%
String name=(String)request.getAttribute("name");
int id=(int)request.getAttribute("id");
List<String> friend=(List<String>)request.getAttribute("friendlist");

%>
<h1>Name is <%=name %> </h1>
<h2>Id is <%=id %> </h2>

<% 
for(String s: friend){
	%>
	
	<h1><%=s %></h1>
<% 
}
%>	


%>
</body>
</html>