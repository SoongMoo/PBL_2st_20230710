<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="js/daumAddressScript.js"></script>
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
<input type="hidden" name="deliveryName" value="${list[0].goodsName }외 ${list.size() - 1}개"/>
<input type="hidden" name="goodsNums" value="${goodsNums }"/>
<input type="hidden" name="goodsTotalPrice" 
	value="${goodsTotalPrice +  totalDeliveryCost}"/>
<table width="700"  align="center">
<tr>
	<td>
		<table width="350">
			<tr><td colspan=2>2. 배송 정보</td></tr>
			<tr><td>받는 사람 </td>
			    <td><input type="text" name="deliveryName" /></td></tr>
			<tr><td>받는 사람 주소 </td>
				<td><input type="text" name="deliveryAddr" onclick="execDaumPostcode();" 
							readonly="readonly" id="sample4_roadAddress"/></td></tr>
			<tr><td>받는 사람 상세 주소 </td>
				<td><input type="text" name="deliveryAddrDetail" /></td></tr>
			<tr><td>받는 사람 우편번호 </td>
				<td><input type="text" name="deliveryPost" id="sample4_postcode" 
							readonly="readonly" /></td></tr>
			<tr><td>받는 사람 연락처 </td>
				<td><input type="tel" name="deliveryPhone" /></td></tr>
			<tr><td>배송 메세지 </td>
				<td><input type="text" name="message" /></td></tr>
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