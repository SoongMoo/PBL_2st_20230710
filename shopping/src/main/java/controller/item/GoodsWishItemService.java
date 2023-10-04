package controller.item;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.AuthInfoDTO;
import model.ItemDAO;
import model.MemberDTO;
import model.MemberMyDAO;

public class GoodsWishItemService {
	public void execute(HttpServletRequest request) {
		String goodsNum = request.getParameter("goodsNum");
		
		HttpSession session = request.getSession();
		AuthInfoDTO dto = (AuthInfoDTO)session.getAttribute("auth");
		
		MemberMyDAO myDao = new MemberMyDAO();
		MemberDTO memDto = myDao.memberInfo(dto.getUserId());
		
		ItemDAO dao = new ItemDAO();
		int i = dao.goodsSelect(goodsNum, memDto.getMemberNum());
		if(i == 1) {
			dao.wishGoodsDelete(goodsNum, memDto.getMemberNum());
		}else {
			dao.wishGoodsInsert(goodsNum, memDto.getMemberNum());
		}
		request.setAttribute("isTrue", i);
	}
}
