/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-09-14 10:03:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/bootstrap-3.3.5-dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <title>管理页面</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../../static/css/bamboo.css\">\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/jquery-3.0.0.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/bamboo.0.1.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");

    if (session.getAttribute("id") == null) {
        request.getRequestDispatcher("adminLogin.jsp").forward(request, response);
    }


      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\"\n");
      out.write("                    aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("            </button>\n");
      out.write("            <a class=\"navbar-brand\">学生在线教学平台系统</a>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"navbar\" class=\"collapse navbar-collapse\">\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("                <li class=\"active\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/adminIndex\">主页</a></li>\n");
      out.write("                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/studentManage\">学生管理</a></li>\n");
      out.write("                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/courseManage\">课程管理</a></li>\n");
      out.write("                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/chooseManage\">选课管理</a></li>\n");
      out.write("                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/index\">返回学生版主页</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div><!--/.nav-collapse -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<div class=\"container\" style=\"margin-top: 150px\">\n");
      out.write("\n");
      out.write("    <div id=\"chart\" class=\"chart\" style=\"width:100%;height:450px;\"></div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/jquery-3.0.0.min.js\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/echarts.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("    var myChart = echarts.init(document.getElementById('chart'));\n");
      out.write("\n");
      out.write("    var option = {\n");
      out.write("        title: {\n");
      out.write("            text: '课程选课统计表'\n");
      out.write("        },\n");
      out.write("        tooltip: {\n");
      out.write("            trigger: 'axis',\n");
      out.write("            axisPointer: {            // 坐标轴指示器，坐标轴触发有效\n");
      out.write("                type: 'shadow'        // 默认为直线，可选为：'line' | 'shadow'\n");
      out.write("            }\n");
      out.write("        },\n");
      out.write("        legend: {\n");
      out.write("            data: ['已选人数', '可选人数']\n");
      out.write("        },\n");
      out.write("        grid: {\n");
      out.write("            left: '3%',\n");
      out.write("            right: '4%',\n");
      out.write("            bottom: '3%',\n");
      out.write("            containLabel: true\n");
      out.write("        },\n");
      out.write("        xAxis: {\n");
      out.write("            type: 'value'\n");
      out.write("        },\n");
      out.write("        yAxis: {\n");
      out.write("            type: 'category',\n");
      out.write("            data: ");
      out.print(session.getAttribute("listX"));
      out.write("\n");
      out.write("        },\n");
      out.write("        series: [\n");
      out.write("            {\n");
      out.write("                name: '已选人数',\n");
      out.write("                type: 'bar',\n");
      out.write("                stack: '总量',\n");
      out.write("                label: {\n");
      out.write("                    normal: {\n");
      out.write("                        show: true,\n");
      out.write("                        position: 'insideRight'\n");
      out.write("                    }\n");
      out.write("                },\n");
      out.write("                data: ");
      out.print(session.getAttribute("listSelected"));
      out.write("\n");
      out.write("            },\n");
      out.write("            {\n");
      out.write("                name: '可选人数',\n");
      out.write("                type: 'bar',\n");
      out.write("                stack: '总量',\n");
      out.write("                label: {\n");
      out.write("                    normal: {\n");
      out.write("                        show: true,\n");
      out.write("                        position: 'insideRight'\n");
      out.write("                    }\n");
      out.write("                },\n");
      out.write("                data: ");
      out.print(session.getAttribute("listLeft"));
      out.write("\n");
      out.write("            }\n");
      out.write("        ]\n");
      out.write("    };\n");
      out.write("\n");
      out.write("    myChart.setOption(option);\n");
      out.write("    window.onresize = myChart.resize;\n");
      out.write("    window.onload = myChart.resize;\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
