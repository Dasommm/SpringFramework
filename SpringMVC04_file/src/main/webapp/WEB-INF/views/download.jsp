<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8");%>
<% response.setContentType("text/html; charset=UTF-8");%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>         
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>다운로드</h1>
	
	file: ${fileObj.name}<br/>
	desc: ${fileObj.desc}<br/>
	
	<form action="download" method="post">
		<input type="hidden" name="name" value="${fileObj.name }"/>
		<input type="submit" value="download"/>
	</form>
	
	<!-- 
		mime-type  (Multipurpose Internet Mail Extension)
		request header에 지정되는, 데이터가 어떤 종류의 stream인지를 나타내주는 프로토콜
	
	
	 -->
	
	
</body>
</html>