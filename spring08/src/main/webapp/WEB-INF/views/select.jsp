<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체 검색 결과입니다.</title>
</head>
<body bgcolor="#21d9cc">
<h1 align="center">전체 검색 결과 값</h1>
<hr>
<table border="1" align="center">
	<tr>
		<th>Num</th>
		<th>Title</th>
		<th>Writer</th>
	</tr>
<c:forEach items="${list}" var="dto">
	<tr>
		<td>${dto.id}</td>
		<td><a href="select2.do?id=${dto.id}">${dto.title}</a></td>
		<td>${dto.writer}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>