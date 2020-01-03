<%@page import="com.nobel.oshop.model.Category"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
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
			<td><%=category.getCatImgUrl()%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>