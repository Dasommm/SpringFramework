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

<h1>All list</h1>

<table border="1">
	<thead>
		<tr>
			<th>No</th>
			<th>Name</th>
			<th>Job</th>
			<th>Manager No</th>
			<th>Hire Date</th>
			<th>Salary</th>
			<th>Commission</th>
			<th>Department No</th>			
		</tr>
	</thead>
	<tbody>
	<c:choose>
		<c:when test="${empty list }">
			<tr>
				<td colspan="8" align="center">----------empty-----------</td>
			</tr>
		</c:when>
		<c:otherwise>
			<c:forEach items="${list }" var="list">
				<tr>
					<td align="center">${list.empno }</td>
					<td align="center">${list.ename }</td>
					<td align="center">${list.job }</td>
					<td align="center">${list.mgr }</td>
					<td align="center">${list.hiredate }</td>
					<td align="center">${list.sal }</td>
					<td align="center">${list.comm }</td>
					<td align="center">${list.deptno }</td>
				</tr>
			</c:forEach>
		</c:otherwise>
	</c:choose>	
	</tbody>
</table>

</body>
</html>