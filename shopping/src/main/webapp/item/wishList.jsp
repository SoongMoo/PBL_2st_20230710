<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>wishList.jsp</title>
<script>
function wishDelete(goodsNum){
	location.href="wishDelete.item?goodsNum="+goodsNum;
}
</script>
</head>
<body>
<table width="600" >
	<tr><th>상품번호<br />이미지/상품명</th><th>가격</th><th>등록일</th></tr>
	<tr><th colspan="3"><hr /></th></tr>
	<c:forEach items="${dtos }" var="dto">
		<tr><th>${dto.goodsNum }<br />
			<img src="goods/images/${dto.goodsMainStore }" width="30" />/
			${dto.goodsName }</th><th>${dto.goodsPrice }</th>
			<th>${dto.wishDate }<br /><button onclick="wishDelete('${dto.goodsNum }')" >삭제하기</button>
			 </th></tr>
	</c:forEach>
</table>
</body>
</html>