package controller.item;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.AuthInfoDTO;
import model.ItemDAO;
import model.MemberDTO;
import model.MemberMyDAO;

public class CartItemsDeleteService {
	public void execute(HttpServletRequest request) {
		String goodsNums[] = request.getParameter("goodsNums").split("-");
		HttpSession session = request.getSession();
		AuthInfoDTO authInfo = (AuthInfoDTO)session.getAttribute("auth");
		
		MemberMyDAO myDao = new MemberMyDAO();
		MemberDTO memDto = myDao.memberInfo(authInfo.getUserId());
		ItemDAO dao = new ItemDAO();
		for(String goodsNum : goodsNums) {
			dao.itemDelete(memDto.getMemberNum(), goodsNum);
		}
	}
}