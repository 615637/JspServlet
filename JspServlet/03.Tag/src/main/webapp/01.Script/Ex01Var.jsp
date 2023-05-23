<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>변수 사용해보기</h3>
	<%! int sVal = 0; %> <!-- 전역변수 -->
	<%  int lVal = 0; %>
	<p>sVal <%=++sVal %></p>
	<p>lVal <%=++lVal %></p>
	
	<!-- 지역변수(로직코드) 블럭킹을 통해서 4의 크기를 가진 배열을 만든다. 배열은 각각의 index에 T, E, S, T 라는 문자열이 들어 있음
	배열 만든 후 표현문 태그로 각각 문자를 출력해보기 -->
	<% String[]arr={"T","E","S","T"};
	   ArrayList<String> strList = new ArrayList<>();
	   strList.add("T");
	   strList.add("E");
	   strList.add("S");
	   strList.add("T");
	%>
	
	<p><%=arr[0]%><%=arr[1]%><%=arr[2]%><%=arr[3]%></p>
	<p><%=strList.get(0) + strList.get(1) +strList.get(2) +strList.get(3)%></p>
</body>
</html>