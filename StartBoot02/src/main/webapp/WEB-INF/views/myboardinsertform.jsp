<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="/myboard/insert" method="post">
<table border="1">
	<tr>
		<th>Name</th>
		<td><input type="text" name="myname"></td>
	</tr>
	<tr>
		<th>Title</th>
		<td><input type="text" name="mytitle"></td>
	</tr>
	<tr>
		<th>Content</th>
		<td><textarea rows="30" cols="50" name="mycontent"></textarea></td>
	</tr>	
	<tr>
		<td colspan="2">
			<input type="submit" value="Okay">
			<input type="button" value="List" onclick="location.href='/myboard/list'">
		</td>
	</tr>
</table>
</form>



</body>
</html>