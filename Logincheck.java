package Test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


     public class Logincheck extends HttpServlet {
      @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String str1=request.getParameter("uname");
        String str2=request.getParameter("pass");
      if(str1.equals("admin") && str2.equals("admin"))
 {  
     response.sendRedirect("Welcome.jsp");
 }
   else
 { response.sendRedirect("Error.jsp");
 }
    }

}   
        