/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-09-01 08:37:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cn.goodym.entity.Course;
import java.util.List;

public final class clzList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"static/bootstrap-3.3.5-dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <title>所有课程</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");

    String name = null;
    int num=1;
    List<Course> courses = (List<Course>) session.getAttribute("courses");
    if (session != null) {
        name = (String) session.getAttribute("user");
    }

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
      out.write("            <a class=\"navbar-brand\" href=\"#\">学生在线选课系统</a>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"navbar\" class=\"collapse navbar-collapse\">\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("                <li><a href=\"/index\">主页</a></li>\n");
      out.write("                <li class=\"active\"><a href=\"/showAllClasses\">所有课程</a></li>\n");
      out.write("                <li><a href=\"/showMyClasses\">我的课程</a></li>\n");
      out.write("                <li><a href=\"/adminLogin.jsp\">管理员登录</a></li>\n");
      out.write("            </ul>\n");
      out.write("            ");

                if (name != null) {
            
      out.write("\n");
      out.write("\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li><a>");
      out.print(name);
      out.write(" 欢迎您!\n");
      out.write("                </a></li>\n");
      out.write("                <li><a id=\"change\" href=\"#\" data-toggle=\"modal\"\n");
      out.write("                       data-target=\"#myModal\">修改密码</a></li>\n");
      out.write("                <li><a href=\"/logout\">退出登录</a></li>\n");
      out.write("            </ul>\n");
      out.write("            ");

            } else {
            
      out.write("\n");
      out.write("            <form class=\"navbar-form navbar-right\" action=\"/login\" method=\"post\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" placeholder=\"学号\" class=\"form-control\" name=\"id\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"password\" placeholder=\"密码\" class=\"form-control\" name=\"pwd\">\n");
      out.write("                </div>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-success\">登录</button>\n");
      out.write("            </form>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </div><!--/.nav-collapse -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<div class=\"container theme-showcase\" role=\"main\">\n");
      out.write("\n");
      out.write("    <ol class=\"breadcrumb\" style=\"margin-top: 100px\">\n");
      out.write("        <li><a href=\"/index\">首页</a></li>\n");
      out.write("        <li class=\"active\">所有课程</li>\n");
      out.write("    </ol>\n");
      out.write("\n");
      out.write("    <table class=\"table table-striped\">\n");
      out.write("        <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th>编号</th>\n");
      out.write("            <th>课程名称</th>\n");
      out.write("            <th>授课老师</th>\n");
      out.write("            <th>学分</th>\n");
      out.write("            <th>开课学期</th>\n");
      out.write("            <th>课程容量</th>\n");
      out.write("            <th>操作</th>\n");
      out.write("        </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("        ");

            for(Course c:courses){
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print(num++);
      out.write("</td>\n");
      out.write("            <td>");
      out.print(c.getName());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(c.getBelong());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(c.getCredit());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(c.getTime());
      out.write("</td>\n");
      out.write("            <td>");
      out.print(c.getSelected());
      out.write(' ');
      out.write('/');
      out.write(' ');
      out.print(c.getAmount());
      out.write("</td>\n");
      out.write("            <td><a class=\"btn btn-primary\" href=\"/showDetail?id=");
      out.print(c.getId());
      out.write("\">详情</a></td>\n");
      out.write("        </tr>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("    <div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\"\n");
      out.write("         aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <button type=\"button\" class=\"close\"\n");
      out.write("                            data-dismiss=\"modal\" aria-hidden=\"true\">\n");
      out.write("                        &times;\n");
      out.write("                    </button>\n");
      out.write("                    <h4 class=\"modal-title\" id=\"myModalLabel\">\n");
      out.write("                        修改密码\n");
      out.write("                    </h4>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <form action=\"/changePwd\" method=\"post\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"old\">旧密码</label>\n");
      out.write("                            <input type=\"password\" class=\"form-control\" id=\"old\" name=\"old\" placeholder=\"旧密码\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"newpwd\">新密码</label>\n");
      out.write("                            <input type=\"password\" class=\"form-control\" id=\"newpwd\" name=\"newpwd\" placeholder=\"新密码\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"newagain\">确认新密码</label>\n");
      out.write("                            <input type=\"password\" class=\"form-control\" id=\"newagain\" name=\"newagain\" placeholder=\"再次输入新密码\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-success\" value=\"提交\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default\"\n");
      out.write("                                    data-dismiss=\"modal\">关闭\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div><!-- /.modal-content -->\n");
      out.write("        </div><!-- /.modal -->\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("<script src=\"static/js/jquery-3.0.0.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"static/bootstrap-3.3.5-dist/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
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
