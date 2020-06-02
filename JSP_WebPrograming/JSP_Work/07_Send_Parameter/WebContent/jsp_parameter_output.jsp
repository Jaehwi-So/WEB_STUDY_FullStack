<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String name = request.getParameter("m_name");
	//넘어오는 파라미터는 대부분 String. byte[]로 넘어오는 경우도 간혹 있지만 int, char등의 매개변수로 넘어오는 경우는 없다.
	int age = Integer.parseInt(request.getParameter("age"));	
	String tel = request.getParameter("tel");	
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>한 JSP에서 다른 JSP로 parameter 전달하기</title>
	</head>
	<body>
		<table border = "1">
			<tr>
				<th>이름</th>
				<td><%= name %></td>
			</tr>
			<tr>
				<th>나이</th>
				<td><%= age %></td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td><%= tel %></td>
			</tr>
		</table>
	</body>
</html>