<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Review Result</h1>
	<h3>Title: <c:out value="${title }"></c:out></h3>
	<h3>Reviewer: <c:out value="${reviewer }"></c:out></h3>
	<h3>Rating: <c:out value="${rating }"></c:out></h3>
	<h3>Description: <c:out value="${description }"></c:out></h3>
</body>
</html>