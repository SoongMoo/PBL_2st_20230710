<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberInfo.jsp</title>
</head>
<body>
회원 상세정보<br />
회원번호 : ${dto.memberNum }<br />
이름 : ${dto.memberName }<br />
아이디 : ${dto.memberId }<br />
주소 : ${dto.memberAddr }<br />
상세주소 : ${dto.memberAddrDetail }<br />
우편번호 : ${dto.memberPost }<br />
연락처1 : ${dto.memberPhone1 }<br />
연락처2 : ${dto.memberPhone2 }<br />
성별 : <c:if test="${dto.memberGender == 'M' }">남자</c:if> 
	  <c:if test="${dto.memberGender == 'F'}">여자</c:if><br />
등록일 : ${dto.memberRegist }<br />
생년월일 : ${dto.memberBirth }<br />
이메일 : ${dto.memberEmail }<br />
<a href="memberUpdate.mem?memberNum=${dto.memberNum }">회원 수정</a> | 
<a href="memberdelete.mem?memberNum=${dto.memberNum }">회원 강제 탈퇴</a> | 
<a href="memberList.mem">회원목록</a>
</body>
</html>