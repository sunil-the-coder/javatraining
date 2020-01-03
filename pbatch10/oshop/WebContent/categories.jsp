<%@page import="com.nobel.oshop.model.Category"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%-- <c:forEach items="categories" var="category">
	<c:out value="category.catName"></c:out>
</c:forEach>
 --%>
 
 
<body>
	<table border=1>
		<tr>
			<th>Name</th>
			<th>Description</th>
			<th>Image</th>
		</tr>

		<%
			List<Category> categories = (List<Category>) request.getAttribute("categories");
			for (Category category : categories) {
		%>
		<tr>
			<td><%=category.getCatName()%></td>
			<td><%=category.getCatDesc()%></td>
			<td><a href='products?catId=<%=category.getId()%>'><img src='images/<%=category.getCatImgUrl() %>' width='50%' height='50%'/></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>