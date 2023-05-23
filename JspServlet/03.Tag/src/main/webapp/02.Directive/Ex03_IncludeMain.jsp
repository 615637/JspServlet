<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 반복되는 헤더나 푸터를 계속해서 복붙하기 귀찮음(수정 힘듦)
파일에 포함시키는 방식(미리 만든 다른 파일을 이용)
장점 : 파일 재사용했기 때문에 수정시 헤더파일 하나만 수정하면 해결가능
단점 : 헤더와 푸터가 기능이 안되거나 오류 발생시 모든 화면에서 안됨 -->

<%@ include file="Ex03Header.jsp" %>
	
	<p>유주컴퍼니</p>
	<p>메인페이지입니다.</p>
	<p>컨텐츠가 여기 있음</p>

<%@ include file="Ex03Footer.jsp" %>
</body>
</html>