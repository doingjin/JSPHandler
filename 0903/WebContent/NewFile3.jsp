<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL 실습!</title>
</head>
<body>
<h1>&lt;c:forEach&gt;실습</h1>
<hr>
<table border="1">
	<!-- forEach는 표현식 EL과도, 그냥 자주 쓰임! -->
	<c:forEach var="v" items="${members}">
	<tr>
		<td>${v.name}</td>
		<td><c:out value="${v.email}" escapeXml="false"><font color="pink">email 정보 없음</font></c:out></td>
		<!-- out은 잘 안쓰는 추세, 그리고 유지보수 불편 -->
	</tr>
	</c:forEach>
</table>

</body>
</html>