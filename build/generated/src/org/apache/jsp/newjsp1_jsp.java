package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?> \n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \n");
      out.write("    \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"> \n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\"> \n");
      out.write("    <head> \n");
      out.write("        <meta http-equiv=\"content-type\" content=\"text/xhtml; charset=utf-8\" /> \n");
      out.write("        <title>Dynamic Select Statements</title> \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            //<![CDATA[ \n");
      out.write("            // array of possible countries in the same order as they appear in the country selection list \n");
      out.write("            var countryLists = new Array(4)\n");
      out.write("            countryLists[\"empty\"] = [\"Select a Country\"];\n");
      out.write("            countryLists[\"North America\"] = [\"Canada\", \"United States\", \"Mexico\"];\n");
      out.write("            countryLists[\"South America\"] = [\"Brazil\", \"Argentina\", \"Chile\", \"Ecuador\"];\n");
      out.write("            countryLists[\"Asia\"] = [\"Russia\", \"China\", \"Japan\"];\n");
      out.write("            countryLists[\"Europe\"] = [\"Britain\", \"France\", \"Spain\", \"Germany\"];\n");
      out.write("            /* CountryChange() is called from the onchange event of a select element. \n");
      out.write("             * param selectObj - the select object which fired the on change event. \n");
      out.write("             */\n");
      out.write("            function countryChange(selectObj) {\n");
      out.write("                // get the index of the selected option \n");
      out.write("                var idx = selectObj.selectedIndex;\n");
      out.write("                // get the value of the selected option \n");
      out.write("                var which = selectObj.options[idx].value;\n");
      out.write("                // use the selected option value to retrieve the list of items from the countryLists array \n");
      out.write("                cList = countryLists[which];\n");
      out.write("                // get the country select element via its known id \n");
      out.write("                var cSelect = document.getElementById(\"country\");\n");
      out.write("                // remove the current options from the country select \n");
      out.write("                var len = cSelect.options.length;\n");
      out.write("                while (cSelect.options.length > 0) {\n");
      out.write("                    cSelect.remove(0);\n");
      out.write("                }\n");
      out.write("                var newOption;\n");
      out.write("                // create new options \n");
      out.write("                for (var i = 0; i < cList.length; i++) {\n");
      out.write("                    newOption = document.createElement(\"option\");\n");
      out.write("                    newOption.value = cList[i];  // assumes option string and value are the same \n");
      out.write("                    newOption.text = cList[i];\n");
      out.write("                    // add the new option \n");
      out.write("                    try {\n");
      out.write("                        cSelect.add(newOption);  // this will fail in DOM browsers but is needed for IE \n");
      out.write("                    } catch (e) {\n");
      out.write("                        cSelect.appendChild(newOption);\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        //]]>\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <noscript>This page requires JavaScript be available and enabled to function properly</noscript>\n");
      out.write("        <h1>Dynamic Select Statements</h1>\n");
      out.write("        <label for=\"continent\">Select Continent</label>\n");
      out.write("        <select id=\"continent\" onchange=\"countryChange(this);\">\n");
      out.write("            <option value=\"empty\">Select a Continent</option>\n");
      out.write("            <option value=\"North America\">North America</option>\n");
      out.write("            <option value=\"South America\">South America</option>\n");
      out.write("            <option value=\"Asia\">Asia</option>\n");
      out.write("            <option value=\"Europe\">Europe</option>\n");
      out.write("        </select>\n");
      out.write("        <br/>\n");
      out.write("        <label for=\"country\">Select a country</label>\n");
      out.write("        <select id=\"country\">\n");
      out.write("            <option value=\"0\">Select a country</option>\n");
      out.write("        </select>\n");
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
}
