<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>New Post</h1>

<form action="insert.do" method="post">
<table border="1">
	<tr>
		<th>Name</th>
		<td><input type="text" name="writer"></td>
	</tr>
	<tr>
		<th>Title</th>
		<td><input type="text" name="title"></td>
	</tr>
	<tr>
		<th>Name</th>
		<td><textarea rows="10" cols="30" name="content"></textarea></td>
	</tr>
	<tr>
		<td colspan="2" align="right">
			<input type="submit" value="Okay">
			<input type="button" value="Cancel" onclick="location.href='list.do'">
		</td>
	</tr>
</table>
</form>


</body>
</html>