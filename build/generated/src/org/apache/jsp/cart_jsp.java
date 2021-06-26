package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Chinese-Foods&Drinks - Free Bootstrap 4 Template by Colorlib</title>\n");
      out.write("        <link rel=\"icon\" href=\"images/logo.jpg\">\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700,800&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Amatic+SC:400,700&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/open-iconic-bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/aos.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/ionicons.min.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-datepicker.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery.timepicker.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/flaticon.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/icomoon.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"goto-here\">\n");
      out.write("        <div>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <section class=\"ftco-section ftco-cart\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12 ftco-animate\">\n");
      out.write("                        <div class=\"cart-list\">\n");
      out.write("                            <table class=\"table\">\n");
      out.write("                                <thead class=\"thead-primary\">\n");
      out.write("                                    <tr class=\"text-center\">\n");
      out.write("                                        <th>&nbsp;</th>\n");
      out.write("                                        <th>&nbsp;</th>\n");
      out.write("                                        <th>Product name</th>\n");
      out.write("                                        <th>Price</th>\n");
      out.write("                                        <th>Quantity</th>\n");
      out.write("                                        <th>Total</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row justify-content-end\">\n");
      out.write("                    <\t\t<div class=\"col-lg-4 mt-5 cart-wrap ftco-animate\">\n");
      out.write("                        <div class=\"cart-total mb-3\">\n");
      out.write("\n");
      out.write("                            <p class=\"d-flex total-price\">\n");
      out.write("                                <span>Total</span>\n");
      out.write("\n");
      out.write("                                <span>");
      out.print(request.getAttribute("total"));
      out.write("</span>\n");
      out.write("\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                        <p><a href=\"#\" class=\"btn btn-primary py-4 px-3\">PAY FOR PRODUCT</a></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- loader -->\n");
      out.write("        <div id=\"ftco-loader\" class=\"show fullscreen\"><svg class=\"circular\" width=\"48px\" height=\"48px\"><circle class=\"path-bg\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke=\"#eeeeee\"/><circle class=\"path\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke-miterlimit=\"10\" stroke=\"#F96D00\"/></svg></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery-migrate-3.0.1.min.js\"></script>\n");
      out.write("        <script src=\"js/popper.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("        <script src=\"js/jquery.waypoints.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.stellar.min.js\"></script>\n");
      out.write("        <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("        <script src=\"js/aos.js\"></script>\n");
      out.write("        <script src=\"js/jquery.animateNumber.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap-datepicker.js\"></script>\n");
      out.write("        <script src=\"js/scrollax.min.js\"></script>\n");
      out.write("        <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false\"></script>\n");
      out.write("        <script src=\"js/google-map.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("\n");
      out.write("                var quantitiy = 0;\n");
      out.write("                $('.quantity-right-plus').click(function (e) {\n");
      out.write("\n");
      out.write("                    // Stop acting like a button\n");
      out.write("                    e.preventDefault();\n");
      out.write("                    // Get the field name\n");
      out.write("                    var quantity = parseInt($('#quantity').val());\n");
      out.write("\n");
      out.write("                    // If is not undefined\n");
      out.write("\n");
      out.write("                    $('#quantity').val(quantity + 1);\n");
      out.write("\n");
      out.write("\n");
      out.write("                    // Increment\n");
      out.write("\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                $('.quantity-left-minus').click(function (e) {\n");
      out.write("                    // Stop acting like a button\n");
      out.write("                    e.preventDefault();\n");
      out.write("                    // Get the field name\n");
      out.write("                    var quantity = parseInt($('#quantity').val());\n");
      out.write("\n");
      out.write("                    // If is not undefined\n");
      out.write("\n");
      out.write("                    // Increment\n");
      out.write("                    if (quantity > 0) {\n");
      out.write("                        $('#quantity').val(quantity - 1);\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.order.items}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <tr class=\"text-center\">\n");
          out.write("                                            <td class=\"product-remove\"><a href=\"deletecart?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.product.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><span class=\"ion-ios-close\"></span></a></td>\n");
          out.write("\n");
          out.write("                                            <td class=\"image-prod\"><div class=\"img\" style=\"background-image:url(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.product.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(");\"></div></td>\n");
          out.write("\n");
          out.write("                                            <td class=\"product-name\">\n");
          out.write("                                                <h3>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h3>\n");
          out.write("                                                <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.product.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                            </td>\n");
          out.write("\n");
          out.write("                                            <td class=\"price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\n");
          out.write("                                            <td class=\"quantity\">\n");
          out.write("                                                <h6>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h6>\n");
          out.write("<!--                                                <div class=\"input-group mb-3\">-->\n");
          out.write("                                                    <input type=\"hidden\" name=\"quantity\" class=\"quantity form-control input-number\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" min=\"1\" max=\"100\">\n");
          out.write("                                                   \n");
          out.write("<!--                                                </div>-->\n");
          out.write("                                            </td>\n");
          out.write("\n");
          out.write("                                            <td class=\"total\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price*o.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        </tr><!-- END TR-->\n");
          out.write("\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
