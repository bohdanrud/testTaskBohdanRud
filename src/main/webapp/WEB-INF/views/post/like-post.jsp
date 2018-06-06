<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/WEB-INF/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Like</title>
</head>
<body>



	<form:select path="users" items="${ users }" itemLabel="fullName" itemValue="id"></form:select> <br>
	
	
<a href="like-post/like">Like Post</a> <br>

</body>
</html>