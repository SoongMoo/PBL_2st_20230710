<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>deliveryList.jsp</title>
</head>
<body>
회원구매정보 <br />
<table width="600">
	<tr><td>구매번호</td><td>결제금액</td><td>회원번호</td><td>결제상태</td></tr>
	<c:forEach items="${dtos }" var="dto">
		<tr><td>${dto.purchaseNum }</td>
			<td>${dto.purchasePrice }</td>
			<td>${dto.memberNum }</td>
			<td><c:if test="${dto.confirmNum == 0 }">결제대기중</c:if>
				<c:if test="${dto.confirmNum != 0 and dto.deliveryNum == 0}">배송정보등록</c:if>
				<c:if test="${dto.confirmNum != 0 and dto.deliveryNum != 0}">배송정보수정</c:if>
			</td></tr>
	</c:forEach>
</table>

</body>
</html>