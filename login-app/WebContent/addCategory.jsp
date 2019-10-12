<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="com.itp.oshop.model.Category"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="category" type="com.itp.oshop.model.Category" scope="application"/>
<jsp:setProperty property="*" name="category"/>
<%
	//3. Save the object directly to database		
	SessionFactory sessionFactory = (SessionFactory) application.getAttribute("globalSessionFactory");
	Session hibSession = sessionFactory.openSession();
	hibSession.beginTransaction();
	hibSession.save(category);
	hibSession.getTransaction().commit();	
	hibSession.close();

%>
<h2> New Category has been added to portal. </h2>
</body>
</html>