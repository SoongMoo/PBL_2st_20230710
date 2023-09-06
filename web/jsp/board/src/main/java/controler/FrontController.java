package controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet 
							implements Servlet{
	@Override
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		if(command.equals("/boardList.naver")) {
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("boardList.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/boardWrite.naver")) {
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("boardForm.jsp");
			dispatcher.forward(request, response);
		}
	}
	@Override
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		if(command.equals("/boardPro.naver")) {
			BoardWriteService action = new BoardWriteService();
			action.execute(request);
			response.sendRedirect("boardList.naver");
		}
	}
}
