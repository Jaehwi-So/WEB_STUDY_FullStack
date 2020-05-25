/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.55
 * Generated at: 2020-05-25 07:51:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jsp_005fstart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!-- \r\n");
      out.write("# 웹과 웹 프로그래밍의 개념\r\n");
      out.write("1) URL (Uniform Resource Locator) : 웹 브라우저의 주소줄에 표시되는 경로\r\n");
      out.write("https://search.naver.com/search.naver?where=post&sm=tab_jum&query=get+post\r\n");
      out.write("1-1) 프로토콜 (http) : 웹 브라우저가 서버와 내용을 주고받을 때 사용하는 네트워크 규약\r\n");
      out.write("1-2) 서버 이름 : search.naver.com. 웹 페이지를 요청할 서버의 이름. 도메인 이름이나 IP주소를 입력할 수 있다.\r\n");
      out.write("1-3) 경로 : /search.naver 웹 페이지의 상세 주소.\r\n");
      out.write("1-4) 쿼리 문자열 : ?where=post&sm=tab_jum&query=get+post 추가로 서버로 보내는 데이터에 해당한다. \r\n");
      out.write("넘겨받은 데이터는 where, sm, query 파라미터가 있다.\r\n");
      out.write("\r\n");
      out.write("2) 웹 브라우저와 웹 서버의 통신 과정\r\n");
      out.write("a. DNS(Domain name server)에 도메인 이름(www.xxx.xxxx)에 대한 IP주소 요청\r\n");
      out.write("b. 웹 서버의 IP주소를 클라이언트에게 응답\r\n");
      out.write("c. 알아낸 IP주소에 해당하는 웹 서버에 웹 페이지 요청\r\n");
      out.write("d. 웹 브라우저(클라이언트)에 HTML 응답\r\n");
      out.write("\r\n");
      out.write("포트 번호 사용 : 여러개의 서버와의 연결 시 각 서버의 프로그램끼리 구분하기 위함\r\n");
      out.write("\r\n");
      out.write("3) HTTP 프로토콜\r\n");
      out.write("클라이언트가 웹 페이지를 요청할 시 서버는 HTML이라고 불리는 웹 표준의 형태로 웹 브라우저에 전송한다.\r\n");
      out.write("웹 브라우저가 웹 서버에 HTML을 요청하거나 웹 서버가 웹 브라우저에 HTML과 같은 것을 전송 할 때 사용할 데이터 규약.\r\n");
      out.write("웹서버와 웹 브라우저는 HTTP 프로토콜을 이용하여 데이터를 주고받음.\r\n");
      out.write(" -->\r\n");
      out.write("\r\n");
      out.write("<!-- # JSP(Java Server Page) # --\r\n");
      out.write("클라이언트 웹 기술인 HTML과 자바스크립트 등에서 사용자로부터 데이터를 넘겨받아 서버단에서 사용하는 서버 웹 기술\r\n");
      out.write("동적 페이지를 작성하는데 사용되는 자바 표준 기술.\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" -->\r\n");
      out.write("\r\n");
      out.write("<!-- jsp 헤더 -->\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("<!-- 스크립트 릿 -->   \r\n");

	/*스크립트 릿(Scriptlet) : jsp에서 자바코드를 사용하고자 할 때 지정하는 영역 */
	//JSP에서 서블릿의 내장 객체인 request 사용 가능. request는 서블릿의 객체지만, 실행 구조상 jsp가 서블릿으로 변환되어 출력되기 때문이다.
	String ip = request.getRemoteAddr(); // 접속자의 ip주소
	String name = "홍길동";
	

      out.write("\t\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<title>JSP 시작</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<p>&lt;%@ 내용 %&gt; = jsp 헤더 : 전송시 인코딩, 페이지 인코딩, import문장등을 설정하기 위해 반드시 필요한 영역</p>\r\n");
      out.write("\t\t<p>\t&lt;% 자바코드 %&gt; = 스크립트 릿 : JSP에서 자바코드를 사용하고자 할 때 지정하는 영역</p>\r\n");
      out.write("\t\t<p>\t&lt;%= 변수명 %&gt; = 스크립트릿의 변수를 출력하는 출력코드</p>\r\n");
      out.write("\t\t<p>\t&lt;%= 변수명; %&gt; 변수명 뒤에 세미콜론(;)을 사용하지 않는다.</p>\r\n");
      out.write("\t\t");
      out.print( ip );
      out.write("님 방문을 환영합니다<br>\r\n");
      out.write("\t\t");
      out.print( name );
      out.write("님 반갑습니다.\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
