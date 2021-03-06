<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Request 기본 객체와 파라미터 처리</title>
	</head>
	<script>
		function send(f){
			/* 
			# 웹 브라우저는 전송 시 주로 폼을 사용한다.
			action에 경로를 지정하고, method에 전송 방식을 지정한다.
			전송 방식 : GET/POST 
			GET방식 : 요청 URL에 파라미터를 붙여서 전송한다. ?이름1=값%이름2=값 <- 이를 쿼리 문자열(Query String)이라고 한다. 
			POST방식 : 데이터 영역을 이용해서 파라미터를 전송한다. 따라서 파라미터의 길이에 제한이 없으며 보안성 측면에서 좋다.
			*/
			f.action = "request_answer.jsp";
			f.method = "get";
			f.submit();	//전송
		}
	</script>
	<body>
		<form>
			<h1>좋아하는 반려동물은 무엇인가요?</h1>
			<input type = "checkbox" name = "q_pet" value = "dog"> 강아지
			<input type = "checkbox" name = "q_pet" value = "cat"> 고양이
			<input type = "checkbox" name = "q_pet" value = "fish"> 물고기
			<h1>당신의 이름은?</h1>
			<input name = "q_name">
			<input type = "button" value = "완료 " onclick = "send(this.form);">
		</form>
	</body>
</html>