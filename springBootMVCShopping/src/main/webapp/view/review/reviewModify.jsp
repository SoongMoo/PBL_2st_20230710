<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
리뷰수정<br />
<form action="goodsReviewModify.review" method="post">
<input type="hidden" name="reviewNum" value="${dto.reviewNum }"/>
리뷰 번호 : ${dto.reviewNum }<br />
상품 이름 : ${dto.goodsName} <br />
리뷰 내용 : <textarea rows="5" cols="30" name="reviewContent">${dto.reviewContent }</textarea><br />
<input type="submit" value="리뷰수정완료" />
<input type="button"  value="리뷰수정취소" onclick="javascript:history.back();"/>
</form>
</body>
</html>