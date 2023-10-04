package controller.item;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.AuthInfoDTO;
import model.ItemDAO;
import model.MemberDTO;
import model.MemberMyDAO;

public class WishDeleteService {
	public void execute(HttpServletRequest request) {
		HttpSession session = request.getSession();
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		MemberMyDAO myDao = new MemberMyDAO();
		MemberDTO memdto = myDao.memberInfo(auth.getUserId());
		
		String goodsNum = request.getParameter("goodsNum");
		
		ItemDAO dao = new ItemDAO();
		dao.wishGoodsDelete(goodsNum, memdto.getMemberNum());
	}
}
