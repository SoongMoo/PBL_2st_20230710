<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="inquireModify.inq" id="frmMain">

<input type="hidden" name="inquireNum" value="${dto.inquireNum}">
<p>상품명 : ${dto.goodsNum}</p>

<table>
<tr><th>제목</th>
	<td><input type="text" name="inquireSubject"  
							value="${dto.inquireSubject}" /></td>
</tr>

<tr><th>내용</th>
	<td><textarea cols="50" rows="10" name="inquireContent">${dto.inquireContent}</textarea></td>
</tr>

<tr>
	<td colspan="2">
		<input type="submit" value="문의수정" /> 
		<input type="button" value="취소" 
				onclick="javascript:self.close();"/>
	</td>
</tr>
</table>
</form>
</body>
</html>