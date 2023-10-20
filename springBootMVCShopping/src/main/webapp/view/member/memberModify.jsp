<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberModify.jsp</title>
</head>
<body>
회원 정보 수정<br />
<form action="memberModify.mem" method="get" name="frm">
<table border=1 width="600px" align="center">
	<tr><th width="200">회원번호</th>
		<td width="400"><input type="text" name="memberNum" value="${dto.memberNum }"  readonly="readonly"  /></td></tr>	
	<tr><th width="200">이름</th>
		<td width="400"><input type="text" name="memberName" value="${dto.memberName }" /></td></tr>	
	<tr><th>아이디</th>
		<td><input type="text" name="memberId" value="${dto.memberId }" readonly="readonly"/></td></tr>
	<tr><th>* 주소</th>
		<td><input type="text" name="memberAddr" value="${dto.memberAddr }" /></td></tr>	
	<tr><th>* 상세주소</th>
		<td><input type="text" name="memberAddrDetail" value="${dto.memberAddrDetail }"/></td></tr>	
	<tr><th>* 우편번호</th>
		<td><input type="text" name="memberPost" value="${dto.memberPost }" /></td></tr>	
	<tr><th>* 연락처1</th>
		<td><input type="tel" name="memberPhone1" value="${dto.memberPhone1 }"/></td></tr>	
	<tr><th>* 연락처2</th>
		<td><input type="tel" name="memberPhone2" value="${dto.memberPhone2 }"/></td></tr>	
	<tr><th>* 성별</th>
		<td><input type="radio" name="memberGender" value="F" 
			<c:if test="${dto.memberGender == 'F' }">checked</c:if> />여자
			<input type="radio" name="memberGender" value="M" 
			<c:if test="${dto.memberGender == 'M' }">checked</c:if> />남자</td></tr>	
	<tr><th>등록일</th>
		<td><input type="date" name="memberRegist" value="${dto.memberRegist }" readonly="readonly"/></td></tr>	
	<tr><th>* 생년월일</th>
		<td><input type="date" name="memberBirth" value="${dto.memberBirth }"/></td></tr>	
	<tr><th>* 이메일</th>
		<td><input type="email" name="memberEmail" value="${dto.memberEmail }"/></td></tr>	
	<tr><th colspan="2">
			<input type="submit" value="회원수정 완료" />
			<button type="button" onclick="javascript:location.href='memberList.mem'">뒤로가기</button>
 	</th></tr>	
</table>
</form>
</body>
</html>