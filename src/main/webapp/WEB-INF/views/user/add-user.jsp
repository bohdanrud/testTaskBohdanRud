<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/WEB-INF/taglib.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add user</title>
</head>
<body>
<form:form action="add-user" method="POST" modelAttribute="userModel" class="form-horizontal">
<div class="container">
<form:input path="fullName" class="form-control"/><form:errors path="fullName" cssClass="error"></form:errors><br>
<form:input path="age" class="form-control"/><form:errors path="age" cssClass="error"></form:errors> <br>
<form:input path="email" class="form-control"/><form:errors path="email" cssClass="error"></form:errors> <br>
<form:input path="password" class="form-control"/><form:errors path="password" cssClass="error"></form:errors> <br>
<form:select path="country" items="${ countries }" class="form-control"></form:select> <br>

<input type="submit" value="Add user" class="form-control">
</div>
</form:form>
</body></html>