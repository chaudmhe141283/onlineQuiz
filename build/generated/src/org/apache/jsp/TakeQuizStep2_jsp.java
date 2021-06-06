package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TakeQuizStep2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/component/header.jsp");
    _jspx_dependants.add("/component/menu.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/TakeQuiz.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Take Quiz</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\"> \n");
      out.write("                <img class=\"header-img\" src=\"images/top_box.gif\" alt=\"\"/>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write(" \n");
      out.write("            <div class=\"main\">\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"menu\">\n");
      out.write("            <ul class=\"nav\">\n");
      out.write("                <li><a href=\"#\">Home</a></li>\n");
      out.write("                <li><a href=\"TakeQuizStep1.jsp\">Take Quiz</a></li>\n");
      out.write("                <li><a href=\"#\">Make Quiz</a></li>\n");
      out.write("                <li><a href=\"#\">Manage Quiz</a></li>\n");
      out.write("                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("                <div class=\"main-area ml-2 mr-2\">\n");
      out.write("                    <div class=\"ml-2 mt-4\">\n");
      out.write("                        Welcome <label class=\"font-blue\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"time-remaining ml-2 mb-4 font-color-general\">\n");
      out.write("                        Time Remaining:<label class=\"font-red\"> <span id=\"countdown\"></span> </label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"ml-2 font-color-general\">\n");
      out.write("                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.lastQuestion.question}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <form class=\"mb-10\" action=\"QuizControl\" method=\"get\">\n");
      out.write("                        <input class=\"ml-2\" type=\"checkbox\" name=\"answer\" value=\"option1\">\n");
      out.write("                        <label class=\"font-color-general\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.lastQuestion.option1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </label><br/>\n");
      out.write("                        <input class=\"ml-2\" type=\"checkbox\" name=\"answer\" value=\"option2\">\n");
      out.write("                        <label class=\"font-color-general\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.lastQuestion.option2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </label><br/>\n");
      out.write("                        <input class=\"ml-2\" type=\"checkbox\" name=\"answer\" value=\"option3\">\n");
      out.write("                        <label class=\"font-color-general\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.lastQuestion.option3}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </label><br/>\n");
      out.write("                        <input class=\"ml-2\" type=\"checkbox\" name=\"answer\" value=\"option4\">\n");
      out.write("                        <label class=\"font-color-general\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.lastQuestion.option4}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </label><br/>\n");
      out.write("                        <input class=\"btn-next\" type=\"submit\" value=\"Next\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <script>\n");
      out.write("        function countdownTimer() {\n");
      out.write("//            const difference = +new Date(\"2021-06-01 14:00\") - +new Date();\n");
      out.write("//            let remaining = \"Time's up!\";\n");
      out.write("//\n");
      out.write("//            if (difference > 0) {\n");
      out.write("//                const parts = {\n");
      out.write("//                    days: Math.floor(difference / (1000 * 60 * 60 * 24)),\n");
      out.write("//                    hours: Math.floor((difference / (1000 * 60 * 60)) % 24),\n");
      out.write("//                    minutes: Math.floor((difference / 1000 / 60) % 60),\n");
      out.write("//                    seconds: Math.floor((difference / 1000) % 60)\n");
      out.write("//            };\n");
      out.write("//\n");
      out.write("//            remaining = Object.keys(parts)\n");
      out.write("//                .map(part => {\n");
      out.write("//                if (!parts[part])\n");
      out.write("//                    return;\n");
      out.write("//                return ``;\n");
      out.write("//                }).join(\" \");\n");
      out.write("//            }\n");
      out.write("//\n");
      out.write("//            document.getElementById(\"countdown\").innerHTML = remaining;\n");
      out.write("//        }\n");
      out.write("//\n");
      out.write("//        countdownTimer();\n");
      out.write("//        setInterval(countdownTimer, 1000);\n");
      out.write("        for (var i = 10; i >= 0; i--) {\n");
      out.write("            document.getElementById(\"countdown\").innerHTML = i;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    </script>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <li><a href=\"logout\">Log out</a></li>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
