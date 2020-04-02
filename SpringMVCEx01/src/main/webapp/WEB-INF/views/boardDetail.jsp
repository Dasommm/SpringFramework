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
			<th>NAME</th>
			<td>${detailDto.exname }</td>
		</tr>
		<tr>
			<th>TITLE</th>
			<td>${detailDto.extitle }</td>
		</tr>
		<tr>
			<th>CONTENT</th>
			<td><textarea rows="5" cols="10" readonly="readonly">${detailDto.excontent }</textarea></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="button" value="list" onclick="location.href='list.do'">
				<input type="button" value="Modify" onclick="location.href='updateForm.do?exno=${detailDto.exno}'">
				<input type="button" value="Delete" onclick="location.href='delete.do?exno=${detailDto.exno}'">
			</td>
		</tr>
	</table>

</body>
</html>