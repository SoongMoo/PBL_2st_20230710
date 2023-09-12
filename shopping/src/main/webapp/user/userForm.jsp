<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>userForm.jsp</title>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.1.min.js"></script>
<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="js/daumAddressScript.js"></script>
<script>
$(function(){
	$("#frm").submit(function(){
		if($("#memberPw").val() != $("#memberPwCon").val()){
			alert("비밀번호와 비밀번호확인이 다릅니다.");
			$("#memberPw").val("");
			$("#memberPwCon").val("");
			$("#memberPw").focus();
			return false;
		}
	});
});
</script>
</head>
<body>
<form action="userRegist.nhn" method="post" name="frm" id="frm">
<table border="1" width="600px">
	<tr><th width="150px">*아이디</th>
		<td width="450px"><input type="text" name="memberId" required="required"/></td></tr>
	<tr><th >*회원비밀번호</th>
		<td ><input type="password" name="memberPw" id="memberPw" required="required"/></td></tr>
	<tr><th >*회원비밀번호확인</th>
		<td ><input type="password" name="memberPwCon" id="memberPwCon"required="required"/></td></tr>
	<tr><th >*회원명</th>
		<td ><input type="text" name="memberName" required="required"/></td></tr>
	<tr><th >*회원연락처1</th>
		<td ><input type="tel" name="memberPhone1" required="required"/></td></tr>
	<tr><th >회원연락처2</th>
		<td ><input type="tel" name="memberPhone2" /></td></tr>
	<tr><th >*회원주소</th>
		<td ><input type="text" name="memberAddr" 
				id="sample4_roadAddress" required="required" readonly="readonly"/>
			<button type="button" onclick="execDaumPostcode();">주소검색</button></td></tr>
	<tr><th >상세주소</th>
		<td ><input type="text" name="memberAddrDetail" /></td></tr>
	<tr><th >*우편번호</th>
		<td ><input type="text" name="memberPost" 
				id="sample4_postcode"  required="required" readonly="readonly"/></td></tr>
	<tr><th >이메일</th>
		<td ><input type="email" name="memberEmail" required="required"/></td></tr>
	<tr><th >생일</th>
		<td ><input type="date" name="memberBirth" required="required"/></td></tr>
	<tr><th >성별</th>
		<td ><input type="radio" name="memberGender" value="M" checked="checked"/>남자
						  <input type="radio" name="memberGender" value="F"/>여자</td></tr>
	<tr><th  colspan="2"><input type="submit" value="회원가입" />
						  <input type="button" value="회원가입취소"> 
		</th></tr>	
</table>
</form>
</body>
</html>