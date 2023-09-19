package controller.members;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.employees.EmployeeAutoNumService;

public class MemberFrontController extends HttpServlet 
		implements Servlet{
	public void doProcess(HttpServletRequest request,
			HttpServletResponse response) 
					throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		if(command.equals("/memberList.mem")) {
			// 전체보기
			MemberListService action =
					new MemberListService();
			action.execute(request);
			RequestDispatcher dispatcher = 
				request.getRequestDispatcher("member/memberList.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/memberWrite.mem")) {
			MemberAutoNumService action = 
					new MemberAutoNumService();
			action.execute(request);	
			/// insert 
			RequestDispatcher dispatcher =
				request.getRequestDispatcher("member/memberForm.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/memberRegist.mem")) {
			/// insert 
			MemberWriteService action = new MemberWriteService();
			action.execute(request);
			response.sendRedirect("memberList.mem");
		}else if(command.equals("/memberDetail.mem")) {
			//상세보기
			MemberDetailService action = new MemberDetailService();
			action.execute(request);
			RequestDispatcher dispatcher = 
				request.getRequestDispatcher("member/memberInfo.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/memberUpdate.mem")) {
			// update
			MemberDetailService action = new MemberDetailService();
			action.execute(request);
			RequestDispatcher dispatcher =
				request.getRequestDispatcher("member/memberModify.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/memberModify.mem")) {
			// update
			MemberUpdateService action =
					new MemberUpdateService();
			action.execute(request);
			response.sendRedirect("memberDetail.mem?memberNum="
					+ request.getParameter("memberNum"));
		}else if(command.equals("/memberdelete.mem")) {
			// 삭제
			MemberDeleteService action = 
					new MemberDeleteService();
			action.execute(request);
			response.sendRedirect("memberList.mem");
		}
	}
	@Override
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}
	@Override
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}
}
