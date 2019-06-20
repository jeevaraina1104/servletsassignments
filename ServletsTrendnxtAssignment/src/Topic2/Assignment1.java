package Topic2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import sun.text.normalizer.ICUBinary.Authenticate;

/**
 * Servlet implementation class Assignment1
 */
@WebServlet("/login")
public class Assignment1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		String pwd = request.getParameter("password");
		AuthenticateUser authenticator = new AuthenticateUser();
		boolean isValidUser = authenticator.authenticate(user, pwd);
		if(isValidUser){
			RequestDispatcher dispatcher = request.getRequestDispatcher("LoginSuccess.jsp");
			dispatcher.forward(request, response);
		}else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("LoginFailure.jsp");
			dispatcher.forward(request, response);
		}
	
	}

}

