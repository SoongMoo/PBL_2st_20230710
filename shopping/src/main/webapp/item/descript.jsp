<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="800" align="center">		
		<tr>
			<td colspan="2">${fn:replace(dto.goodsContent,newLine,"<br />") }<br />
				<c:forTokens items="${dto.goodsImages }" delims="`" var="img">
					<img src="goods/images/${img }" height="300" />
					<br />
				</c:forTokens>
			</td>
		</tr>
	</table>
</body>
</html>