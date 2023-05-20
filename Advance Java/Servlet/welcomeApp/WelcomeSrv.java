import jakarta.servlet.*;
import java.io.*;

public class WelcomeSrv extends GenericServlet{
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter pw =res.getWriter();
       pw.println("<html>");
       pw.println("<body bgcolor = 'yellow'>");
		pw.println("<marquee><h1>Welcome to Servlet Technology.......!!</h1></marquee>");
		 pw.println("</body>");
		 pw.println("</html>");
		pw.close();
}
	}