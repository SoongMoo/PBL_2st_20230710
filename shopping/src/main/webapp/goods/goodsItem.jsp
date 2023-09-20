<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.1.min.js"></script>
<script>
	$(function(){

	});
	function goodsItem(goodsNum, goodsName){
		$(opener.document).find("#goodsNum").val(goodsNum);
		$(opener.document).find("#goodsName").val(goodsName);
		window.self.close();
	}
</script>
</head>
<body>
<form action="goodsItem.goods" method="post">
<table>
	<tr><th>
		검색 : <input type="search" name="goodsWord" value="${goodsWord }"> 
		<input type="submit" value="확인">
	</th></tr>
</table>
</form>
<table border=1 width="600" align="center">
	<tr>
		<th colspan="3">상품 리스트</th>
		<th width = "100">상품 개수 : ${dtos.size() }</th>
	</tr>
	<tr>
		<th>번호</th><th>상품 번호</th><th>상품명</th><th>조회수</th>
		<c:forEach items="${dtos }" var="dto" varStatus="status">
		<tr>
			<th>${status.count }</th>
			<th><a href="javascript:goodsItem('${dto.goodsNum }','${dto.goodsName }')">
				${dto.goodsNum }
				</a></th>
			<th>${dto.goodsName }</th><th>${dto.visitCount }</th>
		</tr>
		</c:forEach>
	</tr>
</table>
</body>
</html>