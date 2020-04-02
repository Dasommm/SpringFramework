<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	
<h1>update page</h1>
	<form action="updateres.do" method="post">
	<input type="hidden" name="myno" value="${dto.myno }">
		<table border="1">
			<tr>
				<th>Name</th>
				<td>${dto.myname }</td>
			</tr>
			<tr>
				<th>Title</th>
				<td><input type="text" name ="mytitle" value="${dto.mytitle }"></td>
			</tr>
			<tr>
				<th>Content</th>
				<td><input type="text" name="mycontent" value="${dto.mycontent }"></td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input type="button" value="Cancel" onclick="location.href='selectOne.do?myno=${dto.myno}'">
					<input type="submit" value="Okay">
				</td>
			</tr>
		</table>
	</form>


</body>
</html>