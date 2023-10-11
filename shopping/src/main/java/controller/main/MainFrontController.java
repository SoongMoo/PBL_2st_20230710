package controller.main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controller.goods.GoodsListService;
import model.AuthInfoDTO;
import model.UserDAO;

public class MainFrontController extends HttpServlet 
								implements Servlet{
	@Override
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		if(command.equals("/main.main")) {
			GoodsListService action = new GoodsListService();
			action.execute(request);
			
			Cookie [] cookies = request.getCookies(); 
			if(cookies != null && cookies.length > 0) {
				for(Cookie cookie : cookies) {
					if(cookie.getName().equals("storeId")) {
						request.setAttribute("sid", cookie.getValue());
					}
					if(cookie.getName().equals("autoLogin")) {
						UserDAO dao = new UserDAO(); 
						AuthInfoDTO dto = dao.loginSelect(cookie.getValue());
						HttpSession session = request.getSession();
						session.setAttribute("dto", dto);
					}
				}
			}
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("main.jsp");
			dispatcher.forward(request, response);
		}
		
	}
	@Override
	protected void doPost(HttpServletRequest req, 
			HttpServletResponse resp) 
					throws ServletException, IOException {
		
	}
}
