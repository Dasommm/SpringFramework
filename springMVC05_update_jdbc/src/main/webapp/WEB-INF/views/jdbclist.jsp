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

<h1>All List</h1>

<table border="1">
	<thead>
		<tr>
			<th>NO</th>
			<th>NAME</th>
			<th>TITLE</th>
			<th>DATE</th>
		</tr>	
	</thead>
	<tbody>
	<c:choose>
		<c:when test="${empty list }">
			<tr>
				<td colspan="4">------no comment here------</td>
			</tr>
		</c:when>
		<c:otherwise>
			<c:forEach items="${list }" var="list">
				<tr>
					<td>${list.seq }</td>
					<td>${list.writer }</td>
					<td><a href="detail.do?seq=${list.seq }">${list.title }</a></td>
					<td>${list.regdate }</td>
				</tr>
			</c:forEach>
		</c:otherwise>
	</c:choose>	
	</tbody>
	<tfoot>
		<tr>
			<td colspan="4" align="right">
				<input type="button" value="new" onclick="location.href='insertform.do'">
			</td>
		</tr>
	</tfoot>

</table>

</body>
</html>