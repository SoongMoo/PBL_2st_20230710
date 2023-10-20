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
		if($("#memberPw").val() == ""){
			alert("비밀번호를 입력해주세요.");
			$("#memberPw").focus();
			return false;
		}else{
			conf = confirm("정말 사실 리얼 진짜 탈퇴하시겠습니까?");
			if(!conf){
				return false;
			}
		}
	});
});
</script>
</head>
<body>
회원 탈퇴<br />
<ul>
	<li><a href="memberMyPage.my">내정보 보기</a></li>
	<li><a href="memberUpdate.my">내정보 수정</a></li>
	<li><a href="userPwModify.my">비밀번호변경</a></li>
	<li><a href="memberDrop.my">회원탈퇴</a></li>
</ul>
<form action="memberDropOk.my" method="post"  name="frm" id="frm">
	비밀번호 : <input type="password" id="memberPw" name="memberPw" />
	<input type="submit" value="회원탈퇴" />
	<div style="color:red">${errPw }</div>
</form>
</body>
</html>