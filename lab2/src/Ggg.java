import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 
public class Ggg extends HttpServlet implements Servlet { 
 protected void doGet(HttpServletRequest rq, HttpServletResponse rs) 
 throws ServletException, IOException { 
 String parm = rq.getParameter("page"); // 1 
 System.out.println("Ggg:doGet:page=" + parm); // 2 
 rs.setContentType("text/html"); // 3 
 PrintWriter pw = rs.getWriter(); // 4 
 pw.println("<html> " // 5 
 +"<body> " // 6 
 +"Hello from Servlet" // 7 
 +"<br>Ggg:doGet:page=" + parm // 8 
 +"</body>" // 9 
 +"</html>"); // 10 
 pw.close(); // 11 
 } 
} 
