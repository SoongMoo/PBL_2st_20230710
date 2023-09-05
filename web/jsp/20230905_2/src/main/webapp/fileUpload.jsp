<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" name="frm" action="fileRequest.jsp" 
							enctype="multipart/form-data">
이름 : <input type="text" name="userName" /><br />
파일 : <input type="file" name="upFile1"/><br />
	  <input type="file" name="upFile2"/><br />
	  <input type="file" name="upFile3"/><br />
<input type="submit" value="전송" />
</form>
</body>
</html>