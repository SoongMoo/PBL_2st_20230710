package controller.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginFrontController extends HttpServlet 
	implements Servlet{
	protected void doProcess(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		if(command.equals("/login.login")) {
			UserLoginService action =
					new UserLoginService();
			int i = action.execute(request);
			if(i == 1) {
				response.sendRedirect(request.getContextPath()+ "/");
			}else {
				RequestDispatcher dispatcher =
						request.getRequestDispatcher("main.jsp");
				dispatcher.forward(request, response);
			}
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req,resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req,resp);
	}
}
