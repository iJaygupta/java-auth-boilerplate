  package Test;
  import java.io.IOException;  
  import java.io.PrintWriter;  
  import java.sql.Connection;
  import java.sql.DriverManager;
  import java.sql.ResultSet;
  import java.sql.SQLException;
  import java.sql.Statement;
  import java.util.logging.Level;
  import java.util.logging.Logger;
  import javax.servlet.ServletException;  
  import javax.servlet.http.HttpServlet;  
  import javax.servlet.http.HttpServletRequest;  
  import javax.servlet.http.HttpServletResponse;  
  import javax.servlet.http.HttpSession;  
        public class LoginServlet extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  
                    throws ServletException, IOException {  
        try 
        {
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
            request.getRequestDispatcher("Link.html").include(request, response);
            
            String name=request.getParameter("uname");
            String password=request.getParameter("pass");
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "admin");
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select first_name,last_name from users where first_name='"+name+"'");
            String name1="";
            HttpSession session=null;
            while(rs.next())
            {
                name1=rs.getString(1)+" "+rs.getString(2);
                session=request.getSession();
                session.setAttribute("name",name);
            }
            if((session==null || session.getAttribute("name")==null))
            {
               out.print("Sorry, username or password error!");
               request.getRequestDispatcher("Login.jsp").include(request, response);
               
            }
            else { if(password.equals("1234"))
            {  out.println("Hello"+" "+name+"Welcome to profile");
                }
            }
             
              
            out.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
}  