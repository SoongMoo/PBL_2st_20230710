<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar" %>
<!-- 선언 : 변수선언, 함수선언 -->
<%! 
	int iii = 10;
	public int calc(int num1, int num2, String opt){
		int result = 0;
		if(opt.equals("+")){
			result = num1 + num2;
		}else if(opt.equals("-")){
			result = num1 - num2;
		}else if(opt.equals("*")){
			result = num1 * num2;
		}else if(opt.equals("/")){
			result = num1 / num2;
		}
		return result;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% // 스크립크릿
	for(int i = 0; i <= 9; i++){
		out.print("5 * "+ i + " = " + 5 * i +"<br />");
	}
%>
<% for (int i = 1 ; i <=9; i++){%>
	<%= "5 * "+ i + " = " + 5 * i +"<br />" %>
<% } %>
<%
	int sum = 0;
	for(int i=1 ;i <=100; i++ ){
		sum += i;
	}
%>
1+2+3+...+99+100=<%= sum %>
<br />
<%
	sum = 0;
	for(int i = 1; i <= 100 ; i++){
		if(i < 100){
			out.print(i + "+");
		}else{
			out.print(100);
		}
		sum += i;
	}
%>
<%= "=" + sum%>
<br />
<%
	sum = 0;
	for (int i = 1; i <= 100 ; i++){
%>
	<%= i %> + 
<% 
		sum += i;
	} 
%>
=<%=sum%><br />
<% 
	Calendar cal = Calendar.getInstance();
%>
오늘 알짜는 <%= cal.getTime() %>
<br />
5 + 10 = <%=calc(5, 10, "+") %><br />
5 - 2 = <%=calc(5, 2, "-") %><br />

<%= (char)65 %><br />
<%= (int)'A' %><br />
<% 
	long l = 10; // 정수:4byte 
	out.print(l + "<br />");
	l = 10000000000L;
	out.print(l + "<br />");
	double d = 0.5;
	out.print(d + "<br />");
	float f = 0.5f;
	out.print(f + "<br />");
	f = l; //자동형변환
	out.print(f + "<br />");
	int i1 = (int)d; // 강제형변환
%>
배열
<%
	int [] intArray = new int[5];
	intArray[0] = 10;
	intArray[1] = 20;
	intArray[2] = 30;
	intArray[3] = 40;
	intArray[4] = 50;
	int i = 0;
	while(i < intArray.length){
		out.print(intArray[i] +",");
		i++;
	}
	out.print("<br />");
%>
<br />
<%
	for( int num : intArray){
		out.print(num + "<br />");
	}
%>
<table border =1 width="600px">
	<tr><td>1</td><td>2</td><td>3</td><td>4</td><td>5</td></tr>
	<tr><td>6</td><td>7</td><td>8</td><td>9</td><td>10</td></tr>
	<tr><td>11</td><td>12</td><td>13</td><td>14</td><td>15</td></tr>
	<tr><td>16</td><td>17</td><td>18</td><td>19</td><td>20</td></tr>
	<tr><td>21</td><td>22</td><td>23</td><td>24</td><td>25</td></tr>
	<tr><td>26</td><td>27</td><td>28</td><td>29</td><td>30</td></tr>
	<tr><td>31</td><td>32</td><td>33</td><td>34</td><td>35</td></tr>
</table><br />
<table border =1 width="600px">
<%
	int num = 0;
	for(int i11 = 0; i11 < 7 ; i11++){
		out.print("<tr>");
		for(int j = 0;j <5 ; j++ ){
			out.print("<td>" + ++num + "</td>");
		}
		out.print("</tr>");
	}
%>
<%
	num = 12/ 3;
	out.print("=");
	switch(num){
		case 0 : out.print(0); break;
		case 1 : out.print(1); break;
		case 2 : out.print(2); break;
		case 3 : out.print(3); break;
		case 4 : out.print(4); break;
		case 5 : out.print(5); break;
		default : out.print("default");		
	}
%>
</table>
</body>
</html>















