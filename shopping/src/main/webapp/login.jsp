<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="login1.login" method="post" >
	<table border="1" align="center">
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
			<a href="idInquiry.help">아이디</a>/
			<a href="pwInquiry.help">비밀번호 찾기</a> | <a href="userAgree.nhn">회원가입</a>
			</th></tr>
	</table>
</form>
</body>
</html>