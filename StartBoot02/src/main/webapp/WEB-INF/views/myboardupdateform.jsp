<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/myboard/update" method="post">
<input type="hidden" name="myno" value="${dto.myno }">
<table border="1">
	<tr>
		<th>Name</th>
		<td>${dto.myname }</td>
	</tr>
	<tr>
		<th>Title</th>
		<td><input type="text" name="mytitle" value="${dto.mytitle }"></td>
	</tr>
	<tr>
		<th>Content</th>
		<td><textarea rows="30" cols="50" name="mycontent">${dto.mycontent }</textarea></td>
	</tr>	
	<tr>
		<td colspan="2">
			<input type="submit" value="Okay" >
			<input type="button" value="Cancel" onclick="location.href='/myboard/detail?myno=${dto.myno}'">
		</td>
	</tr>
</table>
</form>



</body>
</html>