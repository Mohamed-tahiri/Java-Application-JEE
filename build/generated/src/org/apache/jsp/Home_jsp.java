package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/./template/partials/head_1.jsp");
    _jspx_dependants.add("/./template/partials/header_1.jsp");
    _jspx_dependants.add("/./template/partials/sidebar_1.jsp");
    _jspx_dependants.add("/./template/partials/footer_1.jsp");
    _jspx_dependants.add("/./template/partials/script_1.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <!-- Head -->\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<head>\n");
      out.write("  \t<meta charset=\"utf-8\">\n");
      out.write("  \t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  \t<title>Parking !</title>\n");
      out.write("  \t<link rel=\"stylesheet\" href=\"../assets/vendors/iconfonts/mdi/css/materialdesignicons.css\">\n");
      out.write(" \t<link rel=\"stylesheet\" href=\"../assets/css/shared/style.css\">\n");
      out.write("  \t<link rel=\"stylesheet\" href=\"../assets/css/demo_1/style.css\">\n");
      out.write("  \t<link rel=\"shortcut icon\" href=\"../asssets/images/favicon.ico\" />\n");
      out.write("</head>");
      out.write("\n");
      out.write("  <!-- End Head -->\n");
      out.write("  <body class=\"header-fixed\">\n");
      out.write("    \n");
      out.write("    <!-- Header -->\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<nav class=\"t-header\">\n");
      out.write("      <div class=\"t-header-brand-wrapper\">\n");
      out.write("        <a href=\"index.html\">\n");
      out.write("          <img class=\"logo\" src=\"../assets/images/logo.svg\" alt=\"\">\n");
      out.write("          <img class=\"logo-mini\" src=\"../assets/images/logo_mini.svg\" alt=\"\">\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"t-header-content-wrapper\">\n");
      out.write("        <div class=\"t-header-content\">\n");
      out.write("          <button class=\"t-header-toggler t-header-mobile-toggler d-block d-lg-none\">\n");
      out.write("            <i class=\"mdi mdi-menu\"></i>\n");
      out.write("          </button>\n");
      out.write("          <form action=\"#\" class=\"t-header-search-box\">\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"inlineFormInputGroup\" placeholder=\"Search\" autocomplete=\"off\">\n");
      out.write("              <button class=\"btn btn-primary\" type=\"submit\"><i class=\"mdi mdi-arrow-right-thick\"></i></button>\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("          <ul class=\"nav ml-auto\">\n");
      out.write("            <li class=\"nav-item dropdown\">\n");
      out.write("              <a class=\"nav-link\" href=\"#\" id=\"notificationDropdown\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                <i class=\"mdi mdi-bell-outline mdi-1x\"></i>\n");
      out.write("              </a>\n");
      out.write("              <div class=\"dropdown-menu navbar-dropdown dropdown-menu-right\" aria-labelledby=\"notificationDropdown\">\n");
      out.write("                <div class=\"dropdown-header\">\n");
      out.write("                  <h6 class=\"dropdown-title\">Notifications</h6>\n");
      out.write("                  <p class=\"dropdown-title-text\">You have 4 unread notification</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"dropdown-body\">\n");
      out.write("                  <div class=\"dropdown-list\">\n");
      out.write("                    <div class=\"icon-wrapper rounded-circle bg-inverse-primary text-primary\">\n");
      out.write("                      <i class=\"mdi mdi-alert\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"content-wrapper\">\n");
      out.write("                      <small class=\"name\">Storage Full</small>\n");
      out.write("                      <small class=\"content-text\">Server storage almost full</small>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"dropdown-list\">\n");
      out.write("                    <div class=\"icon-wrapper rounded-circle bg-inverse-success text-success\">\n");
      out.write("                      <i class=\"mdi mdi-cloud-upload\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"content-wrapper\">\n");
      out.write("                      <small class=\"name\">Upload Completed</small>\n");
      out.write("                      <small class=\"content-text\">3 Files uploded successfully</small>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"dropdown-list\">\n");
      out.write("                    <div class=\"icon-wrapper rounded-circle bg-inverse-warning text-warning\">\n");
      out.write("                      <i class=\"mdi mdi-security\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"content-wrapper\">\n");
      out.write("                      <small class=\"name\">Authentication Required</small>\n");
      out.write("                      <small class=\"content-text\">Please verify your password to continue using cloud services</small>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"dropdown-footer\">\n");
      out.write("                  <a href=\"#\">View All</a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item dropdown\">\n");
      out.write("              <a class=\"nav-link\" href=\"#\" id=\"messageDropdown\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                <i class=\"mdi mdi-message-outline mdi-1x\"></i>\n");
      out.write("                <span class=\"notification-indicator notification-indicator-primary notification-indicator-ripple\"></span>\n");
      out.write("              </a>\n");
      out.write("              <div class=\"dropdown-menu navbar-dropdown dropdown-menu-right\" aria-labelledby=\"messageDropdown\">\n");
      out.write("                <div class=\"dropdown-header\">\n");
      out.write("                  <h6 class=\"dropdown-title\">Messages</h6>\n");
      out.write("                  <p class=\"dropdown-title-text\">You have 4 unread messages</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"dropdown-body\">\n");
      out.write("                  <div class=\"dropdown-list\">\n");
      out.write("                    <div class=\"image-wrapper\">\n");
      out.write("                      <img class=\"profile-img\" src=\"../assets/images/profile/male/image_1.png\" alt=\"profile image\">\n");
      out.write("                      <div class=\"status-indicator rounded-indicator bg-success\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"content-wrapper\">\n");
      out.write("                      <small class=\"name\">Clifford Gordon</small>\n");
      out.write("                      <small class=\"content-text\">Lorem ipsum dolor sit amet.</small>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"dropdown-list\">\n");
      out.write("                    <div class=\"image-wrapper\">\n");
      out.write("                      <img class=\"profile-img\" src=\"../assets/images/profile/female/image_2.png\" alt=\"profile image\">\n");
      out.write("                      <div class=\"status-indicator rounded-indicator bg-success\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"content-wrapper\">\n");
      out.write("                      <small class=\"name\">Rachel Doyle</small>\n");
      out.write("                      <small class=\"content-text\">Lorem ipsum dolor sit amet.</small>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"dropdown-list\">\n");
      out.write("                    <div class=\"image-wrapper\">\n");
      out.write("                      <img class=\"profile-img\" src=\"../assets/images/profile/male/image_3.png\" alt=\"profile image\">\n");
      out.write("                      <div class=\"status-indicator rounded-indicator bg-warning\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"content-wrapper\">\n");
      out.write("                      <small class=\"name\">Lewis Guzman</small>\n");
      out.write("                      <small class=\"content-text\">Lorem ipsum dolor sit amet.</small>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"dropdown-footer\">\n");
      out.write("                  <a href=\"#\">View All</a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item dropdown\">\n");
      out.write("              <a class=\"nav-link\" href=\"#\" id=\"appsDropdown\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                <i class=\"mdi mdi-apps mdi-1x\"></i>\n");
      out.write("              </a>\n");
      out.write("              <div class=\"dropdown-menu navbar-dropdown dropdown-menu-right\" aria-labelledby=\"appsDropdown\">\n");
      out.write("                <div class=\"dropdown-header\">\n");
      out.write("                  <h6 class=\"dropdown-title\">Apps</h6>\n");
      out.write("                  <p class=\"dropdown-title-text mt-2\">Authentication required for 3 apps</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"dropdown-body border-top pt-0\">\n");
      out.write("                  <a class=\"dropdown-grid\">\n");
      out.write("                    <i class=\"grid-icon mdi mdi-jira mdi-2x\"></i>\n");
      out.write("                    <span class=\"grid-tittle\">Jira</span>\n");
      out.write("                  </a>\n");
      out.write("                  <a class=\"dropdown-grid\">\n");
      out.write("                    <i class=\"grid-icon mdi mdi-trello mdi-2x\"></i>\n");
      out.write("                    <span class=\"grid-tittle\">Trello</span>\n");
      out.write("                  </a>\n");
      out.write("                  <a class=\"dropdown-grid\">\n");
      out.write("                    <i class=\"grid-icon mdi mdi-artstation mdi-2x\"></i>\n");
      out.write("                    <span class=\"grid-tittle\">Artstation</span>\n");
      out.write("                  </a>\n");
      out.write("                  <a class=\"dropdown-grid\">\n");
      out.write("                    <i class=\"grid-icon mdi mdi-bitbucket mdi-2x\"></i>\n");
      out.write("                    <span class=\"grid-tittle\">Bitbucket</span>\n");
      out.write("                  </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"dropdown-footer\">\n");
      out.write("                  <a href=\"#\">View All</a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <!-- End Header -->\n");
      out.write("    \n");
      out.write("    <div class=\"page-body\">\n");
      out.write("        <!-- Sidebar-->\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<div class=\"sidebar\">\n");
      out.write("  <div class=\"user-profile\">\n");
      out.write("    <div class=\"display-avatar animated-avatar\">\n");
      out.write("      <img class=\"profile-img img-lg rounded-circle\" src=\"../assets/images/profile/male/image_1.png\" alt=\"profile image\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"info-wrapper\">\n");
      out.write("      <p class=\"user-name\">Allen Clerk</p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <ul class=\"navigation-menu\">\n");
      out.write("    <li class=\"nav-category-divider\">MAIN</li>\n");
      out.write("    <li>\n");
      out.write("      <a href=\"index.html\">\n");
      out.write("        <span class=\"link-title\">Dashboard</span>\n");
      out.write("        <i class=\"mdi mdi-gauge link-icon\"></i>\n");
      out.write("      </a>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("      <a href=\"#sample-pages\" data-toggle=\"collapse\" aria-expanded=\"false\">\n");
      out.write("        <span class=\"link-title\">Sample Pages</span>\n");
      out.write("        <i class=\"mdi mdi-flask link-icon\"></i>\n");
      out.write("      </a>\n");
      out.write("      <ul class=\"collapse navigation-submenu\" id=\"sample-pages\">\n");
      out.write("        <li>\n");
      out.write("          <a href=\"pages/sample-pages/login_1.html\" target=\"_blank\">Login</a>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("          <a href=\"pages/sample-pages/error_2.html\" target=\"_blank\">Error</a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("      <a href=\"#ui-elements\" data-toggle=\"collapse\" aria-expanded=\"false\">\n");
      out.write("        <span class=\"link-title\">UI Elements</span>\n");
      out.write("        <i class=\"mdi mdi-bullseye link-icon\"></i>\n");
      out.write("      </a>\n");
      out.write("      <ul class=\"collapse navigation-submenu\" id=\"ui-elements\">\n");
      out.write("        <li>\n");
      out.write("          <a href=\"pages/ui-components/buttons.html\">Buttons</a>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("          <a href=\"pages/ui-components/tables.html\">Tables</a>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("          <a href=\"pages/ui-components/typography.html\">Typography</a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("      <a href=\"pages/forms/form-elements.html\">\n");
      out.write("        <span class=\"link-title\">Forms</span>\n");
      out.write("        <i class=\"mdi mdi-clipboard-outline link-icon\"></i>\n");
      out.write("      </a>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("      <a href=\"pages/charts/chartjs.html\">\n");
      out.write("        <span class=\"link-title\">Charts</span>\n");
      out.write("        <i class=\"mdi mdi-chart-donut link-icon\"></i>\n");
      out.write("      </a>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("      <a href=\"pages/icons/material-icons.html\">\n");
      out.write("        <span class=\"link-title\">Icons</span>\n");
      out.write("        <i class=\"mdi mdi-flower-tulip-outline link-icon\"></i>\n");
      out.write("      </a>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"nav-category-divider\">DOCS</li>\n");
      out.write("    <li>\n");
      out.write("      <a href=\"../docs/docs.html\">\n");
      out.write("        <span class=\"link-title\">Documentation</span>\n");
      out.write("        <i class=\"mdi mdi-asterisk link-icon\"></i>\n");
      out.write("      </a>\n");
      out.write("    </li>\n");
      out.write("  </ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        <!-- End Sidebar -->\n");
      out.write("    \n");
      out.write("        <div class=\"page-content-wrapper\">\n");
      out.write("            <div class=\"page-content-wrapper-inner\">\n");
      out.write("                <div class=\"content-viewport\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <!-- Contenu -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        <!-- content viewport ends -->\n");
      out.write("            <!-- Footer -->\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<footer class=\"footer\">\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-sm-12 text-center text-sm-center mt-6 mt-sm-0\">\n");
      out.write("      <small class=\"text-muted d-block\">Copyright © 2022 Parking App! .</small>\n");
      out.write("      <small class=\"text-gray mt-2\">Tahiri Med With <i class=\"mdi mdi-heart text-danger\"></i></small>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</footer>\n");
      out.write(" \n");
      out.write("            <!-- End Footer -->\n");
      out.write("        </div>\n");
      out.write("        <!-- page content ends -->\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <!-- Script -->\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<script src=\"../assets/vendors/js/core.js\"></script>\n");
      out.write("<script src=\"../assets/vendors/apexcharts/apexcharts.min.js\"></script>\n");
      out.write("<script src=\"../assets/vendors/chartjs/Chart.min.js\"></script>\n");
      out.write("<script src=\"../assets/js/charts/chartjs.addon.js\"></script>\n");
      out.write("<script src=\"../assets/js/template.js\"></script>\n");
      out.write("<script src=\"../assets/js/dashboard.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- End Script -->  \n");
      out.write("\t\n");
      out.write("  </body>\n");
      out.write("</html>");
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
