<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>선언문</h1>
	<!-- html 영역 -->
	<%! //자바코드영역 
		String var = "LYJ"; //전역변수(필드, 멤버)
	%>
	<% String lv = "지역변수"; %>
	
	<h3>var 출력<%=var %></h3>
	<h3>lv 출력<%=lv %></h3>
</body>
</html>