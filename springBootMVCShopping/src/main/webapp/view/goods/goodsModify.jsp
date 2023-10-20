<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="goodsModify.goods" method="post" name="frm" id="frm">
<table border=1 align="center" width="600">
<caption>상품 상세보기</caption>
<tr><th width="150">상품번호</th>
	<td><input type="text" name="goodsNum" value="${dto.goodsNum }" readonly="readonly"/></td></tr>
<tr><th>상품명</th>
	<td><input type="text" name="goodsName" value="${dto.goodsName }"/></td></tr>
<tr><th>상품가격</th>
	<td><input type="number" name="goodsPrice" value="${dto.goodsPrice }"/></td></tr>
<tr><th>배송비</th>
	<td><input type="number" name="deliveryCost" value="${dto.deliveryCost }"/></td></tr>
<tr><th>상품설명</th>
	<td><textarea rows="5" cols="50" name="goodsContent">${dto.goodsContent}</textarea></td></tr>
<tr><th>조회수</th>
	<td><input type="number" value="${dto.visitCount }" /></td></tr>
<tr><th>등록한 사원</th><td>${dto.employeeNum }</td></tr>
<tr><th>등록일</th><td>${dto.goodsRegist }</td></tr>
<tr><th>마지막 수정 사원</th><td>${dto.updateEmpNum }</td></tr>
<tr><th>마지막 수정일</th><td>${dto.goodsUpdateDate }</td></tr>
<tr><th>대문이미지</th><td>${dto.goodsMainStore }</td></tr>
<tr><th>설명이미지</th><td>${dto.goodsImages }</td></tr>
<tr><th colspan="2"><input type="submit" value="수정완료" /></th></tr>
</table>
</form>
</body>
</html>