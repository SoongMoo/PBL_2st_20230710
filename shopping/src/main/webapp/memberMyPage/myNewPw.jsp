<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script 
	src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.1.min.js"></script>
<script>
	$(function(){
		$("#frm").submit(function(){
			if($("#newPw").val() != $("#newPwCon").val()){
				alert("비밀번호와 비밀번호 확인이 다릅니다.");
				$("#newPw").val("");
				$("#newPwCon").val("");
				$("#newPw").focus();
				return false;
			}
		});
	});
</script>
</head>
<body>
<form action="memberPwPro.my" method="post" name="from" id="frm">
현재비밀번호 : <input type="password" name="oldPw"  required="required"/><br />
새 비밀번호 : <input type="password" name="newPw" id="newPw" required="required"/><br />
새 비밀번호 확인 : <input type="password" name="newPwCon" id="newPwCon" required="required"/><br />
<input type="submit" value="비밀번호 변경"/>
</form>
</body>
</html>