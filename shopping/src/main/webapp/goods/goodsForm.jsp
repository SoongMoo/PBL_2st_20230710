<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="goodsRegist.goods" method="post" >
<table border = "1" width ="600" align="center">
	<tr><th width="100">상품번호</th>
		<td><input type="text" name="goodsNum" 
					value="${goodsNum }" readonly="readonly"/>번호자동부여</td></tr>
	<tr><th>상품명</th>
		<td><input type="text" name="goodsName"/></td></tr>
	<tr><th>상품가격</th>
		<td><input type="number" name="goodsPrice"/></td></tr>
	<tr><th>배송비</th>
		<td><input type="number" name="deliveryCost"/></td></tr>
	<tr><th>상품설명</th>
		<td><textarea rows="10" cols="50" name="goodsContent"></textarea></td></tr>
	<tr><th colspan="2"><input type="submit" value="상품등록" /></th></tr>
</table>
</form>
</body>
</html>