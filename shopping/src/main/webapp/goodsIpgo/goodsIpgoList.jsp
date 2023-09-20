<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>goodsIpgoList.jsp</title>
</head>
<body>
입고리스트  | 상품입고
<span >입고현황</span><br />
<table width=600 border=1 align="center">
	<tr><th>번호</th><th>입고번호</th><th>상품 번호</th><th>수량</th><th>입고일</th></tr>
	<c:forEach items="${dtos }" var="dto" varStatus="status">
	<tr><th>${status.count }</th>
		<th><a href=
		"goodsIpgoDetail.ipgo?ipgoNum=${dto.goodsIpgoNum }&num=${dto.goodsNum }">
			${dto.goodsIpgoNum }
			</a></th>
		<th><a href=
		"goodsIpgoDetail.ipgo?ipgoNum=${dto.goodsIpgoNum }&num=${dto.goodsNum }">
		${dto.goodsNum }
		</a></th>
		<th>${dto.ipgoQty }</th><th>${dto.ipgoDate }</th></tr>
	</c:forEach>
</table>
</body>
</html>