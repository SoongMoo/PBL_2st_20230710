<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
배송정보 수정<br />
<form action="deliveryUpdate.deli" method="post">
주문번호 : <input type = "text" value="${dto.purchaseNum }" name="purchaseNum"  
				readonly="readonly" /><br />
송장번호 : <input type = "text" value="${dto.deliveryNum }" name="deliveryNum"
				required="required" /><br /> 
송장입력 날짜 : ${dto.deliveryDate } <br />
배송상태 : <select name="deliveryState">
			<option>===선택하여주세요.===</option>
			<option <c:if test="${dto.deliveryState == '배송중'}">selected="selected"</c:if>>배송중</option>
			<option <c:if test="${dto.deliveryState == '배송완료'}">selected="selected"</c:if>>배송완료</option>
		 </select><br />
<input type="submit" value="송장번호등록" />
</form>
</body>
</html>