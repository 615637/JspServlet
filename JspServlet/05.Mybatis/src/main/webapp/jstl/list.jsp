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
	<h1>JSTL 사용(EL문법 사용 (Express Language 자바 표현문법))</h1>
	<p>JSP개발을 좀 더 편하고 단순화하기 위한 태그 라이브러리(JSTL)</p>
	<P>JSTL : Jsp Standard Tag Library</P>
	<h3>CORE (jstl/core)</h3>
	<p>jstl은 용도에 따라서 uri(기능)이 나눠져 있고 해당하는 기능을 jsp페이지에서 어떤 구분자로 쓸지 prefix로 지정</p>
	<p>jsp==> jstl, html ==> 타임리프(추후 배움. 구조가 비슷함)</p>
	<% int num= 100; %> <!-- 자바코드 이용해서 변수 선언 -->
	<c:set var="num1" value="200"/> <!-- jstl태그 이용해서 변수 선언 -->
	<p>변수 num : <%=num %></p>
	<h4>EL문법</h4>
	<p>자바코드로 변수를 만들거나 코드 처리 x</p>
	<p>변수 num : ${num}</p>
	<p>변수 num1 : ${num1}</p>
	<c:set var="num2" value="300"></c:set>
	<p>변수의 합 : ${num1+num2}</p>
	<%-- <%=request.getAttribute("key")%> --%>
	<p>el : ${key1}</p>
	<p>el : ${key2}</p>
	<p>el : ${key3}</p>
	<!-- jstlController에서 변수 3개 더 request객체를 통해 보내고 el로 표기하기 -->
	<p>el : ${hi1}</p>
	<p>el : ${hi2}</p>
	<p>el : ${hi3}</p>
	<%-- <%if(num2==0)%> --%>
	<c:if test="${num2==300 }">
		<p>300과 같습니다.</p>
	</c:if>
	<c:forEach var = "i" begin="2" end="9">
		<p>
		<c:forEach var="j" begin= "1" end="9">
		<a>${i}×${j}=${i*j }</a>
		</c:forEach>
		</p>
	</c:forEach>
	
	<!-- 페이지 전환을 Controller 하고 싶음
	listdetail.js 요청을 하면 해당하는 맵핑을 판독하여 jstl폴더 하위에 listdetail.jsp파일로 응답
	-->
	<a href="listdetail.js">listdetail바로가기</a>
	<!-- 파라미터 1013받아오기 -->
	<form action="listdetail.js" method="post">
	<input type="hidden" value="1013" name="q_bbsCode">
	<input type="submit">
	</form>
		
	
	
</body>
</html>