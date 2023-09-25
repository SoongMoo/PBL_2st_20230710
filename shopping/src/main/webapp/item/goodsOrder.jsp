<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
</table>
</p>
<p>
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
			<tr><td align="left"> 총결제 금액 <br /><br /><br /><br /><br /> </td>
			    <td>${goodsTotalPrice }원<br /><br /><br /><br /><br /></td></tr>
			<tr><td align="center"  colspan=2><input type="submit" value="구매하기"/></td></tr>
		</table>
    </td>
</tr>
</table>
</p>
</body>
</html>