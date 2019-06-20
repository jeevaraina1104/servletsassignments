package Topic1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/getTable")
public class TableCreation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TableCreation() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<style>");
		out.println("table,td{border:1px solid ;}");
		out.println("</style>");

		out.println("<table>");
		for (int i = 1; i <= 25; i++) {
			out.println("<tr>");
			out.println("<td>  ROW" + i + ",COL1");
			out.println("<td>  ROW" + i + ",COL2");
			out.println("<td>  ROW" + i + ",COL3");
			out.println("</tr>");
		}
		out.println("</table>");
	}

}
