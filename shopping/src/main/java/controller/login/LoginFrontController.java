package controller.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFrontController extends HttpServlet 
	implements Servlet{
	protected void doProcess(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		if(command.equals("/login.login")) {
			UserLoginService action = new UserLoginService();
			int i = action.execute(request, response);
			if(i == 1) {
				response.sendRedirect(request.getContextPath()+ "/");
			}else {
				RequestDispatcher dispatcher =
						request.getRequestDispatcher("main.jsp");
				dispatcher.forward(request, response);
			}
		}else if(command.equals("/logout.login")) {
			Cookie cookie = new Cookie("autoLogin","");
			cookie.setPath("/");
			cookie.setMaxAge(0);
			response.addCookie(cookie);
			
			HttpSession session = request.getSession();
			session.invalidate();
			response.sendRedirect(request.getContextPath()+"/");
		}else if(command.equals("/loginCk.login")) {
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/login1.login")) {
			UserLoginService action = new UserLoginService();
			action.execute(request, response);
			PrintWriter out = response.getWriter();
			response.setContentType("text/html; charset=utf-8");
			out.print("<script language='javascript'>");
			out.print("opener.document.location.reload();");
			out.print("window.self.close();");
			out.print("</script>");
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
