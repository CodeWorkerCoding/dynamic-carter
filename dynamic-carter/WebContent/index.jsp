<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
</head>
<body>
	<p>Hello World, this is carter project.</p>
	<form action="login" method="post">
		username:<input name="username" type="text"/><br>
		password:<input name="password" type="password"/><br>
		<input value="sign in" type="submit"/>
	</form>
	<div class="commdity">
		<c:forEach items="${commdities}" var="commdity">
			<div>${commdity.commdityName }</div><br>
		</c:forEach>
	</div>
</body>
</html>