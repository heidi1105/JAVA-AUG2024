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
	<h1>Review Form</h1>
	<form action="/reviews/process" method="POST">
		<p>
			<label for="title">Title: </label>
			<input type="text" name="title" />
		</p>
		<p>
			<label for="reviewer">Reviewer: </label>
			<input type="text" name="reviewer" />
		</p>
		<p>
			<label for="rating">Rating: </label>
			<input type="number" name="rating" />
		</p>
		<p>
			<label for="description">Description: </label>
			<textarea name="description"></textarea>
		</p>
		<button type="submit">Submit</button>
	</form>
</body>
</html>