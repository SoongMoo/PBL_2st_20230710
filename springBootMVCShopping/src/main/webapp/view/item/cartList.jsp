<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.1.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#checkBoxs").click(function(){
		if($("#checkBoxs").prop("checked")){
			$("input:checkbox[name='prodCk']").prop("checked",true);
		}else{
			$("input[name='prodCk']").prop("checked",false);
		}
		prodChk();
	});
	$("input[name='prodCk']").click(function(){
		var checkCk = $("input[name='prodCk']").length;
		var checked = $("input[name='prodCk']:checked").length;
		if(checkCk != checked)$("#checkBoxs").prop("checked", false);
		else $("#checkBoxs").prop("checked",true);
		prodChk();
	});
});
function prodChk(){
	var cnt = 0;
	var totalPrice = 0;
	var totalQty = 0;
	for(var i = 0 ; i < ${dtos.size()}; i++){
		if($("input[name='prodCk']")[i].checked == true){
			cnt++;
			totalPrice += 
				Number($(".cartPrice:eq("+i+")").text());
			totalQty += 
				Number($(".cartQty:eq("+i+")").text());
		}
	}
	$("#prodCnt").text(cnt);
	$("#totQty").text(totalQty);
	$("#totalPrice").text(totalPrice);
}
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
function cartItemDel(goodsNum){
	con = confirm ("정말 삭제하시겠나?");
	if(con) location.href="cartItemDel.item?goodsNum="+goodsNum;
}
function itemsDel(){
	var goodsNums = "";
	$("input:checkbox[name='prodCk']:checked").each(function(){
		goodsNums += $(this).val() + "-";
	});
	//location.href="cartItemsDel.item?goodsNums="+goodsNums;
	$.ajax({
		type:"post",
		url : "cartItemsDel.item",
		data : "goodsNums="+goodsNums, // {"goodsNums":goodsNums}
		success : function(){
			location.reload();
		},
		error:function(){
			alert("서버에 접속되지 않았습니다.\n 다시 로그인해 주세요.");
			return false;
		}
	});
}
function goodsCheck(){
	if ($("input[name='prodCk']:checked").length <= 0){
		alert("적어도 하나이상 체크되어 있어야합니다.");
		return false;
	}
}
</script>
</head>
<body>
<form action="itemBuy.item" method="post" onsubmit="return goodsCheck();">
<table width="600" align = "center">
<tr><td><input type="checkbox" id="checkBoxs" checked="checked" /></td>
	<td>이미지</td><td>제품이름</td><td>수량</td><td>합계금액</td>
	<td><button type="button" onclick="itemsDel();" >선택상품삭제</button></td>
	</tr>
<c:forEach items="${dtos }" var="dto">
<tr><td><input type="checkbox" name="prodCk" value="${dto.goodsNum }" checked="checked" /></td>
	<td><img width="30" src="goods/images/${dto.goodsImage }" /></td>
	<td>${dto.goodsName }</td>
	<td><a href="javascript:checkQty('${dto.goodsNum }','${dto.cartQty }');">-</a> 
		<span class="cartQty">${dto.cartQty }</span> 
		<a href="javascript:goodsCartAdd('${dto.goodsNum }')">+</a></td>
	<td><span class="cartPrice">${dto.totalPrice }</span></td>
	<td><button type="button" onclick="javascript:cartItemDel('${dto.goodsNum }');">상품삭제</button></td>
	</tr>
</c:forEach>
<tr><td colspan="6" align="right">
		상품수 : <span id="prodCnt">${dtos.size() }</span>개<br />
		총수량 : <span id="totQty">${totQtyt }</span>개<br />
		전체 금액 : <span id="totalPrice">${totPri}</span>원<br />
	</td>
</tr>
<tr><td colspan="6" align="center">
		<input type="submit" value="구매하기"/>
	</td></tr>
</table>
</form>
</body>
</html>