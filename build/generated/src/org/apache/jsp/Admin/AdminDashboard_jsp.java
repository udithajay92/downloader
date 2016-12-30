package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminDashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Dashboard</title>\n");
      out.write("        \n");
      out.write("        <link href=\"../css/bootstrap-slate.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../css/downloader.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("        <link href=\"../css/dashboard/simple-sidebar.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("        <script src=\"../js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../js/jquery-3.0.0.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("        <script src=\"../js/dashboard/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("        <script src=\"../js/AdminDataRetiever.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../js/AdminDataSet.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../js/Admin.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("        <script src=\"../js/validation.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("        <!-- Sidebar -->\n");
      out.write("        <div id=\"sidebar-wrapper\">\n");
      out.write("            <ul class=\"sidebar-nav\">\n");
      out.write("                <li class=\"sidebar-brand\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        Admin Dashboard\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\" id=\"a1\">Add Item</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\" id=\"a2\">Add Subtitle</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\" id=\"a3\">Providers</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\" id=\"a4\">Quality Type</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\" id=\"a5\">Subtitle Language</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\" id=\"a6\">Log Out</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <!-- /#sidebar-wrapper -->\n");
      out.write("\n");
      out.write("        <!-- Page Content -->\n");
      out.write("        <div id=\"page-content-wrapper\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <a href=\"#menu-toggle\" class=\"btn btn-default\" id=\"menu-toggle\" ><img src=\"../images/arrow_left.png\" hight=\"20px\" width=\"20px\"></a>\n");
      out.write("                        <h1>Admin Dashboard</h1>\n");
      out.write("                        \n");
      out.write("                        <div id=\"addDownloaderItem\">\n");
      out.write("                            <div class=\"form-horizontal\">\n");
      out.write("                                <h3>Add Downloader Item</h3>\n");
      out.write("\n");
      out.write("                                <fieldset>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"inputEmail\" class=\"col-lg-2 control-label\">Downloader Name</label>\n");
      out.write("                                        <div class=\"col-lg-6\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"txtDownloaderName\" name=\"txtDownloaderName\"  placeholder=\"Downloader Name\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"inputEmail\" class=\"col-lg-2 control-label\">File Size</label>\n");
      out.write("                                        <div class=\"col-lg-6\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"txtFileSize\" name=\"txtFileSize\"  placeholder=\"File Size\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"inputEmail\" class=\"col-lg-2 control-label\">Download Link</label>\n");
      out.write("                                        <div class=\"col-lg-6\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"txtDownloadLink\" name=\"txtDownloadLink\"  placeholder=\"Download Link\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-lg-2 control-label\">Downloader Type</label>\n");
      out.write("                                        <div class=\"col-lg-10\">\n");
      out.write("                                          <div class=\"radio\">\n");
      out.write("                                            <label>\n");
      out.write("                                              <input type=\"radio\" name=\"optionsRadios\" id=\"optionsRadiosMovie\" value=\"Movie\" checked=\"\">\n");
      out.write("                                              Movie\n");
      out.write("                                            </label>\n");
      out.write("                                          </div>\n");
      out.write("                                          <div class=\"radio\">\n");
      out.write("                                            <label>\n");
      out.write("                                              <input type=\"radio\" name=\"optionsRadios\" id=\"optionsRadiosTV\" value=\"TV\">\n");
      out.write("                                              TV Show\n");
      out.write("                                            </label>\n");
      out.write("                                          </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-sm-4 control-label\"><input type=\"checkbox\" id=\"chkActive\" checked=\"true\"> Is Active </label>\n");
      out.write("                                        <label class=\"col-sm-2 control-label\"><input type=\"checkbox\" id=\"chkVerified\" checked=\"true\"> Is Verified </label>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"IMDBID\" class=\"col-lg-2 control-label\">IMDB ID</label>\n");
      out.write("                                        <div class=\"col-lg-6\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"txtImdbId\" name=\"txtImdbId\"  placeholder=\"IMDB ID\" style=\"width:250px\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-lg-2 control-label\">Provider</label>\n");
      out.write("                                        <div class=\"col-lg-10\">\n");
      out.write("                                            <select name=\"drpProvider\" id=\"drpProvider\" class=\"form-control\" style=\"width:250px\">\n");
      out.write("                                                \n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-lg-2 control-label\">Quality</label>\n");
      out.write("                                        <div class=\"col-lg-10\">\n");
      out.write("                                            <select name=\"drpQuality\" id=\"drpQuality\" class=\"form-control\" style=\"width:250px\">\n");
      out.write("              \n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-lg-2 control-label\">Subtitle Language</label>\n");
      out.write("                                        <div class=\"col-lg-10\">\n");
      out.write("                                            <select name=\"drpSubtitleLanguage\" id=\"drpSubtitleLanguage\" class=\"form-control\" style=\"width:250px\">\n");
      out.write("                                                \n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"inputEmail\" class=\"col-lg-2 control-label\">Subtitle Link</label>\n");
      out.write("                                        <div class=\"col-lg-6\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"txtSubtitleLink\" name=\"txtSubtitleLink\"  placeholder=\"Subtitle Link\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <div class=\"col-lg-10 col-lg-offset-2\">\n");
      out.write("                                          <!--<button type=\"reset\" class=\"btn btn-default\">Cancel</button>-->\n");
      out.write("                                          <button id=\"btnSubmitDownloaderItem\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                                          <label id=\"lblWarning\"></label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                </fieldset>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <div id=\"addSubtitle\">\n");
      out.write("                            <div class=\"form-horizontal\">\n");
      out.write("                                <h3>Add Subtitle</h3>\n");
      out.write("                                \n");
      out.write("                                <fieldset>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"SearchDownloader\" class=\"col-lg-2 control-label\">Search Downloader</label>\n");
      out.write("                                        <div class=\"col-lg-6\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"txtKeywordSubtitle\" name=\"txtKeywordSubtitle\"  placeholder=\"Search Downloader\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-lg-2 control-label\">Downloader Type</label>\n");
      out.write("                                        <div class=\"col-lg-10\">\n");
      out.write("                                          <div class=\"radio\">\n");
      out.write("                                            <label>\n");
      out.write("                                              <input type=\"radio\" name=\"optionsRadiosSubtitle\" id=\"optionsRadiosMovieSubtitle\" value=\"Movie\" checked=\"\">\n");
      out.write("                                              Movie\n");
      out.write("                                            </label>\n");
      out.write("                                          </div>\n");
      out.write("                                          <div class=\"radio\">\n");
      out.write("                                            <label>\n");
      out.write("                                              <input type=\"radio\" name=\"optionsRadiosSubtitle\" id=\"optionsRadiosTVSubtitle\" value=\"TV\">\n");
      out.write("                                              TV Show\n");
      out.write("                                            </label>\n");
      out.write("                                          </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <div class=\"col-lg-10 col-lg-offset-2\">\n");
      out.write("                                          <button id=\"btnSearchDownloaderItemSubtitle\" class=\"btn btn-primary\">Search</button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <div class=\"col-lg-10 col-lg-offset-2\">\n");
      out.write("                                          <div id=\"downloaderTable\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    <div id=\"addSubtitleFor\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"col-lg-2 control-label\"></label>\n");
      out.write("                                            <label id=\"downloaderIdSubtitle\" style=\"display: none\"></label>\n");
      out.write("                                            <h4 class=\"col-lg-4 control-label\" id=\"downloaderNameSubtitle\"></h4>\n");
      out.write("                                            \n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"col-lg-2 control-label\"></label>\n");
      out.write("                                            <label class=\"col-lg-2 control-label\">Subtitle Language</label>\n");
      out.write("                                            <div class=\"col-lg-8\">\n");
      out.write("                                                <select name=\"drpSubtitleLanguageSubtitle\" id=\"drpSubtitleLanguageSubtitle\" class=\"form-control\" style=\"width:250px\">\n");
      out.write("\n");
      out.write("                                                </select>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"col-lg-2 control-label\"></label>\n");
      out.write("                                            <label for=\"inputEmail\" class=\"col-lg-2 control-label\">Subtitle Link</label>\n");
      out.write("                                            <div class=\"col-lg-6\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"txtSubtitleLinkSubtitle\" name=\"txtSubtitleLinkSubtitle\"  placeholder=\"Subtitle Link\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"col-lg-5 control-label\"></label>\n");
      out.write("                                            <!--<div class=\"col-lg-10 col-lg-offset-2\">-->\n");
      out.write("                                                <!--<button type=\"reset\" class=\"btn btn-default\">Cancel</button>-->\n");
      out.write("                                                <button id=\"btnSubmitDownloaderItemSubtitle\" class=\"btn btn-primary\" style=\"width:150px\">Submit</button>\n");
      out.write("                                                <label id=\"lblWarning2\"></label>\n");
      out.write("                                            <!--</div>-->\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                    \n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                </fieldset>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <div id=\"providers\">\n");
      out.write("                            <div class=\"form-horizontal\">\n");
      out.write("                                <h3>Add Providers</h3>\n");
      out.write("                                \n");
      out.write("                                <fieldset>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"ProviderName\" class=\"col-lg-2 control-label\">Provider Name</label>\n");
      out.write("                                        <div class=\"col-lg-6\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"txtProviderName\" name=\"txtProviderName\"  placeholder=\"Provider Name\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"SearchDownloader\" class=\"col-lg-2 control-label\">Provider Description</label>\n");
      out.write("                                        <div class=\"col-lg-6\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"txtProviderDescription\" name=\"txtProviderDescription\"  placeholder=\"Provider Description\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <div class=\"col-lg-10 col-lg-offset-2\">\n");
      out.write("                                          <!--<button type=\"reset\" class=\"btn btn-default\">Cancel</button>-->\n");
      out.write("                                          <button id=\"btnSubmitProvider\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                                          <label id=\"lblWarningProvider\"></label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                      \n");
      out.write("                                </fieldset>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"form-horizontal\">\n");
      out.write("                                <h3>Available Providers</h3>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <fieldset>\n");
      out.write("                                        <label class=\"col-lg-2 control-label\"></label>\n");
      out.write("                                        <div id=\"tableAvailableProviders\"></div>\n");
      out.write("                                    </fieldset>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div id=\"qualityType\">\n");
      out.write("                            <div class=\"form-horizontal\">\n");
      out.write("                                <h3>Add Quality Types</h3>\n");
      out.write("                                \n");
      out.write("                                <fieldset>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"QualityTypee\" class=\"col-lg-2 control-label\">Quality Type</label>\n");
      out.write("                                        <div class=\"col-lg-6\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"txtQualityType\" name=\"txtQualityType\"  placeholder=\"Quality Type\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"QualityTypeDescription\" class=\"col-lg-2 control-label\">Quality Type Description</label>\n");
      out.write("                                        <div class=\"col-lg-6\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"txtQualityTypeDescription\" name=\"txtQualityTypeDescription\"  placeholder=\"Quality Type Description\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <div class=\"col-lg-10 col-lg-offset-2\">\n");
      out.write("                                          <!--<button type=\"reset\" class=\"btn btn-default\">Cancel</button>-->\n");
      out.write("                                          <button id=\"btnSubmitQuality\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                                          <label id=\"lblWarningQuality\"></label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                      \n");
      out.write("                                </fieldset>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"form-horizontal\">\n");
      out.write("                                <h3>Available Quality Types</h3>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <fieldset>\n");
      out.write("                                        <label class=\"col-lg-2 control-label\"></label>\n");
      out.write("                                        <div id=\"tableAvailableQualityTypes\"></div>\n");
      out.write("                                    </fieldset>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div id=\"subtitleLanguage\">\n");
      out.write("                            <div class=\"form-horizontal\">\n");
      out.write("                                <h3>Add Subtitle Language</h3>\n");
      out.write("                                \n");
      out.write("                                <fieldset>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"SubtitleLanguage\" class=\"col-lg-2 control-label\">Subtitle Language</label>\n");
      out.write("                                        <div class=\"col-lg-6\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"txtSubtitleLanguage\" name=\"txtSubtitleLanguage\"  placeholder=\"Subtitle Language\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"SubtitleLanguageDescription\" class=\"col-lg-2 control-label\">Subtitle Language Description</label>\n");
      out.write("                                        <div class=\"col-lg-6\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"txtSubtitleLanguageDescription\" name=\"txtSubtitleLanguageDescription\"  placeholder=\"Subtitle Language Description\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <div class=\"col-lg-10 col-lg-offset-2\">\n");
      out.write("                                          <!--<button type=\"reset\" class=\"btn btn-default\">Cancel</button>-->\n");
      out.write("                                          <button id=\"btnSubmitSubtitleLanguage\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                                          <label id=\"lblWarningSubtitleLanguage\"></label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                      \n");
      out.write("                                </fieldset>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"form-horizontal\">\n");
      out.write("                                <h3>Available Subtitle Languages</h3>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <fieldset>\n");
      out.write("                                        <label class=\"col-lg-2 control-label\"></label>\n");
      out.write("                                        <div id=\"tableAvailableSubtitleLanguages\"></div>\n");
      out.write("                                    </fieldset>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- /#page-content-wrapper -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- /#wrapper -->\n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Menu Toggle Script -->\n");
      out.write("    <script>\n");
      out.write("    $(\"#menu-toggle\").click(function(e) {\n");
      out.write("        e.preventDefault();\n");
      out.write("        $(\"#wrapper\").toggleClass(\"toggled\");\n");
      out.write("    });\n");
      out.write("    </script>\n");
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