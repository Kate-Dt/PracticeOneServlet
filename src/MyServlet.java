import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (request.getParameter("login").equals("admin")){
            if (request.getParameter("password").equals("admin")){
                out.print("Welcome!");
            } else {
                throw new ServletException("Wrong password");
            }
        } else {
            throw new ServletException("Wrong login");
        }
        out.close();
    }
}