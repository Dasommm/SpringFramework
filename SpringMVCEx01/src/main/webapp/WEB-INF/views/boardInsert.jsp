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
<form action="boardInsert.do" method="post">
	<table border="1">
		<tr>
			<th>NAME</th>
			<td><input type="text" name="exname"></td>
		</tr>
		<tr>
			<th>TITLE</th>
			<td><input type="text" name="extitle"></td>
		</tr>
		<tr>
			<th>CONTENT</th>
			<td><textarea rows="5" cols="10" name="excontent"></textarea></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="button" value="list" onclick="location.href='list.do'">
				<input type="submit" value="Okay">
			</td>
		</tr>
	</table>
</form>

</body>
</html>