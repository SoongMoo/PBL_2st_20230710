<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.oreilly.servlet.MultipartRequest,
com.oreilly.servlet.multipart.DefaultFileRenamePolicy,
				java.io.File" %>
<%
	request.setCharacterEncoding("utf-8");
	//String userName = request.getParameter("userName");
	//String file = request.getParameter("upFile");
	String savePoint = application.getRealPath("/upload");
	int sizeLimit = 5 * 1024 * 1024;
	
	MultipartRequest multi = 
			new MultipartRequest(request,savePoint, sizeLimit,
					"utf-8", new DefaultFileRenamePolicy());
	String storeFileName = multi.getFilesystemName("upFile1");
	String originalName = multi.getOriginalFileName("upFile1");
	File file = multi.getFile("upFile1");
	long size = file.length();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= savePoint %><br />
원본 파일명 : <%= originalName %><br />
저장된 파일명 : <%= storeFileName %><br />
파일 사이즈 : <%= size %>Byte<br />
<%
storeFileName = multi.getFilesystemName("upFile2");
originalName = multi.getOriginalFileName("upFile2");
file = multi.getFile("upFile2");
size = file.length();
%>
원본 파일명 : <%= originalName %><br />
저장된 파일명 : <%= storeFileName %><br />
파일 사이즈 : <%= size %>Byte<br />
<%
storeFileName = multi.getFilesystemName("upFile3");
originalName = multi.getOriginalFileName("upFile3");
file = multi.getFile("upFile3");
size = file.length();
%>
원본 파일명 : <%= originalName %><br />
저장된 파일명 : <%= storeFileName %><br />
파일 사이즈 : <%= size %>Byte<br />
</body>
</html>