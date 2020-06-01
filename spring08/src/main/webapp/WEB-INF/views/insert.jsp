<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
당신의 등록한 정보
<hr><!-- 표현식(Expression) -> 표현언어(Expression Language:EL) -->
<table border="1" >
	<tr>
		<td>Num</td>
		<td>Title</td>
		<td>Content</td>
		<td>Writer</td>
	</tr>
	<tr>
		<td>${bbsDTO.id}</td>
		<td>${bbsDTO.title}</td>
		<td>${bbsDTO.content}</td>
		<td>${bbsDTO.writer}</td>
	</tr>
</table>
</body>
</html>