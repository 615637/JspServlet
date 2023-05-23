<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>여기여기</h1>
	<h3>웹에서 데이터를 태그 형태나 jst1, EL등으로 표현할 때 게터&세터 많이 이용함</h3>
	<h3>데이터 전달하고 readOnly 데이터를 읽어서 쓰는 용도로만 VO(Value Object)라는 명칭 사용(==DTO)</h3>
	<c:forEach items="${list}" var="vo">
		<p>${vo.field1}</p>
		<p>${vo.field2}</p>
	</c:forEach>
	
</body>
</html>