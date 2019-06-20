package Topic2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import sun.text.normalizer.ICUBinary.Authenticate;


@WebServlet("/loginPage")
public class Assignment2 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String user = request.getParameter("user");
		String pwd = request.getParameter("password");
		AuthenticateUser authenticator = new AuthenticateUser();
		boolean isValidUser = authenticator.authenticate(user, pwd);
		if (isValidUser) {
			User userDetails = authenticator.fetchUserDetails(user);
			String successPage = "A".equalsIgnoreCase(userDetails.getUserType()) ? "AdminLoginSuccess.jsp"
					: "EmployeeLoginSuccess.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(successPage);
			dispatcher.forward(request, response);
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("LoginFailure.jsp");
			dispatcher.forward(request, response);
		}

	}

}
