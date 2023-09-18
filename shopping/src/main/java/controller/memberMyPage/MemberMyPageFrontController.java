package controller.memberMyPage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.AuthInfoDTO;

public class MemberMyPageFrontController extends HttpServlet 
	implements Servlet{
	protected void doProcess(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		if(command.equals("/memberMyPage.my")) {
			MemberInfoService action = new MemberInfoService();
			action.execute(request);
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("memberMyPage/mypage.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/memberUpdate.my")) {
			MemberInfoService action = new MemberInfoService();
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
				MemberInfoService action1 = new MemberInfoService();
				action1.execute(request);
				request.setAttribute("errPw", "비밀번호가 틀렸습니다.");
				RequestDispatcher dispatcher = 
					request.getRequestDispatcher("memberMyPage/myModify.jsp");
				dispatcher.forward(request, response);
			}
		}else if(command.equals("/memberDrop.my")) {
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("memberMyPage/memberDrop.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/memberDropOk.my")) {
			MemberDropService action = new MemberDropService();
			int i = action.execute(request);
			if(i == 1) {
				response.sendRedirect("logout.login");
			}else if(i == 0){
				RequestDispatcher dispatcher =
						request.getRequestDispatcher("memberMyPage/memberDrop.jsp");
				dispatcher.forward(request, response);
			}
		}else if(command.equals("/userPwModify.my")) {
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("memberMyPage/myPwCon.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/memberPwModify.my")) {
			
			HttpSession session = request.getSession();
			AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("dto");
			String memberPw = request.getParameter("memberPw");
			String path ="";
			if(memberPw.equals(auth.getUserPw())) {
				path = "memberMyPage/myNewPw.jsp";
			}else {
				path="memberMyPage/myPwCon.jsp";
				request.setAttribute("errPw", "비밀번호가 틀렸습니다.");
			}
			RequestDispatcher dispatcher =
					request.getRequestDispatcher(path);
			dispatcher.forward(request, response);	
		}else if(command.equals("/memberPwPro.my")) {
			MemberPasswordService action = 
					new MemberPasswordService();
			int i = action.execute(request);
			if(i == 1) {
				response.setContentType("text/html; charset=utf-8");
				PrintWriter out = response.getWriter();
				out.print("<script type='text/javascript'>");
				out.print("alert('비밀번호가 변경되었습니다.');");
				out.print("location.href='memberMyPage.my';");
				out.print("</script>");
				out.close();
				System.out.println("sdnvsdngvsdvg");
			}else if(i == 0) {
				RequestDispatcher dispatcher =
						request.getRequestDispatcher("memberMyPage/myPwCon.jsp");
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
