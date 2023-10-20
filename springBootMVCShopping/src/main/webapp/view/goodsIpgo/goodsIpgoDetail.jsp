<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function ipgoUpdate(){
		location.href="goodsIpgoUpdate.ipgo?ipgoNum=${dto.goodsIpgoNum }"
				                    +"&num=${dto.goodsNum }";
				
	}
	function ipgoDelte(){
		location.href="goodsIpgoDelete.ipgo?ipgoNum=${dto.goodsIpgoNum }"
            						 +"&num=${dto.goodsNum }";
	}
</script>
</head>
<body>
입고번호 : ${dto.goodsIpgoNum }<br />
상품번호 : ${dto.goodsNum }<br />
상품명 : ${dto.goodsName }<br />
입고일 : ${dto.ipgoDate }<br />
입고 수량 : ${dto.ipgoQty }<br />
제조일 : ${dto.madeDate }<br />
가격 : ${dto.ipgoPrice }<br />
<button type="button" onclick="ipgoUpdate();">입고 수정</button> | 
<button type="button" onclick="ipgoDelte();">입고 삭제</button>
</body>
</html>