<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/WEB-INF/taglib.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add post</title>
</head>
<body>

<form:form action="add-post" method="POST" modelAttribute="postModel" class="form-horizontal">
<div class="container">

<form:input path="name" class="form-control"/><form:errors path="name" cssClass="error"></form:errors><br>

<form:input path="postsText" class="form-control"/><form:errors path="postsText" cssClass="error"></form:errors><br>

<input type="submit" value="Add post" class="form-control">

</div>
</form:form>

</body></html>