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
						<td>-----no comment here------</td>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach items="${list }" var="list">
						<tr>
							<td>${list.exno }</td>
							<td>${list.exname }</td>
							<td><a href="boardDetail.do?exno=${list.exno }">${list.extitle }</a></td>
							<td>${list.exdate }</td>
						</tr>
					</c:forEach>
				</c:otherwise>			
			</c:choose>
		</tbody>
		<tfoot>
			<tr>
				<td colspan="4" align="center">
					<input type="button" value="new" onclick="location.href='boardInsertForm.do'">
				</td>
			</tr>
		</tfoot>
	</table>



</body>
</html>