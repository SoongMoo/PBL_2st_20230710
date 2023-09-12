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
회원번호 : ${memVO.memberNum }<br />
회원아이디 : ${memVO.memberId }<br />
회원이름 : ${memVO.memberName }<br />
연락처 : ${memVO.memberPhone }<br />
주소 : ${memVO.memberAddr }<br />
성별 : <c:if test="${memVO.memberGender == 'F'}">여자</c:if>
     <c:if test="${memVO.memberGender == 'M'}">남자</c:if> <br />
생년월일 : ${memVO.memberBirth }<br />
이메일 : ${memVO.memberEmail }<br />
<a href="memberUpdate.mem?memberNum=${memVO.memberNum }">회원 수정</a> | 
<a href="memberdelete.mem?memberNum=${memVO.memberNum }">회원 강제 탈퇴</a> | 
<a href="memberList.mem">회원목록</a>
</body>
</html>