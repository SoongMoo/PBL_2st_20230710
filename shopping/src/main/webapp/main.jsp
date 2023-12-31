<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 로그인되었을 때 -->
<c:if test="${!empty dto }">
	<ul style="text-align:center;list-style:none;">
		<c:if test="${dto.grade == 'emp' }">
			<li><a href="employeeList.emp">직원 목록</a></li>
			<li><a href="memberList.mem">회원 목록</a></li>
			<li><a href="empMyPage.empmy">마이페이지</a></li>
			<li><a href="goodsList.goods">상품리스트</a></li>
			<li><a href="memPurchaseList.deli" >구매정보</a></li>
			<li><a href="inquire.inq" >상품문의</a></li>
		</c:if>
		<c:if test="${dto.grade == 'mem' }">
			<li><a href="memberMyPage.my">내정보 보기</a></li>
			<li><a href="cartList.item">장바구니</a></li>
			<li><a href="purchaseList.item">구매내역확인</a></li>
			<li><a href="wishList.item">관심상품</a></li>
		</c:if>
			<li><a href="logout.login">로그아웃</a></li>
	</ul>
</c:if>
<!-- 비 로그인일 때 -->
<c:if test="${empty dto }">
<form action="login.login" method="post" >
	<table border="1" align="center">
		<tr><th colspan="2">
			<input type="checkbox" name="keepLogin" value="on"/>로그인 유지 |
			<input type="checkbox" name="storeId" value="store" 
				<c:if test="${!empty sid }">checked</c:if> />아이디 저장
			</th></tr>
		<tr><th><input type="text" name="userId" placeholder="아이디" value="${sid }"/>
				<div style="color:red">${errId }</div></th>
			<th rowspan="2"><input type="submit" value="로그인" /></th></tr>`
		<tr><th><input type="password" name="userPw" placeholder="비밀번호"/>
				<div style="color:red">${errPw }</div></th></tr>
		<tr><th colspan="2">
			<a href="idInquiry.help">아이디</a>/
			<a href="pwInquiry.help">비밀번호 찾기</a> | <a href="userAgree.nhn">회원가입</a>
			</th></tr>
	</table>
</form>
</c:if>
<table align = "center">
<colgroup>
	<col span="3" width="300" height="300"/>
</colgroup>
	<tr>
		<c:forEach items="${dtos }"  var="dto" varStatus="status">
			<td><a href="detailView.item?num=${dto.goodsNum }">
				<img src="goods/images/${dto.goodsMainStore }"
						width="300" height="150"/></a><br />
				${dto.goodsName }<br />
				${dto.goodsPrice }<br />				
				<c:if test="${dto.deliveryCost == 0 }">무료배송</c:if>
				<c:if test="${dto.deliveryCost != 0 }">${dto.deliveryCost}</c:if>
			</td>
			<c:if test="${status.count % 3 == 0  }"></tr><tr></c:if>
		</c:forEach>	
	</tr>
</table>
</body>
</html>






