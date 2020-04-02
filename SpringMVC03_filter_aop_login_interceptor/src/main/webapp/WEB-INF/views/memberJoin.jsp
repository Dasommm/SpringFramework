<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Join</h1>

<form action="join.do" method="post">
<table border="1">
	<tr>
		<th>ID</th>
		<td><input type="text" name = "memberid" required="required"></td>
	</tr>
	<tr>
		<th>PW</th>
		<td><input type="password" name="memberpw" required="required"></td>
	</tr>
	<tr>
		<th>NAME</th>
		<td><input type="text" name = "membername" required="required"></td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<input type="submit" value="Join">
			<input type="button" value="Cancel" onclick="">
		</td>
	</tr>
</table>
</form>

</body>
</html>