package action;
/*
Servlet(server + let)
-서버에서 실행되는 서비스 객체. 사용자의 요구사항을 제공함.
-웹 응용프로그램을 만드는 JAVA기반의 기술. 실행 결과값을 HTML형식으로 돌려준다.
-HTML의 정적인 문제를 해결할 수 있는 동적인 특징을 가진다.
-자바언어로 작성되어 자바의 일반적인 특징을 모두 가지고 있다.
-스레드로 처리된다. 즉 동시다발적인 사용자의 접속과 요구에 대한 응답이 용이하다
*/
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StartServlet
 */

//URL Mapping : 서블릿을 실행시킬 때의 참조주소. url을 통해 매핑을 호출한다. 모든 서블릿은 url을 중복해서 생성하면 안 된다.
@WebServlet("/start.do")
public class StartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request : 요청 처리 객체 , 클라이언트의 요청정보를 받아주는 객체
		//response : 응답 처리 객체, 요청받은 정보를 HTML형태로 응답하는 객체.
		
		/* request를 통해 클라이언트 정보를 받음. */
		String ip = request.getRemoteAddr(); // request로부터 접속자의 ip를 획득.
		
		/* response를 통해 접속한 사용자에게 응답처리. */
		// 한글을 사용하기 위하여 html문서 속성, 인코딩 처리
		response.setContentType("text/html; charset = utf-8");	
		
		// HTML페이지를 통해 응답처리
		PrintWriter out = response.getWriter();	//출력 스트림 생성
		
		//직접 HTML코드를 구성
		out.println("<html>");
		out.println("<head>");
		out.println("<style> h1{color : red;} </style>");
		out.println("</head>");
		out.println("<body>");
		out.printf("<h1>[%s]님 방문을 환영합니다</h1>", ip);
		out.println("</body>");	
		out.println("</html>");
		System.out.println(ip + "님 접속을 환영합니다.");
	}

}
