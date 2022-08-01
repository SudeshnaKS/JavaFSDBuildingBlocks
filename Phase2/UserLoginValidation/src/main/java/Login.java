
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if(username.equals("arianna@xoxo.com") && password.equals("123123")) {
			RequestDispatcher rd = request.getRequestDispatcher("Dashboard");
			rd.forward(request, response);
		}
		else if(username.equals("") || password.equals(""))
			{
			out.println("<h2>Error! Username or password blank.</h2>");
			out.println("<h4>TryAgain!<br/><br/></br></h4>");
			RequestDispatcher rd = request.getRequestDispatcher("/Login.html");
			rd.include(request, response);

			}
		else {
			out.println("<h2>Error!</h2>");
			out.println("<h4>Invalid username or password.Try Again.<br/><br/></br></h4>");
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
		out.close();
	}

}