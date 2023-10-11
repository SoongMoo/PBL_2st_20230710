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
		}else if(command.equals("/inquireUpdate.inq")) {
			InquireDetailService action = new InquireDetailService();
			action.execute(request);
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("inquire/inquireUpdate.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/inquireModify.inq")) {
			InquireUpdateService action = new InquireUpdateService();
			action.execute(request);
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			String str=  "<script language='javascript'>" 
					  +  " opener.parent.inquire();"
			          +  " window.self.close();"
			          +  "</script>";
			 out.print(str);
			 out.close();
		}else if(command.equals("/inquire.inq")) {
			InquireListEmpService action = new InquireListEmpService();
			action.execute(request);
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("inquire/inquireListEmp.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/inquireAnswer.inq")) {
			InquireDetailService action = new InquireDetailService();
			action.execute(request);
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("inquire/inquireAnswer.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/inquireRepleUpdate.inq")) {
			InquireAnswerService action = new InquireAnswerService();
			action.execute(request);
			response.sendRedirect("inquire.inq");
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
