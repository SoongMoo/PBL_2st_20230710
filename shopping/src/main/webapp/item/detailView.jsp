<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.1.min.js"></script>
<script>
	$(function(){
		$("#cartBtn").click(function(){
			// Ajax  
			// Json자료형 : a = {"key":"value", "key1":"value1",...,"key_n":"value_n"}
			if(${auth != null}){
				if(${auth.grade == 'mem'}){
					$.ajax({
						type : "post",
						url : "cart.item",
						dataType : "html",
						data : {"goodsNum":"${dto.goodsNum}","cartQty":$("#cartQty").val()}, 
						success : function(){
							con = confirm("장바구니로 이동하시겠습니까?");
							if(con){
								location.href="cartList.item";
							}
						},
						error : function(){
							window.open("loginCk.login","loginck","width=400,height=400");
							return;
						}
					});
				}else alert("직원은 직원전용 사이트를 사용하세요.");
			}else{
				window.open("loginCk.login","loginck","width=400,height=400");
			}
		});
	});
</script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table width="800" align="center">
	<tr><td rowspan="5">
			<img src="goods/images/${dto.goodsMainStore }" 
			height="200"/>
		</td><td>상품명 : ${dto.goodsName }</td></tr>
	<tr>         <td>가격 : ${dto.goodsPrice }</td></tr>
	<tr>         <td>배송비 :
	                 <c:if test="${dto.deliveryCost == 0 }">무료배송</c:if>
	                 <c:if test="${dto.deliveryCost != 0 }">${dto.deliveryCost}</c:if>     
	              </td></tr>
	<tr>         <td>수량 : <input type="number" id="cartQty" min="1" value="1" step="1" name="cartQty"></td></tr>
	<tr>         <td> <button type="button" id="cartBtn">장바구니</button> | 
					   바로구매</td></tr>
	<tr><td colspan="2">
		${fn:replace(dto.goodsContent,newLine,"<br />") }<br />
		<c:forTokens items="${dto.goodsImages }" delims="`" var="img">
		<img src="goods/images/${img }" height="300"/><br />
		</c:forTokens>
		</td></tr>
</table>
</body>
</html>