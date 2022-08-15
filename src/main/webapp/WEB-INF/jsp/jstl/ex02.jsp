<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL core 라이브러리</title>
</head>
<body>

	<h2>조건 : if else</h2>
	<%-- 몸무게가 70이하면 치킨 80이하면 샐러드 그게아니면 굶는다 --%>
	<c:choose>
		<%-- if(weight <= 70 ) --%>
		<c:when test="${weight <= 70 }">
			<h4>치킨 먹자</h4>
		</c:when>
		<%-- else if(weight <= 80 ) --%>
		<c:when test="${weight <= 80 }">
			<h4>샐러드 먹자</h4>
		</c:when>
		<%-- else --%>
		<c:otherwise>
			<h4>굶는다</h4>
		</c:otherwise>
	</c:choose>
	
	<h2>반복문</h2>

	<%-- for(int i = 0; i < 5; i++) --%>
	<c:forEach var="i" begin="0" end="4" step="1">
		${i }
	</c:forEach>
	<br>
	
	<%-- for(String fruit : fruitList) --%>
	<c:forEach var="fruit" items="${fruitList }" varStatus="status">
		<h4>${fruit } :::: ${status.count } ${status.index } ${status.first } ${status.last }</h4>
	</c:forEach>
	
	<%-- List<Map<String, Object>> userList --%>
	<%-- for(Map<String, Object> user : userList) --%>
	<c:forEach var="user" items="${userList }" varStatus="status">
		<h3>${status.count } 번째 사용자 정보</h3>
		<h4>이름 : ${user.name }</h4>
		<h4>나이 : ${user.age }</h4>
		<h4>취미 : ${user.hobby }</h4>
	</c:forEach>
	
	
</body>
</html>