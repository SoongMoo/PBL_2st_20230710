<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>inquireAnswer.jsp</title>
<script>
	function goodsDetail(){
		window.open('goodsDetail.goods?num=${dto.goodsNum}','상품정보'
					,"width=800,height=700,left=100,top=100");
	}
</script>
</head>
<body>
<form action="inquireRepleUpdate.inq" method="post">
<p>상품번호 : <a href="javascript:goodsDetail();">${dto.goodsNum}</a></p>
<input type="hidden" name="inquireNum" value="${dto.inquireNum }">
<table width="600" border="1">
	<tr><th>문의 번호</th><td>${dto.inquireNum }</td></tr>
	<tr><th>질문자</th><td>${dto.memberNum }</td></tr>
	<tr><th>문의 제목</th><td>${dto.inquireSubject }</td></tr>
	<tr><th>문의 내용</th><td>${dto.inquireContent }</td></tr>
	<tr><th>답변한 사람</th><td>${dto.empNum }</td></tr>
	<tr><th>문의 답변</th>
		<td><textarea rows="10" cols="50" name="inquireAnswer">${dto.inquireAnswer }</textarea></td></tr>
	<tr><th>답변일</th><td>${dto.inquireAnswerDate }</td></tr>
	<tr><th colspan="2"><input type="submit" value="답변달기" /></th></tr>
</table>
</form>
</body>
</html>