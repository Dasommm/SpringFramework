<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1">
	<tr>
		<th>Name</th>
		<td>${dto.myname }</td>
	</tr>
	<tr>
		<th>Title</th>
		<td>${dto.mytitle }</td>
	</tr>
	<tr>
		<th>Content</th>
		<td><textarea rows="30" cols="50" readonly="readonly">${dto.mycontent }</textarea></td>
	</tr>	
	<tr>
		<td colspan="2">
			<input type="button" value="Delete" onclick="location.href='/myboard/delete?myno=${dto.myno}'">
			<input type="button" value="Modify" onclick="location.href='/myboard/updateform?myno=${dto.myno}'">
			<input type="button" value="List" onclick="location.href='/myboard/list'">
		</td>
	</tr>
</table>



</body>
</html>