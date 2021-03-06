<%@page import="vo.GradeVO"%>
<%@page import="java.util.List"%>
<%@page import="dao.GradeDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	/* DB 검색 */
	GradeDAO gdao = GradeDAO.getInstance();
	List<GradeVO> grade_list = gdao.selectList();
%>
<html>
	<head>
		<meta charset="UTF-8">
		<title>학생 성적 정보 조회</title>
		<style>
			caption{
				font-size: 20px;
				font-weight : 10px;
				color : blue;
				background-color : white;
				border-color : black;
				border-style : ridge;
				text-align : center;
				text-shadow : 3px 3px 3px black;
			}
		</style>
		<script>
			function del( no ){
				if( !confirm("정말로 삭제하시겠습니까? ")){
					return; /* 취소버튼을 눌렀을 때 */
				}
				
				//삭제
				location.href = "grade_del.jsp?no=" + no ; /* location.href : 해당 페이지로 화면전환 , 파라미터로 no를 같이 보낸다.*/
				
			}
			
			//입력창 보여주기
			function show_form(){
				var disp = document.getElementById("disp");
				disp.style.display = "block";
			}
			
			//입력창 숨기기
			function hide_form(){
				var disp = document.getElementById("disp");
				var disp2 = document.getElementById("disp2");
				disp.style.display = "none";
				disp2.style.display = "none";
				
				/* 입력상자 비우기 */
				document.getElementById("m_name").value = "";
				document.getElementById("m_kor").value = "";
				document.getElementById("m_eng").value = "";
				document.getElementById("m_mat").value = "";
			}
			
			function send( f ){
				/* 공백제거 */
				var name = f.name.value.trim();
				var kor = f.kor.value.trim();
				var eng = f.eng.value.trim();
				var mat = f.mat.value.trim();
				
				/* 유효성 체크 */
				if(name == ""){
					alert("이름은 반드시 입력해야 합니다");
					return;
				}
				
				var num_pattern = /^[0-9]+$/;
				if( !num_pattern.test(kor) || kor < 0 || kor > 100){
					alert("성적은 0-100 사이의 정수를 입력해야 합니다");
					return;
				}
				if( !num_pattern.test(eng) || eng < 0 || eng > 100){
					alert("성적은 0-100 사이의 정수를 입력해야 합니다");
					return;
				}
				if( !num_pattern.test(mat) || mat < 0 || mat > 100){
					alert("성적은 0-100 사이의 정수를 입력해야 합니다");
					return;
				}
				
				f.action = "grade_register.jsp"
				f.submit();
			}
			
			/* 학생 정보 수정 */
			function update( no, name, kor, eng, mat ){
				var disp2 = document.getElementById("disp2");
				disp2.style.display = "block";
				document.getElementById("m_no2").value = no;
				document.getElementById("m_name2").value = name;
				document.getElementById("m_kor2").value = kor;
				document.getElementById("m_eng2").value = eng;
				document.getElementById("m_mat2").value = mat;
			}
			
			function send2( f ){
				var no = f.no2.value.trim();
				var name2 = f.name2.value.trim();
				var kor2 = f.kor2.value.trim();
				var eng2 = f.eng2.value.trim();
				var mat2 = f.mat2.value.trim();
				
				/* 유효성 체크 */
				if(name2 == ""){
					alert("이름은 반드시 입력해야 합니다");
					return;
				}
				
				var num_pattern = /^[0-9]+$/;
				if( !num_pattern.test(kor2) || kor2 < 0 || kor2 > 100){
					alert("성적은 0-100 사이의 정수를 입력해야 합니다");
					return;
				}
				if( !num_pattern.test(eng2) || eng2 < 0 || eng2 > 100){
					alert("성적은 0-100 사이의 정수를 입력해야 합니다");
					return;
				}
				if( !num_pattern.test(mat2) || mat2 < 0 || mat2 > 100){
					alert("성적은 0-100 사이의 정수를 입력해야 합니다");
					return;
				}
				
				f.action = "grade_update.jsp"
				f.submit();
			}
		</script>
	</head>
	<body>
		<!-- 이름 국어 영어 수학 총점 평균 -->
		<table border = "1" align = "center">
			<caption>== 학생 성적 정보 ==</caption>
			<tr>
				<th>이름</th>
				<th>국어</th>
				<th>영어</th>
				<th>수학</th>
				<th>총점</th>
				<th>평균</th>
				<th>등수</th>
				<th colspan = "2">비고</th>
			</tr>
			<% for(int i = 0; i < grade_list.size(); i++){ 
					GradeVO vo = grade_list.get(i);
			%>
			<tr>
				<td><%= vo.getName() %></td>
				<td><%= vo.getKor() %></td>
				<td><%= vo.getEng() %></td>
				<td><%= vo.getMat() %></td>
				<td><%= vo.getTot() %></td>
				<td><%= vo.getAvg() %></td>
				<td><%= vo.getRank() %></td>
				<td>
					<input type = "button" value = "삭제" onclick="del('<%= vo.getNo() %>');">
				</td>
				<td>
					<input type = "button" value = "수정" 
						onclick="update('<%= vo.getNo() %>', 
										'<%= vo.getName() %>',
										'<%= vo.getKor() %>',
										'<%= vo.getEng() %>',
										'<%= vo.getMat() %>');">
				</td>
			</tr>				
			<% } %>
			<tr>
				<td colspan = "9" align = "center">
					<input type = "button" value = "학생추가" id="bt_append" onclick="show_form();">
				</td>
			</tr>
		</table>
		<!-- 학생추가 폼 -->
		<div id = "disp" style="display:none">
			<form>
				<table border = "1">
					<caption>성적 입력</caption>
					<tr>
						<th>이름</th>
						<td><input name="name" id="m_name"></td>
					</tr>
					<tr>
						<th>국어</th>
						<td><input name="kor" id="m_kor"></td>
					</tr>
					<tr>
						<th>영어</th>
						<td><input name="eng" id="m_eng"></td>
					</tr>
					<tr>
						<th>수학</th>
						<td><input name="mat" id="m_mat"></td>
					</tr>
					<tr>
						<td colspan = "2" align = "center">
							<input type = "button" value = "등록" onclick="send(this.form);">
							<input type = "button" value = "취소" onclick="hide_form();">
						</td>
					</tr>
				</table>
			</form>
		</div>
		
		<!-- 학생수정 폼 -->
		<div id = "disp2" style="display:none">
			<form>
				<table border = "1">
					<caption>성적 수정</caption>
					<input type = "hidden" name = "no2" id = "m_no2">
					<tr>
						<th>이름</th>
						<td><input name="name2" id="m_name2"></td>
					</tr>
					<tr>
						<th>국어</th>
						<td><input name="kor2" id="m_kor2"></td>
					</tr>
					<tr>
						<th>영어</th>
						<td><input name="eng2" id="m_eng2"></td>
					</tr>
					<tr>
						<th>수학</th>
						<td><input name="mat2" id="m_mat2"></td>
					</tr>
					<tr>
						<td colspan = "2" align = "center">
							<input type = "button" value = "수정" onclick="send2(this.form);">
							<input type = "button" value = "취소" onclick="hide_form();">
						</td>
					</tr>
				</table>
			</form>
		</div>
	</body>
</html>