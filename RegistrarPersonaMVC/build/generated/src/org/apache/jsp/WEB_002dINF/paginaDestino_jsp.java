package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class paginaDestino_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        ");
  // Este es un scriptlet             
            // Es c??digo en Javaque captura los par??metros enviados        
            // en el objeto "request"         
            String nombre = request.getParameter("nombre");       
            String color = request.getParameter("color");       
            String mail = request.getParameter("mail");              
            
      out.write("\n");
      out.write("        \n");
      out.write("             <h1> Esta es la p??gina destino</h1>  \n");
      out.write("             <h2> Aqui se despliegan los datos que se recibieron</h2>      \n");
      out.write("             <p> Tus datos son los siguientes: </p>\n");
      out.write("         <table cellspacing=\"3\" cellpadding=\"3\" border=\"1\" >     \n");
      out.write("             <tr>          \n");
      out.write("                 <td align=\"right\"> Te llamas: </td>      \n");
      out.write("                 <td> ");
      out.print( nombre );
      out.write(" </td>     \n");
      out.write("             </tr>    \n");
      out.write("             <tr> \n");
      out.write("                  <td align=\"right\"> Tu color favorito es: </td>      \n");
      out.write("                  <td> ");
      out.print( color );
      out.write(" </td>   \n");
      out.write("             </tr>        \n");
      out.write("             <tr>\n");
      out.write("                 <td align=\"right\"> Y tu correo es: </td>        \n");
      out.write("                 <td> ");
      out.print( mail );
      out.write(" </td>     \n");
      out.write("             </tr>        \n");
      out.write("         </table> \n");
      out.write("             \n");
      out.write("             <form action=\"index.jsp\" method=\"post\">      \n");
      out.write("                 <input type=\"submit\" value=\"Regresar\">   \n");
      out.write("             </form>\n");
      out.write("            \n");
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
