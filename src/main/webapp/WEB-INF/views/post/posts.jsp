<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/WEB-INF/taglib.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Posts</title>
</head>
<body>

<br>
<c:forEach items="${postsList}" var="post">
<table border="1" class="table table-bordered">
<tr>
<td>
Post ID: ${ post.id } |Name: ${ post.name } <br>
Text: ${ post.postsText } <br>
Date: ${ post.createdAt } <br>
<a href="/post/posts/like/${post.id}">Like</a> <br>
<a href="/post/posts/delete/${post.id}">Delete</a>
</td>
</tr>
</table>
</c:forEach>
<br>

</body></html>