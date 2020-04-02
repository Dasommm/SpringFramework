<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>insert page</h1>
	<form action="insertres.do" method="post">
		<table border="1">
			<tr>
				<th>Name</th>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<th>Title</th>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
				<th>Content</th>
				<td><input type="text" name="content"></td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input type="button" value="List" onclick="location.href='list.do'">
					<input type="submit" value="Okay">
				</td>
			</tr>
		</table>
	</form>

</body>
</html>