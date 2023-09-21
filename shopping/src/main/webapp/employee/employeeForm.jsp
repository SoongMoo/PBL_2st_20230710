<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.1.min.js"></script>
<script>
$(function(){
	$("#userId").click(function(){
		$("#userId").val("");
		window.open("idCheck.nhn","아이디검색","width=400, height=200, left=30, top=50");
	});
});
</script>
</head>
<body>
직원등록<br />
<form method="get" action="employeeRegist.emp" name="frm">
	<table border = 1 align="center">
		<tr><th>직원번호</th>
			<td><input type="text" name="empNum" readonly="readonly"
				value="${empNum }"/> :자동부여 </td></tr>
		<tr><th>직원이름</th>
			<td><input type="text" name="empName"/></td></tr>
		<tr><th>직원아이디</th>
			<td><input type="text" name="empId" id="userId" readonly="readonly"/></td></tr>
		<tr><th>직원비밀번호</th>
			<td><input type="password" name="empPw"/></td></tr>
		<tr><th>직원비밀번호확인</th>
			<td><input type="password" name="empPwCon"/></td></tr>
		<tr><th>직원주소</th>
			<td><input type="text" name="empAddr"/></td></tr>
		<tr><th>직원상세주소</th>
			<td><input type="text" name="empAddrDetail"/></td></tr>
		<tr><th>직원우편번호</th>
			<td><input type="text" name="empPost"/></td></tr>
		<tr><th>직원연락처</th>
			<td><input type="tel" name="empPhone"/></td></tr>
		<tr><th>직원주민번호</th>
			<td><input type="text" name="empJumin"/></td></tr>
		<tr><th>직원이메일</th>
			<td><input type="email" name="empEmail"/></td></tr>
		<tr><th>직원입사일</th>
			<td><input type="date" name="empEnterDate"/></td></tr>
		<tr><th colspan="2">
			<input type="submit" value="직원 등록">
			</th></tr>
	</table>
</form>
</body>
</html>