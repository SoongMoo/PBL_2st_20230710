<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>inquireWrite.jsp</title>
</head>
<body>
<h1 class="fl"> 판매자에게 문의하기 </h1>
<p>상품명 : ${dto.goodsName }</p>
<form method="post" action="inquireWritePro.inq" id="frm">
<input type="hidden" name="goodsNum" value="${dto.goodsNum }"/>
	<table width="600" align="center" border=1>
		<tr><th>유형</th>
			<td>
				<select name="queryType">
					<option value="상품" >상품(성능/사이즈) </option>
					<option>배송</option>
					<option>교환</option>
					<option>반품/취소/환불</option>
					<option>기타</option>
				</select>
				<input type="submit"  id="btnInsert" value="문의하기" />
			</td>
		</tr>
		<tr >
			<th>제목</th>
			<td><input type="text" name="inquireSubject" /></td>
		</tr>
		<tr>
			<th>내용</th>
			<td>
				<textarea cols="50" rows="10" name="inquireContent"></textarea>
			</td>
		</tr>	
	</table>
</form>
</body>
</html>