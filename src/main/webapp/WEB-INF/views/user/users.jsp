<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/WEB-INF/taglib.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Users</title>
</head>
<body>

<br>
<c:forEach items="${usersList}" var="user">
<table border="1" class="table table-bordered">
<tr>
<td align="center">ID: ${ user.id } |Name: ${ user.fullName } |Age: ${ user.age } |Country: ${ user.country } |Registered: ${ user.createdAt } 
<a href="/user/users/delete/${user.id}">Delete this user</a></td>
</tr>

<tr>
<td>
Liked posts:
<c:forEach items="${user.posts}" var="post">
	ID: ${ post.id } |Name: ${ post.name } ;
</c:forEach>
</td>
<tr>

</table>
</c:forEach>
</body></html>






