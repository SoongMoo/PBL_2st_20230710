<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String userName = request.getParameter("userName");
	String [] item = request.getParameterValues("item");
	String [] cp = request.getParameterValues("cp");
	String status = request.getParameter("M_Status");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
이름 : <%= userName %><br />
취미 : <%  for(String str : item){%>
		<%= str %>,
	  <%  } %><br />
관심분야 : <% for(String like : cp){
				out.print(like + ",");			
			}
		  %><br />
결혼여부 : <%= status %>
</body>
</html>