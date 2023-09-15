<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="js/daumAddressScript.js"></script>
</head>
<body>
내정보 수정<br />
<ul>
	<li><a href="memberMyPage.my">내정보 보기</a></li>
	<li><a href="memberUpdate.my">내정보 수정</a></li>
	<li><a href="userPwModify.my">비밀번호변경</a></li>
	<li><a href="memberDrop.my">회원탈퇴</a></li>
</ul>
<form name="frm" action="memberModify.my" method="post">
<table border=1 width="600px">
	<tr><th width="200">이름</th>
		<td width="400"><input type="text" name="memberName" 
			value="${dto.memberName }" /></td></tr>	
	<tr><th>아이디</th>
		<td><input type="text" name="memberId" 
			value="${dto.memberId }" readonly="readonly"/></td></tr>
	<tr><th>비밀번호</th>
		<td><input type="password" name="memberPw" />
			<div style="color:red">${errPw }</div>
		</td></tr>	
	<tr><th>* 주소</th>
		<td><input type="text" name="memberAddr" id="sample4_roadAddress"
			value="${dto.memberAddr }" readonly="readonly"/>
			<button type="button" onclick="execDaumPostcode();">주소검색</button></td></tr>	
	<tr><th>* 상세주소</th>
		<td><input type="text" name="memberAddrDetail" 
			value="${dto.memberAddrDetail }"/></td></tr>	
	<tr><th>* 우편번호</th>
		<td><input type="text" name="memberPost" id="sample4_postcode"
			value="${dto.memberPost }" readonly="readonly"/></td></tr>	
	<tr><th>* 연락처1</th>
		<td><input type="tel" name="memberPhone1" 
			value="${dto.memberPhone1 }"/></td></tr>	
	<tr><th>* 연락처2</th>
		<td><input type="tel" name="memberPhone2" 
			value="${dto.memberPhone2 }"/></td></tr>	
	<tr><th>* 성별</th>
		<td><input type="radio" name="memberGender" value="F" 
			<c:if test="${dto.memberGender == 'F' }">checked</c:if> />여자
			<input type="radio" name="memberGender" value="M" 
			<c:if test="${dto.memberGender == 'M' }">checked</c:if> />남자</td></tr>	
	<tr><th>등록일</th>
		<td><input type="date" name="memberRegist" 
			value="${dto.memberRegist }" readonly="readonly"/></td></tr>	
	<tr><th>* 생년월일</th>
		<td><input type="date" name="memberBirth" 
			value="${dto.memberBirth }"/></td></tr>	
	<tr><th>* 이메일</th>
		<td><input type="email" name="memberEmail" 
			value="${dto.memberEmail }"/></td></tr>	
	<tr><th colspan="2">
			<input type="submit" value="수정완료" />
			<button type="button" onclick="javascript:location.href='memberMyPage.my'">수정취소</button>
 	</th></tr>	
</table>
</form>
</body>
</html>