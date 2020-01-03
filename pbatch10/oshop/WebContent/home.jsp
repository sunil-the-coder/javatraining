<%@page import="com.nobel.oshop.cart.ShoppingCart"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" buffer="8kb" import="java.time.LocalDateTime"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%! int data=100; %>

<%
	
	application.setAttribute("cart", new ShoppingCart());

	LocalDateTime time = LocalDateTime.now();
%>

<h2>Current Time: <%= time %> </h2>
</body>
</html>