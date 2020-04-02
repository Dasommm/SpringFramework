<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	
	$(function(){
		$("#loginchk").hide();
	});
	
	function login(){
		var memberid = $("#memberid").val().trim();
		var memberpw = $("#memberpw").val().trim();
		
		console.log(memberid + "/"+memberpw);
	
		if(memberid == null || memberid == "" || memberpw == null || memberpw == ""){
			alert("ID와 PW를 다시한번 확인해주세요!");
		} else{
			var loginVal ={
					"memberid" : memberid,
					"memberpw" : memberpw
			}
			
			$.ajax({
				type:"post",
				url:"ajaxlogin.do",
				data: JSON.stringify(loginVal),
				contentType:"application/json",
				dataType:"json",
				success: function(msg){
					if(msg.check == true){
						location.href="list.do";
					} else{
						$("#loginchk").show();
						$("#loginchk").html("ID or PW가 잘못되었습니다.").css("color","red");
					}
					
				},
				error: function(){
					alert("통신 실패");
				}
			});
		}
		
	}


</script>


	
</head>
<body>

	<table>
		<tr>
			<th>ID</th>
			<td><input type="text" id="memberid"></td>	
		</tr>
		
		<tr>
			<th>PW</th>
			<td><input type="password" id="memberpw"></td>
		</tr>
		
		<tr>
			<td colspan="2" align="center">
				<input type="button" value="login" onclick="login();">
				<input type="button" value="join" onclick="location.href='joinform.do'">
			</td>
		</tr>
		
		<tr>
			<td colspan="2" align="center" id="loginchk"></td>
		</tr>	
						
		
	</table>
	<a href="joinform.do">Join</a>

</body>
</html>