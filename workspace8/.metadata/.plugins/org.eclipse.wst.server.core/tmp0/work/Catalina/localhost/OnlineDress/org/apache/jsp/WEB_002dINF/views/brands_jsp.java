/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.24
 * Generated at: 2018-01-08 15:39:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class brands_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<style>.bs-calltoaction{\r\n");
      out.write("    position: relative;\r\n");
      out.write("    width:auto;\r\n");
      out.write("    padding: 15px 25px;\r\n");
      out.write("    border: 1px solid black;\r\n");
      out.write("    margin-top: 10px;\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("    .bs-calltoaction > .row{\r\n");
      out.write("        display:table;\r\n");
      out.write("        width: calc(100% + 30px);\r\n");
      out.write("    }\r\n");
      out.write("     \r\n");
      out.write("        .bs-calltoaction > .row > [class^=\"col-\"],\r\n");
      out.write("        .bs-calltoaction > .row > [class*=\" col-\"]{\r\n");
      out.write("            float:none;\r\n");
      out.write("            display:table-cell;\r\n");
      out.write("            vertical-align:top;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("            .cta-contents{\r\n");
      out.write("                padding-top: 10px;\r\n");
      out.write("                padding-bottom: 10px;\r\n");
      out.write("                border-right:1px solid #cacaca;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            .cta-title > img{\r\n");
      out.write("                width:128px;\r\n");
      out.write("                height:128px;\r\n");
      out.write("                text-align:center;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("                .cta-title{\r\n");
      out.write("                    margin: 0 auto;\r\n");
      out.write("                    padding: 0;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .cta-desc{\r\n");
      out.write("                    padding: 0;\r\n");
      out.write("                    text-align:center;\r\n");
      out.write("                    font-weight:bold;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .cta-desc p:last-child{\r\n");
      out.write("                    margin-bottom: 0;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            .cta-button{\r\n");
      out.write("                padding-top: 10px;\r\n");
      out.write("                padding-bottom: 10px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("@media (max-width: 991px){\r\n");
      out.write("    .bs-calltoaction > .row{\r\n");
      out.write("        display:block;\r\n");
      out.write("        width: auto;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("        .bs-calltoaction > .row > [class^=\"col-\"],\r\n");
      out.write("        .bs-calltoaction > .row > [class*=\" col-\"]{\r\n");
      out.write("            float:none;\r\n");
      out.write("            display:block;\r\n");
      out.write("            position: relative;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .cta-contents{\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".bs-calltoaction.bs-calltoaction-default{\r\n");
      out.write("    color: #333;\r\n");
      out.write("    background-color: #fff;\r\n");
      out.write("    border-color: #ccc;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bs-calltoaction.bs-calltoaction-primary{\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    background-color: #337ab7;\r\n");
      out.write("    border-color: #2e6da4;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bs-calltoaction.bs-calltoaction-info{\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    background-color: #5bc0de;\r\n");
      out.write("    border-color: #46b8da;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bs-calltoaction.bs-calltoaction-success{\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    background-color: #5cb85c;\r\n");
      out.write("    border-color: #4cae4c;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bs-calltoaction.bs-calltoaction-warning{\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    background-color: #f0ad4e;\r\n");
      out.write("    border-color: #eea236;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bs-calltoaction.bs-calltoaction-danger{\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    background-color: #d9534f;\r\n");
      out.write("    border-color: #d43f3a;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bs-calltoaction.bs-calltoaction-primary .cta-button .btn,\r\n");
      out.write(".bs-calltoaction.bs-calltoaction-info .cta-button .btn,\r\n");
      out.write(".bs-calltoaction.bs-calltoaction-success .cta-button .btn,\r\n");
      out.write(".bs-calltoaction.bs-calltoaction-warning .cta-button .btn,\r\n");
      out.write(".bs-calltoaction.bs-calltoaction-danger .cta-button .btn{\r\n");
      out.write("    border-color:#fff;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("            <div class=\"col-sm-12\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"bs-calltoaction bs-calltoaction-default\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-2 cta-contents\">\r\n");
      out.write("                            <h1 class=\"cta-title\"><img src=\"http://image21.weroa.com/o_img/2016/10/11/209194-10120346-home/women-s-elegant-v-neck-a-line-chiffon-long-evening-prom-dress.jpg,https://cdn-image.realsimple.com/sites/default/files/styles/rs_horizontal_image_4/public/1479312216/white-house-black-market-jacquard-high-low-dress.jpg?itok=v9ixRlTM\" width=\"128\" height=\"128\"></h1>\r\n");
      out.write("                                                        <h1 class=\"cta-title\"><img src=\"https://cdn-image.realsimple.com/sites/default/files/styles/rs_horizontal_image_4/public/1479312216/white-house-black-market-jacquard-high-low-dress.jpg?itok=v9ixRlTM\" width=\"128\" height=\"128\"></h1>\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"cta-desc\">\r\n");
      out.write("                                <p>24% Cashback</p>\r\n");
      out.write("                                <a href=\"#\" class=\"btn btn-primary btn-block\">Go to store</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-10 cta-button\">\r\n");
      out.write("                            <h3>pongal discount</h3>\r\n");
      out.write("                            <p>discount on every brand\r\n");
      out.write("                            \r\n");
      out.write("</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                     </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("</body>\r\n");
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
