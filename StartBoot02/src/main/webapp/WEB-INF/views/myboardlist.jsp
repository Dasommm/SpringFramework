<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1">
	<col width="50">
	<col width="100">
	<col width="300">
	<col width="100">
	<tr>
	 	<th>NO</th>
	 	<th>Name</th>
	 	<th>Title</th>
	 	<th>Date</th>
	</tr>
	<c:choose>
		<c:when test="${empty list }">
			<tr>
				<td colspan="4">------no comment here-------</td>
			</tr>
		</c:when>
		<c:otherwise>
			<c:forEach items="${list }" var="list">
				<tr>
					<td>${list.myno }</td>
					<td>${list.myname }</td>
					<td><a href="/myboard/detail?myno=${list.myno }">${list.mytitle }</a></td>
					<td>${list.mydate }</td>					
				</tr>
			</c:forEach>
		</c:otherwise>
	</c:choose>
	<tr>
		<td colspan="4">
			<input type="button" value="new" onclick="location.href='/myboard/insertform'">
		</td>
	</tr>	
</table>

</body>
</html>