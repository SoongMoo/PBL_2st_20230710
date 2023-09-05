<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="frm" method="post" action="requestValues.jsp">
<table border = "1" width="600px">
	<tr><th>이름</th>
		<td><input type="text" name="userName"/></td></tr>
	<tr><th>취미</th>
		<td>
			<select name="item" multiple="multiple">
				<option>===하나이상 선택하세요===</option>
				<option>독서</option>
				<option>운동</option>
				<option>음악</option>
				<option>바둑</option>
			</select>
		</td></tr>
	<tr><th>관심분야</th>
		<td><input type="checkbox" name="cp" value="엔터테인먼트"/>엔터테인먼트
			<input type="checkbox" name="cp" value="컴퓨터/인터넷"/>컴퓨터/인터넷
			<input type="checkbox" name="cp" value="경제/비지니스"/>경제/비지니스
			<input type="checkbox" name="cp" value="스포츠/건강"/>스포츠/건강
			<input type="checkbox" name="cp" value="여행/관광"/>여행/관광
		</td></tr>
	<tr>
		<th>결혼여부</th>
		<td>
		    <input type="radio" name="M_Status" value="미혼" checked>미혼
		    <input type="radio" name="M_Status" value="기혼">기혼       
		</td>
	</tr>
	<tr><th colspan="2"><input type="submit" value="전송" /></th></tr>
</table>
</form>
</body>
</html>