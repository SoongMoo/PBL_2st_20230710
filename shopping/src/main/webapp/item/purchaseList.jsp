<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
function purchased(purchaseNum){
	location.href='purchased.item?purchaseNum='+purchaseNum;
}
</script>
</head>
<body>
<table width="800" align="center">
<tr><td>주문번호 / 결제번호</td><td> 상품명 </td><td> 주문상태 </td></tr>
<c:forEach items="${list }" var="dto" >
<tr><td>${dto.purchaseNum } / 
		<c:if test="${empty dto.confirmNum }">결제대기중</c:if>
		<c:if test="${!empty dto.confirmNum }">${dto.confirmNum }</c:if> </td>
		
	<td> <img src="goods/images/${dto.goodsImage }" 
			width="30px"/>
		 ${dto.goodsName } </td>
	
	<td> <c:if test="${empty dto.confirmNum }">
			<a href="paymentOk.item?orderNumber=${dto.purchaseNum }">결제하기</a>
			<a href="purchaseDelete.item?purchaseNum=${dto.purchaseNum }">구매삭제</a>			
			</c:if>
		 <c:if test="${!empty dto.confirmNum and empty dto.deliveryState}">
		 	<a href="paymentDelete.item?purchaseNum=${dto.purchaseNum }" >결제취소</a>
		 </c:if>
		 <c:if test="${!empty dto.deliveryState }">
		 	${dto.deliveryState}
		 	<c:if test="${dto.deliveryState == '배송완료' and dto.deliveryStatus!='구매확정'}">
		 		<button type="button" onclick="purchased('${dto.purchaseNum }');">구매확정</button>
		 	</c:if>
		 	<c:if test="${dto.deliveryStatus=='구매확정'  and empty dto.reviewNum}">
		 		<a href="reviewRegist.review?purchaseNum=${dto.purchaseNum }&goodsNum=${dto.goodsNum}">리뷰등록</a>
		 	</c:if>
		 	<c:if test="${dto.deliveryStatus=='구매확정'  and !empty dto.reviewNum}">
		 		리뷰수정 | 리뷰삭제
		 	</c:if>
		 </c:if>
	</td></tr>
</c:forEach>
</table>
</body>
</html>