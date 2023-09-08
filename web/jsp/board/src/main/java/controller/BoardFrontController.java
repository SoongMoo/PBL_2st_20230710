package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardFrontController extends HttpServlet implements Servlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		if (command.equals("/boardList.naver")) {
			BoradListService action = new BoradListService();
			action.execute(request);

			RequestDispatcher dispatcher = request.getRequestDispatcher("/board/boardList.jsp");
			dispatcher.forward(request, response);
		} else if (command.equals("/boardWrite.naver")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/board/boardForm.jsp");
			dispatcher.forward(request, response);
		} else if (command.equals("/boardDetail.naver")) {
			//// 추가
			BoardDetailService action = new BoardDetailService();
			action.execute(request);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/board/boardInfo.jsp");
			dispatcher.forward(request, response);
		} else if (command.equals("/boardUpdate.naver")) {
			BoardDetailService action = new BoardDetailService();
			action.execute(request);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/board/boardModifyForm.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/boardDel.naver")) {
			BoardDelService action = new BoardDelService();
		 	action.execute(request);
			response.sendRedirect("boardList.naver");
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		if (command.equals("/boardRegist.naver")) {
			BoardWriteService action = new BoardWriteService();
			action.execute(request);
			response.sendRedirect("boardList.naver");
		} else if (command.equals("/boardModify.naver")) {
			BoardModifyService action = new BoardModifyService();
			action.execute(request);
			response.sendRedirect("boardDetail.naver?num=" + request.getParameter("boardNum"));
		}

	}
}
