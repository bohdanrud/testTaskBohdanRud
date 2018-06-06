<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ include file="/WEB-INF/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Choose</title>
</head>
<body>
<h3>Choose user, who want to "Like" this post</h3>
<br>
<c:forEach items="${usersList}" var="user">
<table border="1" class="table table-bordered">
<tr>
<td>
User Name: ${ user.fullName }<br>
<a href="/post/chose-user/user/${user.id}">Choose</a>
</td></tr></table>
</c:forEach>

</body>
</html>