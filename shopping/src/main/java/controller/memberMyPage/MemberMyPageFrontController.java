package controller.memberMyPage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberMyPageFrontController extends HttpServlet 
	implements Servlet{
	protected void doProcess(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		if(command.equals("/memberMyPage.my")) {
			MemDetailService action = new MemDetailService();
			action.execute(request);
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("memberMyPage/mypage.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/memberUpdate.my")) {
			MemDetailService action = new MemDetailService();
			action.execute(request);
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("memberMyPage/myModify.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/memberModify.my")) {
			MemberInfoUpdateService action =
					new MemberInfoUpdateService();
			int i = action.execute(request);
			if(i == 1)
				response.sendRedirect("memberMyPage.my");
			else if(i == 0) {
				MemDetailService action1 = new MemDetailService();
				action1.execute(request);
				request.setAttribute("errPw", "비밀번호가 틀렸습니다.");
				RequestDispatcher dispatcher = 
					request.getRequestDispatcher("memberMyPage/myModify.jsp");
				dispatcher.forward(request, response);
			}
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, 
			HttpServletResponse resp) 
					throws ServletException, IOException {
		doProcess(req,resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) 
					throws ServletException, IOException {
		doProcess(req,resp);
	}
}
