<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="employeeList.emp">직원 목록</a>
	<a href="memberList.mem">회원 목록</a>
	<!-- 오늘은 회원가입부터 로그인까지 -->
	<table border="1">
		<tr><th colspan="2">
			<input type="checkbox" name="keepLogin" value="on"/>로그인 유지 |
			<input type="checkbox" name="storeId" value="store"/>아이디 저장
			</th></tr>
		<tr><th><input type="text" name="userId" placeholder="아이디"/></th>
			<th rowspan="2"><input type="submit" value="로그인" /></th></tr>
		<tr><th><input type="password" name="userPw" placeholder="비밀번호"/></th></tr>
		<tr><th colspan="2">
			아이디/비밀번호 찾기 | <a href="userAgree.nhn">회원가입</a>
			</th></tr>
	</table>
</body>
</html>






