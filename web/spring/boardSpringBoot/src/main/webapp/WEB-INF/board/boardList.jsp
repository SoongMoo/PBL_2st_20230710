<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
게시글 목록<br />
<table border= 1 width="600px">
<thead>
<tr><th>글번호</th><th>글쓴이</th><th>제목</th></tr>
</thead>
<tbody>
<c:forEach items="${lists }" var="dto">
<tr><td><a href="boardDetail?num=${dto.boardNum }">${dto.boardNum }</a></td>
	<td>${dto.boardWriter }</td>
	<td><a href="boardDetail?num=${dto.boardNum }">${dto.boardSubject }</a></td></tr>
</c:forEach>
</tbody>
</table><br />
<a href="boardWrite">글쓰기</a>   
</body>
</html>