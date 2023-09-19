<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>findId.jsp</title>
</head>
<body>
<form action="idFind.help" name="frm" id="frm" method="post">
	<table border="1" width=600 align="center">
		<tr><th>전화번호</th>
		    <td><input type="text" name="userPhone" required="required"/></td></tr>
		<tr><th>이메일</th>
		    <td><input type="email" name="userEmail" required="required"/></td></tr>
		<tr><th colspan="2"><input type="submit" value="아이디 찾기"/></th></tr>
	</table>
</form>
</body>
</html>