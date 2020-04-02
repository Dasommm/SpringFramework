<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

	window.onload = function(){	
		if('${joinres}' == 'success'){
			alert('회원가입 성공');
			location.href = 'loginform.do';
		}else if('${joinres}' == 'fail'){
			alert('회원가입 실패')
			location.href = 'joinform.do';
		}
	}

</script>

</head>
<body>

</body>
</html>