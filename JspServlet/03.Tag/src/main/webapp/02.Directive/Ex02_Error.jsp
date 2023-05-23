<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>현재 알 수 없는 오류가 발생했습니다.</h1>
	<h2>개발자가 수정중이오니 양해 바랍니다. 최대한 빠르게 대응하겠습니다.</h2>
	<!-- Exception 내장객체 에러 종류 출력 -->
	<h2>오류 종류를 표시해보기</h2>
	<%=
	exception.getMessage()
	%>
	
</body>
</html>