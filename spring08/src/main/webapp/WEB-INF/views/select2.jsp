<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${writer}님이 로그인 중 입니다.</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
$(function() {
	$.ajax({
		url:"all.do",
		data:{
			bbsNum : "${dto.id}"
		},
		success : function(result){
			$("div").append(result)
		}
	})
	
	$('#button').click(function() {
		$.ajax({
			url:"add.do",
			data:{
				id : $("#id").val(),
				bbsNum : "${dto.id}",
				content : $("#content").val(),
				writer :'${writer}'
			},
			success : function(result){
				location.href="select2.do?id=${dto.id}"
			}
		})
		
	})
	
})
</script>
</head>
<body bgcolor="#21d9cc">
<h1 align="center"> ${dto.id}의 검색 결과 값</h1>
<hr>
<table border="1" align="center">
	<tr>
		<th>Num</th>
		<th>Title</th>
		<th>Content</th>
		<th>Writer</th>
	</tr>
	<tr>
		<td>${dto.id}</td>
		<td>${dto.title}</td>
		<td>${dto.content}</td>
		<td>${dto.writer}</td>
	</tr>
</table>
댓글 번호<input type="text" id='id'><br>
댓글 내용 <input type="text" id='content'><br>
<button type="button" id="button"  class="btn btn-warning">댓글 추가</button>
<hr>
<div>
<%-- <c:forEach var="dto" items="${list2}">
검색한 ID: ${dto.id}<br>
검색한 bbsNum: ${dto.bbsNum}<br>
검색한 content: ${dto.content}<br>
검색한 Writer: ${dto.writer}<br>
<hr>
</c:forEach> --%>
</div>
</body>
</html>