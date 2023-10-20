<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
비밀번호 확인<br />
<ul>
	<li><a href="memberMyPage.my">내정보 보기</a></li>
	<li><a href="memberUpdate.my">내정보 수정</a></li>
	<li><a href="userPwModify.my">비밀번호변경</a></li>
	<li><a href="memberDrop.my">회원탈퇴</a></li>
</ul>
<form  action="memberPwModify.my" method="post" id="frm" name="frm">
비밀번호 확인 : <input type="password" name="memberPw" required="required"/>
<input type="submit" value="확인"/>
<div style="color:red">${errPw }</div>
</form>
</body>
</html>