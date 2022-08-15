<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Core 라이브러리</title>
</head>
<body>
	<h2>변수 정의하기</h2>
	<%-- int number = 100 --%>
	<c:set var="number1" value="100" />
	<c:set var="number2">200</c:set>
	
	<h4>number1 : ${number1 }</h4>
	<h4>number2 : ${number2 }</h4>

	<h2>변수 출력하기</h2>
	
	<h4><c:out value="100" /></h4>
	<h4><c:out value="${number1 }" /></h4>
	
	<c:out value="<script>alert('안녕')</script>" /> <%-- = escapeXml="true"기본 설정 되어있음 --%>
	
	<%--  <c:out value="<script>alert('안녕')</script>" escapeXml="false"/> --%>

	<h2>조건문</h2>
	
	<c:if test="true">
		<h4>조건이 참이다</h4>
	</c:if>
	
	<c:if test="false">
		<h4>조건이 거짓이다</h4>
	</c:if>
	
	<c:if test="${number1 > 50 }">
		<h4>number1 이 50보다 크다</h4>
	</c:if>
	
	<%-- if(number1 == 100) eq = == --%>
	<c:if test="${number1 eq 100 }">
		<h4>number1 은 100이다</h4>
	</c:if>
	
	<%-- if(number2 != 100 ne = != --%>
	<c:if test="${number2 ne 100 }">
		<h4>number2는 100이 아니다</h4>
	</c:if>

	<%-- if(number1 == null) --%>
	<%-- empty = 변수가 없다, 객체가 null이다, 리스트가 비어있다 --%>
	<c:if test="${empty number1 }">
		<h4>number1 변수가 없다</h4>
	</c:if>
	
	<%-- if(number1 != null) --%>
	<c:if test="${not empty number1 }">
		<h4>number1 변수가 있다</h4>
	</c:if>
	
	
	
	
</body>
</html>