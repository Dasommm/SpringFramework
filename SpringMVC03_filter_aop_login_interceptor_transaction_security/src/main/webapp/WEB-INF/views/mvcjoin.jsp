<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>회원가입</h1>
	
	<form action="joinres.do" method="post">
	
		<table>
			<tr>
				<th> ID</th>
				<td><input type="text" name="memberid"></td>
			</tr>
			
			<tr>
				<th> PW</th>
				<td><input type="password" name="memberpw"></td>
			</tr>
			
			<tr>
				<th>이름</th>
				<td><input type="text" name="membername"></td>
			</tr>
			
			<tr>
				<td colspan="2" align="right">
					<input type="submit" value="등록">
					<input type="button" value="취소" onclick="location.href='loginform.do'">
				</td>
			</tr>
					
			
						
		</table>
	
		
	
	</form>

</body>
</html>