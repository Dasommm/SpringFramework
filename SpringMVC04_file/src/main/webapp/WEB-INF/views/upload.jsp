<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8");%>
<% response.setContentType("text/html; charset=UTF-8");%>        
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    <!-- 추가 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form method="post" enctype="multipart/form-data" modelAttribute="uploadFile" action="upload">
	<!-- <form enctype="multipart/form-data" : 인코딩 타입  -->
	<!-- enctype 속성 : 
		1. application/www-form-urlencoded : 문자들이 encoding된(default)
		2. multipart/form-data : file upload 가능 (post)
		3. text/plain : encoding 되지 않음 
	-->
	<!-- modelAttribute 옵션은 폼에 있는 요소들의 값을 채우기 위해서 사용될 객체를 request 로부터 찾을때 사용할 이름을 지정합니다 -->
		<h3>UPLOAD Form</h3>
		file<br/>
		<input type="file" name="mpfile"/><br/>
		<p style="color:red; font-weight:bold;">
			<form:errors path="mpfile"></form:errors>  <!-- name path의 이름이 같아야 어떤것이 오류가 났는지 알 수 있다.  -->
		</p><br/>
		description<br/>
		<textarea rows="10" cols="60" name="desc"></textarea><br/>
		<input type="submit" value="send"/>
	</form:form>
</body>
</html>