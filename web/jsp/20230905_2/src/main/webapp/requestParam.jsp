<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	
	String num = request.getParameter("where");
	String pw = request.getParameter("userPw");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= request.getParameter("where") %><br />
<%= num %><br />
아이디 : <%= request.getParameter("userId") %><br />
비밀번호 : <%= pw %>
자기소개 : <%= request.getParameter("desc") %><br />
아이템 : <%= request.getParameter("item") %><br />
</body>
</html>