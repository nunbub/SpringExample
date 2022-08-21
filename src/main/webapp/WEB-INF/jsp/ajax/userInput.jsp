<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 등록</title>

<script 
	src="https://code.jquery.com/jquery-3.6.0.min.js" 
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" 
	crossorigin="anonymous"></script>
</head>
<body>
	<!--<form method="get" action="/ajax/user/add" id="userForm">-->
		<label>이름</label><input type="text" name="name" id="nameInput"><br>
		<label>생년월일</label><input type="text" name="birthday" id="birthDayInput"><br>
		<label>이메일</label><input type="text" name="email" id="emailInput"><br>
		
		<button type="button" id="saveBtn">저장</button>
	<!-- </form>  -->
	
	<script>
		$(document).ready(function() {
			
			$("#saveBtn").on("click", function() {
				
				let name = $("#nameInput").val();
				let birthDay = $("#birthDayInput").val();
				let email = $("#emailInput").val();
				
				if(name == "") {
					alert("이름을 입력하세요.");
					return ;
				}
				
				if(birthDay == "") {
					alert("생년월일을 입력하세요.");
					return ;
				}
				
				if(email == "") {
					alert("이메일을 입력하세요.");
					return ;
				}
			
				$.ajax({
					type:"get"
					, url:"/ajax/user/add"
					, data:{"name":name, "birthday":birthDay, "email":email}
					, success:function(data) {
						
						// 성공시 : {"result":"success"} 
						// 실패시 : {"result":"fail"}
						
						if(data.result == "success") {
							// 성공시
							location.href = "/ajax/user/list";
						}else{
							alert("저장 실패");
						}
					}
					, error:function() {
						alert("저장 에러");
					}
				});
				
			
			
			// $("#saveBtn").on("click", function() {
			/* $("#userForm").on("submit", function() {	
				
				let name = $("#nameInput").val();
				let birthDay = $("#birthDayInput").val();
				let email = $("#emailInput").val();
				
				if(name == "") {
					alert("이름을 입력하세요.");
					return false;
				}
				
				if(birthDay == "") {
					alert("생년월일을 입력하세요.");
					return false;
				}
				
				if(email == "") {
					alert("이메일을 입력하세요.");
					return false;
				} */
				
			});
			
		});
	</script>
</body>
</html>