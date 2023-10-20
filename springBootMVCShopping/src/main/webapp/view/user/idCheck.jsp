<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.1.min.js"></script>
<script>
	$(function(){
		$("#btn").click(function(){
			var idCheck = $("#idCheck").val();
			$(opener.document).find("#userId").val(idCheck);
			window.self.close();
		});
	});
</script>
</head>
<body>
<form action="idCheck.nhn" method="post">
<table>
	<tr><th>
		검색 : <input type="search" name="idCheck" id="idCheck" 
				value="${idCheck }"/>
		<input type="submit" value="확인">
		<c:if test="${!empty auth  }">
			<div style="color:red">사용중인 아이디 입니다.</div>
		</c:if>
		<c:if test="${empty auth && !empty idCheck}">
			<div style="color:blue">사용가능한 아이디입니다. 
			<button type="button" id="btn">아이디 사용</button></div>
		</c:if>
	</th></tr>
</table>
</form>
</body>
</html>