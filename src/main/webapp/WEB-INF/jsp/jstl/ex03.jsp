<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL format 라이브러리</title>
</head>
<body>
	<h2>JSTL fmt</h2>
	
	<c:set var="number" value="123456789" />
	
	<h3>- 숫자출력</h3>
	<h4><fmt:formatNumber value="${number }" /></h4>
	
	<h3>- type</h3>
	<h4><fmt:formatNumber value="${number }" type="number" groupingUsed="true" /></h4>
	<h4><fmt:formatNumber value="${number }" type="number" groupingUsed="false" /></h4>
	
	<h3>- percent</h3>
	<h4><fmt:formatNumber value="0.35" type="percent" /></h4>
	<h4><fmt:formatNumber value="1" type="percent" /></h4>
	<h4><fmt:formatNumber value="${3 / 5 }" type="percent" /></h4>
	
	<h3>- 통화</h3>
	<h4><fmt:formatNumber value="${number }" type="currency" /></h4>
	<h4><fmt:formatNumber value="${number }" type="currency" currencySymbol="$" /></h4>
	
	<h3>- 포매팅 저장</h3>
	<h4><fmt:formatNumber value="${number }" type="currency" currencySymbol="$" var="doller"/></h4>
	<h4>포매팅 저장 출력 : ${doller }</h4>
	
	<h3>- 숫자 패턴</h3>
	<c:set var="pi" value="3.1415926535" />
	<h4><fmt:formatNumber value="${pi }" /></h4>
	<h4><fmt:formatNumber value="${pi }" pattern="#.##"/></h4>
	<h4><fmt:formatNumber value="${pi }" pattern="0.00"/></h4>
	<h4><fmt:formatNumber value="${pi }" pattern="0.000000000000"/></h4>
	<h4><fmt:formatNumber value="${pi }" pattern="#.############"/></h4>
	
	<hr>
	
	<h3>날짜 포맷</h3>
	<h3>- Date 객체를 내가 원하는 형태로 표현</h3>
	<h4><fmt:formatDate value="${now }" pattern="yyyy년 MM월 dd일 HH시 mm분 ss초" /></h4>
	
	<h3>- 문자열을 Date 객체로 전환</h3>	
	<%-- 2022/08/12 18:18:20 --%>
	<fmt:parseDate value="${dateString}" pattern="yyyy/MM/dd HH:mm:ss" var="date" />
	<h4>${date }</h4>
	
	
	
	
</body>
</html>