<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.1.min.js"></script>
<script type="text/javascript">
function goodsCartAdd(goodsNum){
	$.ajax({
		url: "cart.item",
		type: "post",
		data: {"goodsNum":goodsNum,"cartQty":1 },
		success : function(){
			//location.reload();
			location.href="cartList.item";
		},
		error : function(){
			alert("서버에 접속하지 못했습니다. 다시 시도해주세요.");
			return;
		}
	});
}
function checkQty(goodsNum, cartQty){
	if(cartQty > 1){
		//location.href="cartQtyDown.item?goodsNum="+goodsNum;
		$.ajax({
			url: "cartQtyDown.item",
			type: "post",
			data: {"goodsNum":goodsNum},
			success : function(){
				//location.reload();
				location.href="cartList.item";
			},
			error : function(){
				alert("서버에 접속하지 못했습니다. 다시 시도해주세요.");
				return;
			}
		});
	}else{
		alert("최소수량은 1이상이어야 합나다.");
		return false;
	}
}
</script>
</head>
<body>
<table width="600" align = "center">
<tr><td>이미지</td><td>제품이름</td><td>수량</td><td>합계금액</td></tr>
<c:forEach items="${dtos }" var="dto">
<tr><td><img width="30" src="goods/images/${dto.goodsImage }" /></td>
	<td>${dto.goodsName }</td>
	<td><a href="javascript:checkQty('${dto.goodsNum }','${dto.cartQty }');">-</a> 
		${dto.cartQty } 
		<a href="javascript:goodsCartAdd('${dto.goodsNum }')">+</a></td>
	<td>${dto.totalPrice }</td></tr>
</c:forEach>
</table>
</body>
</html>