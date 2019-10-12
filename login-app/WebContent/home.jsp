<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" import="java.util.LinkedList"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! int data=100; %>
<%

List list = new LinkedList();
	int mydata = 200; // local variable
	//java code - scriptlet
%>
Data is <%= data %>
<button>Click Me</button>
</body>
</html>