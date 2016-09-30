package aa.bb.c;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class Controllerservlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = request.getParameter("command");
		String viewName = "";
		commandInter commandInter = null;
		
		try {
			if(command.equals("message")){
				commandInter = new MessagePro();//싱글톤생략
			}else if(command.equals("date")){
				commandInter = new DatePro();//싱글톤생략
			}else{
				response.sendRedirect("err.html");
			}
			
			viewName = "/view/" + commandInter.showData(request, response) + ".jsp";
			request.getRequestDispatcher(viewName).forward(request, response);
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
