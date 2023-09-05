<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String str1 = "first string";
//                 0123456789
	String str2 = "second string";
%>
str1 : <%= str1 %><br />
str1.length() : <%= str1.length() %><br />
str1.charAt(4): <%= str1.charAt(4) %><br />
str1.indexOf("ing"): <%= str1.indexOf("ing") %><br />
str1.indexOf("st"):<%= str1.indexOf("st") %><br />
str1.indexOf("st", 4):<%= str1.indexOf("st", 4) %><br />
str1.indexOf("st", 4):<%= str1.indexOf("st", str1.indexOf("st") + 1) %><br />
str2.indexOf("s"):<%= str2.indexOf("s") %><br />
str : str1.substring(6, 6+3):<%= str1.substring(6, 6+3) %><br />
string : str1.substring(6) : <%= str1.substring(6) %><br />
</body>
</html>