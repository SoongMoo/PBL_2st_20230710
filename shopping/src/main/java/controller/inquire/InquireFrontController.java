package controller.inquire;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.goods.GoodsDetailService;
import model.InquireDAO;

public class InquireFrontController extends HttpServlet 
implements Servlet{
	protected void doProcess(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		if(command.equals("/inquireList.inq")) {
			InquireListService action = new InquireListService();
			action.execute(request);
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("inquire/inquireList.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/inquireWrite.inq")) {
			GoodsDetailService action = new GoodsDetailService();
			action.execute(request);
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("inquire/inquireWrite.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/inquireWritePro.inq")) {
			InquireWriteProService action = new InquireWriteProService();
			action.execute(request);
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			String str= " <script language='javascript'>"
					  + "  opener.parent.inquire();"
					  + "  window.self.close(); "
					  + " </script>";
			out.print(str);
			out.close();
		}else if(command.equals("/inquireDelete.inq")) {
			String inquireNum = request.getParameter("inquireNum");
			InquireDAO dao = new InquireDAO();
			dao.inquireDelete(inquireNum);
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
