package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author slk
 */
//WebServlet(value = "/controller.do")
public class Controller extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet Servlet</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<div>Bem Vindo!!!!!!!</div>");
//            out.println("<h1>Servlet Servlet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
            //obtem os dados do formulário (getParameter)
//            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String username = getServletConfig().getInitParameter("username");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<FORM name=\"+\"loginForm\" ACTION=\"ControllerResponse.do\" METHOD=\"POST\">");
            out.println("<INPUT TYPE=\"TEXT\" NAME=\"username\" VALUE=\"" + username  + "\"/>");
            out.println("<INPUT TYPE=\"TEXT\" NAME=\"password\" VALUE=\"" + password + "\"/>");
            out.println("<INPUT TYPE=\"SUBMIT\" >");
            out.println("</FORM>");
            out.println("</body>");
            out.println("</html>");

//           out.print("seu usuario é " + username);
        }
    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        doGet(request, response);
//    }

}
