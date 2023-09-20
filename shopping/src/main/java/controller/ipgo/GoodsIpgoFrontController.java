package controller.ipgo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GoodsIpgoFrontController extends HttpServlet 
	implements Servlet{
	protected void doProcess(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		if(command.equals("/goodsIpgo.ipgo")) {
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("goodsIpgo/goodsIpgo.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/ipgoRegist.ipgo")) {
			GoodsIpgoService action = new GoodsIpgoService();
			action.execute(request);
			response.sendRedirect("goodsList.goods");
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
}
