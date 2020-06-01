<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach var="dto" items="${list2}">
검색한 ID: ${dto.id}<br>
검색한 bbsNum: ${dto.bbsNum}<br>
검색한 content: ${dto.content}<br>
검색한 Writer: ${dto.writer}<br>
<hr>
</c:forEach>