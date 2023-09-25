package controller.item;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.AuthInfoDTO;
import model.MemberDTO;
import model.MemberMyDAO;

public class GoodsOrderService {
	public void execute(HttpServletRequest request) {
		HttpSession session = request.getSession();
		AuthInfoDTO authInfo = (AuthInfoDTO)session.getAttribute("auth");
		
		MemberMyDAO myDao = new MemberMyDAO();
		MemberDTO memDto = myDao.memberInfo(authInfo.getUserId());
		
		String goodsNums [] = request.getParameter("goodsNums").split("-");
		Integer goodsTotalPrice = 
				Integer.parseInt(request.getParameter("goodsTotalPrice"));
		
		
		
	}
}
