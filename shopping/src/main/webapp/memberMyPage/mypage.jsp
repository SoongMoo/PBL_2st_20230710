<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"></script>
</head>
<body>
내정보
<ul>
	<li><a href="memberMyPage.my">내정보 보기</a></li>
	<li><a href="memberUpdate.my">내정보 수정</a></li>
	<li><a href="userPwModify.my">비밀번호변경</a></li>
	<li><a href="memberDrop.my">회원탈퇴</a></li>
</ul>
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
</body>
</html>