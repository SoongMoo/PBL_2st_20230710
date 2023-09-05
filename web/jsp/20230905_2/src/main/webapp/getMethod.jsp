<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
다음페이지에  <a href="requestParam.jsp?where=이숭무">이숭무</a> 전달
<form name="frm" action="requestParam.jsp" method="post">
	아이디 : <input type="text" name="userId" /><br />
	비밀번호 : <input type="password" name="userPw" /><br />
	자기소개서 : <textarea rows="5" cols="10" name="desc"></textarea><br />
	item : <select name="item" >
				<option >배구</option>
				<option >축구</option>
				<option >농구</option>
				<option >야구</option>
			</select><br />
	<input type="submit" value="전송">
	<input type="reset" value="초기화">
</form>
</body>
</html>