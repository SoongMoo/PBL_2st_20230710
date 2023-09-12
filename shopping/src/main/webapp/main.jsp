<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 로그인되었을 때 -->
<c:if test="${!empty dto }">
	<ul>
		<li><a href="employeeList.emp">직원 목록</a></li>
		<li><a href="memberList.mem">회원 목록</a></li>
	</ul>
	<!-- 오늘은 회원가입부터 로그인까지 -->
</c:if>
<!-- 비 로그인일 때 -->
<c:if test="${empty dto }">
<form action="login.login" method="post" >
	<table border="1">
		<tr><th colspan="2">
			<input type="checkbox" name="keepLogin" value="on"/>로그인 유지 |
			<input type="checkbox" name="storeId" value="store"/>아이디 저장
			</th></tr>
		<tr><th><input type="text" name="userId" placeholder="아이디"/>
				<div style="color:red">${errId }</div></th>
			<th rowspan="2"><input type="submit" value="로그인" /></th></tr>
		<tr><th><input type="password" name="userPw" placeholder="비밀번호"/>
				<div style="color:red">${errPw }</div></th></tr>
		<tr><th colspan="2">
			아이디/비밀번호 찾기 | <a href="userAgree.nhn">회원가입</a>
			</th></tr>
	</table>
</form>
</c:if>
</body>
</html>






