<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
직원 수정 페이지 <br />
<form action="employeeModify.emp" method="post" name="frm">
직원번호 : <input type="text" name="empNum" value="${dto.empNum }" readonly="readonly"/> <br />
직원명: <input type="text" name="empName" value="${dto.empName }"  /><br />
직원아이디: <input type="text" name="empId" value="${dto.empId }" readonly="readonly"/><br />
직원연락처: <input type="text" name="empPhone" value="${dto.empPhone }"/><br />
직원이메일: <input type="text" name="empEmail" value="${dto.empEmail }"/><br />
직원주소: <input type="text" name="empAddr" value="${dto.empAddr }"/><br />
직원상세주소: <input type="text" name="empAddrDetail" value="${dto.empAddrDetail }"/><br />
직원우편번호: <input type="text" name="empPost" value="${dto.empPost }"/><br />
직원주민번호: <input type="text" name="empJumin" value="${dto.empJumin }" /><br />
직원입사일: <input type="date" name="empEnterDate" value="${dto.empEnterDate }"/><br />
<input type="submit" value="직원 수정" />
</form>
</body>
</html>