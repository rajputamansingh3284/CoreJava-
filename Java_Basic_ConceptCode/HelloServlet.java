import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
                      throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        System.out.println("<html><body>");
        System.out.println("<h2>Hello, Welcome to Java Servlet!</h2>");
        System.out.println("</body></html>");
    }
}