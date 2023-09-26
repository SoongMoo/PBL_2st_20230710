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
${userId }님 ${price }원이 결제 완료되었습니다.<br />
<a href="purchaseList.item">구매리스트로 가기</a> | 
<a href="<c:url value='/' />" >홈</a>
</body>
</html>