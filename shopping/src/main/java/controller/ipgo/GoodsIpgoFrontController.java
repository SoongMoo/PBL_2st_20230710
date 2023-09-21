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
		}else if(command.equals("/goodsIpgoList.ipgo")) {
			GoodsIpgoListService action = 
					new GoodsIpgoListService();
			action.execute(request);
			System.out.println("xbvdxzbvzdxbad");
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("goodsIpgo/goodsIpgoList.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/goodsIpgoDetail.ipgo")) {
			GoodsIpgoDetailService action = new GoodsIpgoDetailService();
			action.execute(request);
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("goodsIpgo/goodsIpgoDetail.jsp");
			dispatcher.forward(request, response);			
		}else if(command.equals("/goodsIpgoUpdate.ipgo")) {
			GoodsIpgoDetailService action = new GoodsIpgoDetailService();
			action.execute(request);
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("goodsIpgo/goodsIpgoUpdate.jsp");
			dispatcher.forward(request, response);			
		}else if(command.equals("/goodsIpgoModify.ipgo")) {
			GoodsIpgoUpdateService action =
					new GoodsIpgoUpdateService();
			action.execute(request);
			response.sendRedirect("goodsIpgoDetail.ipgo?ipgoNum="
								  + request.getParameter("goodsIpgoNum") 
								  +"&num="
								  + request.getParameter("goodsNum"));
		}else if(command.equals("/goodsIpgoDelete.ipgo")) {
			GoodsIpgoDeleteService action =
					new GoodsIpgoDeleteService();
			action.execute(request);
			response.sendRedirect("goodsIpgoList.ipgo");
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
