<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%	for(int i = 0; i<10 ; i++){ %>
	<% if(i%2==1){ %>
	<p><%="홀수"%></p>
	<% }else{  %>
	<p><%="짝수"%></p>
	<% } %>
	<% } %>
	
	
	<table border="1px solid black">
	<%	for(int i = 2; i<10 ; i++){ %>
	<tr>
	<%	for(int j = 1; j<10 ; j++){ %>
	<td><%=i%>*<%=j%>=<%=i*j%></td>
	<% } %>
	</tr>
	<% } %>
	</table>
</body>
</html>