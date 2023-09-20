<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.1.min.js"></script>
<script>
	$(function(){
		$("#btn").click(function(){
			window.open("goodsItem.goods","상품검색","width=620, height=500, left=30, top=50");
		});
	});
</script>
</head>
<body>
입고번호 : <input type="text" name= "goodsIpgoNum" /><br />
상품번호 : <input type="text" name= "goodsNum" id="goodsNum" readonly="readonly"/>
		 <button type="button" id="btn" >상품 검색</button><br />
상품명 : <input type="text" name= "goodsName" id="goodsName"/><br />
입고일 : <input type="date" name= "ipgoDate" /><br />
입고 수량 : <input type="number" name= "ipgoQty" /><br />
제조일 : <input type="date" name= "madeDate" /><br />
가격 : <input type="number" name= "ipgoPrice" /><br />
</body>
</html>