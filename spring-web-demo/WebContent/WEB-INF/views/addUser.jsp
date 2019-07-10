<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="addUser" commandName="user" method="post">
	Username <form:input path="uname"/> <br>
	Password <form:input path="pwd"/> <br>
	<input type="submit" value="Add User">
</form:form>
	
</body>
</html>