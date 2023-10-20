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
<c:if test="${!empty dto }">
${dto.userEmail }님의 임시비밀번호는 ${dto.userPw }입니다..
</c:if>
<c:if test="${empty dto }">
정보가 부족하여 임시비밀번호를 부여하지 못했습니다.<br />
고객센터 1234-5678로 문의하시거나 다시 시도해주세요.
</c:if>
</body>
</html>