<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.time.LocalDateTime"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! int data=100; %>

<%
	LocalDateTime time = LocalDateTime.now();
%>

<h2>Current Time: <%= time %> </h2>
</body>
</html>