package Topic1;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/greetings")
public class Assignment2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Assignment2() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String userName = request.getParameter("user");
		LocalTime range00 = LocalTime.of(0, 0);
		LocalTime range12 = LocalTime.of(12, 0);
		LocalTime range16 = LocalTime.of(16, 0);
		LocalTime now = LocalTime.now();
		
		if (now.isAfter(range00) && now.isBefore(range12)) {
			out.println("Good Morning " + userName);
		} else if (now.isAfter(range12) && now.isBefore(range16)) {
			out.println("Good AfterNoon " + userName);
		} else if (now.isAfter(range16)) {
			out.println("Good evening " + userName);
		}

	}

}