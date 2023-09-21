<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="goodsIpgoModify.ipgo" method="post">
입고번호 : <input type="text" name="goodsIpgoNum" readonly="readonly" 
				value="${dto.goodsIpgoNum }"/><br />
상품번호 : <input type="text" name="goodsNum" readonly="readonly" 
				value="${dto.goodsNum }"/><br />
상품명 : <input type="text" name="goodsName" readonly="readonly" 
				value="${dto.goodsName }" /><br />
입고일 : <input type="date" name="ipgoDate" value="${dto.ipgoDate }" /><br />
입고 수량 : <input type="number" name="ipgoQty" value="${dto.ipgoQty }"/><br />
제조일 : <input type="date" name="madeDate" value="${dto.madeDate }"/><br />
가격 : <input type="number" name="ipgoPrice" value="${dto.ipgoPrice }"/><br />
<input type="submit" value="수정완료" />
</form>
</body>
</html>