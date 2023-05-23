<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>PageContext : <%=pageContext.getAttribute("pageCtx") %>
	<!-- 페이지 내에서만 데이터가 유지됨(지역변수와 유사) -->
	<p>request : <%=request.getAttribute("req") %>
	<!-- forward라는 페이지 요청이 있을 떄만 다음페이지 전송 (메소드 파라메터부와 유사) -->
	<p>session : <%=session.getAttribute("session") %>
	<!-- 전역변수(필드) 유사함 -->
	<p>application : <%=application.getAttribute("app") %>

</body>
</html>