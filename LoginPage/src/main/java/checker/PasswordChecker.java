package checker;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class PasswordChecker extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // simple check
        if (username != null && password != null && username.equals(password)) {
            request.getRequestDispatcher("homepage.html").forward(request, response);
        } else {
        	response.getWriter().println(
        		    "<html>" +
        		    "<head><title>Invalid Login</title></head>" +
        		    "<body>" +
        		    "<script>alert('Invalid Password'); window.location='index.html';</script>" +
        		    "</body></html>"
        		);

        	 request.getRequestDispatcher("index.html").include(request, response);
        }
    }
}
