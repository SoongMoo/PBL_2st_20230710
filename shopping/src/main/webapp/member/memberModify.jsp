<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberModify.jsp</title>
</head>
<body>
회원 정보 수정<br />
<form action="memberModify.mem" method="get" name="frm">
회원번호 : <input type="text" name="memberNum" value="${memVO.memberNum }"/><br />
회원아이디 : <input type="text" name="memberId" value="${memVO.memberId }"/><br />
회원이름 : <input type="text" name="memberName" value="${memVO.memberName }"/><br />
연락처 : <input type="tel" name="memberPhone" value="${memVO.memberPhone }"/><br />
주소 : <input type="text" name="memberAddr" value="${memVO.memberAddr }"/><br />
성별 : <input type="radio" value='F'  name="memberGender" 
		<c:if test="${memVO.memberGender == 'F'}">checked</c:if>
	 value="F" />여자
	<input type="radio" value='M'  name="memberGender"
		<c:if test="${memVO.memberGender == 'M'}">checked</c:if>
	value="M" />남자<br />
생년월일 : <input type="date" name="memberBirth" value="${memVO.memberBirth }"/><br />
이메일 : <input type="text" name="memberEmail" value="${memVO.memberEmail }"/><br />
<input type="submit" value="회원수정 완료" />
<input type="button" value="뒤로가기" 
	onclick="javascript:history.back();" />
</form>
</body>
</html>