package controller.item;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.AuthInfoDTO;
import model.ItemDAO;
import model.MemberDTO;
import model.MemberMyDAO;

public class CartQtyDownService {
	public void execute(HttpServletRequest request) {
		HttpSession session = request.getSession();
		AuthInfoDTO authInfo = (AuthInfoDTO)session.getAttribute("auth");
		MemberMyDAO memDao = new MemberMyDAO();
		MemberDTO memDTO = memDao.memberInfo(authInfo.getUserId());
		String goodsNum = request.getParameter("goodsNum");
		ItemDAO dao = new ItemDAO();
		dao.itemQtyDown(goodsNum, memDTO.getMemberNum());
	}
}
