package controller.review;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ReviewFrontController  extends HttpServlet 
									implements Servlet{
	protected void doProcess(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		if(command.equals("/reviewRegist.review")) {
			request.setAttribute("purchaseNum", request.getParameter("purchaseNum"));
			request.setAttribute("goodsNum", request.getParameter("goodsNum"));
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("review/reviewForm.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/reviewWrite.review")) {
			ReviewWriteService action = new ReviewWriteService();
			action.execute(request);
			response.sendRedirect("purchaseList.item");
		}else if(command.equals("/goodsReviewUpdate.review")) {
			ReviewDetailService action = new ReviewDetailService();
			action.execute(request);
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("review/reviewModify.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/goodsReviewModify.review")) {
			GoodsReviewUpdateService action = new GoodsReviewUpdateService();
			action.execute(request);
			response.sendRedirect("purchaseList.item");
		}else if(command.equals("/goodsReviewDelete.review")) {
			GoodsReviewDeleteService action = new GoodsReviewDeleteService();
			action.execute(request);
			response.sendRedirect("purchaseList.item");
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(req, resp);
	}	
}
