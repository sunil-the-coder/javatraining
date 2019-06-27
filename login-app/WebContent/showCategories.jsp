<%@page import="com.itp.oshop.model.Category"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<table border=1>
		<tr><th>Name</th><th>Description</th><th> Image </th></tr>		
		<c:forEach items="${listCategories}" var="category">
			<tr>
			<td><c:out value="${category.catName}"></c:out></td>
			<td><c:out value="${category.catDesc}"></c:out></td>
			<td><c:out value="${category.catImgUrl}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>