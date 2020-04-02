<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Detail</h1>

	<table border="1">
		<tr>
			<th>Name</th>
			<td>${boardDetail.myname }</td>
		</tr>
		<tr>
			<th>Title</th>
			<td>${boardDetail.mytitle }</td>
		</tr>
		<tr>
			<th>Content</th>
			<td>${boardDetail.mycontent }</td>
		</tr>
		<tr>
			<td colspan="2" align="right">
				<input type="button" value="List" onclick="location.href='list.do'">
				<input type="button" value="Modify" onclick="location.href='updateform.do?myno=${boardDetail.myno}'">
				<input type="button" value="Delete" onclick="location.href='boardDelete.do?myno=${boardDetail.myno}'">
			</td>
		</tr>
	</table>

</body>
</html>