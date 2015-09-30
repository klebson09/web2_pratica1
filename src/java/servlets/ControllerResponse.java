/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author slk
 */
public class ControllerResponse extends HttpServlet {

   
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet ControllerResponse</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet ControllerResponse at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }

//   
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        
//    }

    @Override
    
    // obs. se modificar esse método para doPost apresente o seguinte erro
//     HTTP method GET is not supported by this URL
//     The specified HTTP method is not allowed for the requested resource.
//      não sei por que
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        Controller c = new Controller();
//        c.doGet(request, response);
          //processRequest(request, response);
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        
        request.getParameter(username);
        request.getParameter(password);
        
        if(session.isNew()){
            out.println("Iniciada uma nova sessão! <br>");
        }else{
            out.println("Bem vido a sua sessão!");
        }
        
      
        
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("Seu usuario é: "+ username+"<br/> Sua senha é:" +  password+"");
            out.println("</body>");
            out.println("</html>");
        
        
    }
  

}
