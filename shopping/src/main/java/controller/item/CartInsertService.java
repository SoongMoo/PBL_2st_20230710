package controller.item;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.AuthInfoDTO;
import model.CartDTO;
import model.ItemDAO;
import model.MemberDTO;
import model.MemberMyDAO;

public class CartInsertService {
	public void execute(HttpServletRequest request) {
		 String goodsNum = request.getParameter("goodsNum");
		 String qty = request.getParameter("cartQty");
		 
		 HttpSession session = request.getSession();
		 AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		 
		 MemberMyDAO myDao = new MemberMyDAO();
		 MemberDTO memDto = myDao.memberInfo(auth.getUserId());

		 CartDTO dto = new CartDTO();
		 dto.setCartQty(Integer.parseInt(qty));
		 dto.setGoodsNum(goodsNum);
		 dto.setMemberNum(memDto.getMemberNum());
		 System.out.println(dto.getMemberNum());
		 ItemDAO dao = new ItemDAO();
		 dao.cartInsert(dto);
	}
}
