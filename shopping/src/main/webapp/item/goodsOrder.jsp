<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table width="700" align="center">
<tr><td>주문서<hr />1. 주문상품</td></tr>
</table>
<p>
<table width="700" align="center">
<tr><td>주문 상품 정보 </td><td>수량/상품금액</td></tr>
<c:forEach items="${list }" var="dto" >
	<tr><td><img src="goods/images/${dto.goodsImage }" width ="30"/><br />
	 		${dto.goodsName }<hr />
	     </td><td>${dto.cartQty } 개 / 
	     <fmt:formatNumber value="${dto.totalPrice / dto.cartQty }" 
	     	type="currency"/>원  |
	      <fmt:formatNumber value="${dto.totalPrice}" type="currency"/>원
	     		</td></tr>
</c:forEach>
</table>
</p>
<p>
<form action="goodsOrder.item" method="post">
<input type="hidden" name="goodsNums" value="${goodsNums }"/>
<input type="hidden" name="goodsTotalPrice" 
	value="${goodsTotalPrice +  totalDeliveryCost}"/>
<table width="700"  align="center">
<tr>
	<td>
		<table width="350">
			<tr><td colspan=2>2. 배송 정보</td></tr>
			<tr><td>받는 사람 </td>
			    <td><input type="text" name="receiveName" /></td></tr>
			<tr><td>받는 사람 주소 </td>
				<td><input type="text" name="receiveAddr" /></td></tr>
			<tr><td>받는 사람 연락처 </td>
				<td><input type="text" name="receivePhone" /></td></tr>
		</table>
	</td>
    <td>
    	<table width="350">
			<tr><td colspan=2 align="left">3. 결제금액</td></tr>
			<tr><td align="left"> 총 결제 금액 </td>
			    <td>${goodsTotalPrice }원</td></tr>
			<tr><td align="left"> 총 배송비 금액 </td>
			    <td>${totalDeliveryCost }원</td></tr>
			<tr><td align="center"  colspan=2><input type="submit" value="구매하기"/></td></tr>
		</table>
    </td>
</tr>
</table>
</form>
</p>
</body>
</html>