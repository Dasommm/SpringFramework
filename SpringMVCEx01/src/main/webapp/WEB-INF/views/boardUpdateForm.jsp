<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1>Update</h1>
<form action="boardUpdate.do" method="post">
<input type="hidden" name = "exno" value="${updateformDto.exno}">
	<table border="1">
		<tr>
			<th>NAME</th>
			<td>${updateformDto.exname }</td>
		</tr>
		<tr>
			<th>TITLE</th>
			<td><input type="text" name = "extitle" value="${updateformDto.extitle }"></td>
		</tr>
		<tr>
			<th>CONTENT</th>
			<td><textarea rows="5" cols="10" name="excontent" >${updateformDto.excontent }</textarea></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="Okay">
				<input type="button" value="cancel" onclick="location.href='boardDetail.do?exno=${updateformDto.exno}'">
			</td>
		</tr>
	</table>
</form>

</body>
</html>