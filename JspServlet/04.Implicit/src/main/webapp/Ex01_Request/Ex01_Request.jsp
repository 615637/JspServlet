<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>요청해보기</h1>
	<!-- 특정한 Servlet파일 (Mapping => "/요청주소")에 어떠한 정보를 주고 다음 작업을 요청한다.(클라이언트)
		 ex)네이버 아이디 비번 입력 후 로그인 버튼 누름 => 로그인 후 작업 요청
		 webapp(View) : 눈에 보이는 영역의 작업(html, jsp, xmlLayout...)
		 Java(controller) : 눈에 안보이지만 View에서 들어온 요청을 처리하는 부분.
		 (Java, C++, c#, Python, Servlet ... 등의 백엔드 언어)
		 request(Model) : View와 Controller 사이에서 데이터를 전송하는 목적으로 사용하는 객체.(사용 로직)
		 MVC패턴 - Web에서 가장 흔히 그리고 널리 사용되는 디자인 패턴(V -> C -> M-> V-> C -> ...)
		  -->
	
	<h3>GET방식 요청</h3>
	<form action="../Ex01_Request" method="get">
	<input type="text" name="id"/>
	<input type="text" name="pw"/>
	<input type="submit">
	</form>
	<form action="../Ex01_Request" method="post">
	<input type="text" name="id"/>
	<input type="text" name="pw"/>
	<input type="submit">
	</form>
		  

</body>
</html>