<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> JSTL Demo</h1>
	<h3>Name: <c:out value="${name }" /></h3>
	<h3>Happiness: ${happiness }</h3>
	<h3>Is hungry?: ${isHungry }</h3>
	<h1> If-statement</h1>
	<c:if test="${happiness > 5 }">
		<h3>I am happy</h3>
	</c:if>	
	
	<h1> If-else statement</h1>
	<c:choose>
		<c:when test="${isHungry }">
			<h3>I am hungry</h3>
		</c:when>
		<c:otherwise>
			<h3>I am full</h3>
		</c:otherwise>
	</c:choose>
	
	<h1>For-loop</h1>
	<ul>
		<c:forEach var="eachSkill" items="${skillList }">
		<li><c:out value="${eachSkill }"/></li>
		</c:forEach>
	</ul>
	
</body>
</html>