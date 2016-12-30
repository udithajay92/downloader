package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Downloader_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/PageLoad", out, false);
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Downloader</title>\n");
      out.write("        <link href=\"css/bootstrap-slate.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/navbar_style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/downloader.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("        <link href=\"css/slider/js-image-slider.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("        <script src=\"js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("        <script src=\"js/jquery-3.0.0.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"js/Downloader.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("        <script src=\"js/slider/js-image-slider.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <nav class=\"navbar navbar-default\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("      </button>\n");
      out.write("      <a class=\"navbar-brand\" href=\"Downloader.jsp\">Downloader</a>\n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      <div class=\"navbar-form navbar-left\">\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"txtSearch\" placeholder=\"Search\" autocomplete=\"off\" style=\"width: 400px\">\n");
      out.write("        </div>\n");
      out.write("        <button id=\"btnSearch\" class=\"btn btn-default\" style=\"width: 120px\">Search</button>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("    <div class=\"nav navbar-nav navbar-right\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("      <ul class=\"nav navbar-nav\" >\n");
      out.write("          <li><a href=\"Downloader.jsp\">Home</a></li>\n");
      out.write("          <li><a href=\"DownloaderSpecialist.jsp?id=1\">Movies</a></li>\n");
      out.write("          <li><a href=\"DownloaderSpecialist.jsp?id=2\">TV Shows</a></li>\n");
      out.write("        <li class=\"dropdown\" id=\"liCreateAccount\">\n");
      out.write("          <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Login / Create Account <span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("              <form name=\"LoginUser\" action=\"LoginUser\" method=\"post\">\n");
      out.write("                    <li><table class=\"table table-striped table-hover \">\n");
      out.write("                          <tr>\n");
      out.write("                              <td>\n");
      out.write("                                    Username</li>\n");
      out.write("                              </td>\n");
      out.write("                              <td>\n");
      out.write("                                    <input class=\"form-control input-sm\" type=\"text\" name=\"txtUsernameORemail\" id=\"txtUsernameORemail\">\n");
      out.write("                              </td>\n");
      out.write("                          </tr>\n");
      out.write("                      </table>\n");
      out.write("                    </li>\n");
      out.write("                    <li><table class=\"table table-striped table-hover \">\n");
      out.write("                          <tr>\n");
      out.write("                              <td>\n");
      out.write("                                    Password</li>\n");
      out.write("                              </td>\n");
      out.write("                              <td>\n");
      out.write("                                    <input class=\"form-control input-sm\" type=\"password\" name=\"txtPassword\" id=\"txtPassword\">\n");
      out.write("                              </td>\n");
      out.write("                          </tr>\n");
      out.write("                      </table>\n");
      out.write("                    </li>\n");
      out.write("                <li>\n");
      out.write("                    <Button type=\"submit\" class=\"btn btn-default\" style=\"width:180px;\">Login</Button>\n");
      out.write("                </li>\n");
      out.write("                </form>\n");
      out.write("                <li> <br></li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"Users/CreateAccount.jsp\" class=\"btn btn-default\">Create Account</a>\n");
      out.write("                </li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("            <li id=\"liUsername\"><a href=\"Users/UpdateDetails.jsp\"><span id=\"username\"></span></a></li>\n");
      out.write("      \n");
      out.write("            <li class=\"dropdown\" id=\"liLogOut\">\n");
      out.write("          <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\"><span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\" role=\"menu\">              \n");
      out.write("                <li>\n");
      out.write("                    <form name=\"LogOut\" action=\"LogOut\" method=\"post\">\n");
      out.write("                        <Button type=\"submit\" class=\"btn btn-default\" style=\"width:180px;\">Log Out</Button>\n");
      out.write("                    </form>\n");
      out.write("                </li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("          \n");
      out.write("         ");
      out.write("    \n");
      out.write("         \n");
      out.write("         ");
      out.write("   \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         <div id=\"sliderFrame\">\n");
      out.write("        <div id=\"slider\">\n");
      out.write("            <a class=\"lazyImage\" href=\"images/slider/image-slider-1.jpg\" title=\"Pure Javascript. No jQuery. No flash.\"></a>\n");
      out.write("            <a class=\"lazyImage\" href=\"images/slider/image-slider-2.jpg\" title=\"Pure Javascript. No jQuery. No flash.\"></a>\n");
      out.write("            <a class=\"lazyImage\" href=\"images/slider/image-slider-3.jpg\" title=\"Pure Javascript. No jQuery. No flash.\"></a>\n");
      out.write("            <a class=\"lazyImage\" href=\"images/slider/image-slider-4.jpg\" title=\"Pure Javascript. No jQuery. No flash.\"></a>\n");
      out.write("            <a class=\"lazyImage\" href=\"images/slider/image-slider-5.jpg\" title=\"#htmlcaption5\"></a>\n");
      out.write("            <a class=\"lazyImage\" href=\"images/slider/image-slider-1.jpg\" title=\"Light weight Image Slider\"></a>\n");
      out.write("            <a class=\"lazyImage\" href=\"images/slider/image-slider-2.jpg\" title=\"Fine tuned. Sleek & Smooth\"></a>\n");
      out.write("            <a class=\"lazyImage\" href=\"images/slider/image-slider-3.jpg\" title=\"Easy-to-Use Slider\"></a>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("                \n");
      out.write("        <!--thumbnails-->\n");
      out.write("        <div id=\"thumbs\">\n");
      out.write("            <div class=\"thumb\"><img src=\"images/slider/thumb1.jpg\" /></div>\n");
      out.write("            <div class=\"thumb\"><img src=\"images/slider/thumb2.jpg\" /></div>\n");
      out.write("            <div class=\"thumb\"><img src=\"images/slider/thumb3.jpg\" /></div>\n");
      out.write("            <div class=\"thumb\"><img src=\"images/slider/thumb4.jpg\" /></div>\n");
      out.write("            <div class=\"thumb\"><img src=\"images/slider/thumb5.jpg\" /></div>\n");
      out.write("            <div class=\"thumb\"><img src=\"images/slider/thumb1.jpg\" /></div>\n");
      out.write("            <div class=\"thumb\"><img src=\"images/slider/thumb2.jpg\" /></div>\n");
      out.write("            <div class=\"thumb\"><img src=\"images/slider/thumb3.jpg\" /></div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("          ");
      out.write("   \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          ");
      out.write(" \n");
      out.write("         \n");
      out.write("          </br></br>\n");
      out.write("        <div class=\"container text-left\">    \n");
      out.write("\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-md-push-12 well\">\n");
      out.write("                <div id=\"downloaderTable\"></div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("         ");
      out.write(" \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
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
}
