<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>goodsList.jsp</title>
</head>
<body>
상품 목록<br/>
<table border=1 width="600" align="center">
	<tr><td>번호</td><td>상품번호</td><td>상품명</td>
	    <td>상품가격</td><td>등록일</td></tr>
	<c:forEach items="${dtos }" var="dto" varStatus="status">
		<tr><td>${status.count }</td>
			<td><a href="goodsDetail.goods?num=${dto.goodsNum }">${dto.goodsNum }</a></td>
			<td>${dto.goodsName }</td><td>${dto.goodsPrice }</td>
			<td>${dto.goodsRegist }</td></tr>	
	</c:forEach>
</table>
<p>
<a href="goodsWrite.goods">상품 추가</a>
</p>
</body>
</html>