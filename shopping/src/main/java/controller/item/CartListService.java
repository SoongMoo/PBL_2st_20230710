package controller.item;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.AuthInfoDTO;
import model.CartListDTO;
import model.ItemDAO;
import model.MemberDTO;
import model.MemberMyDAO;

public class CartListService {
	public void execute(HttpServletRequest request) {
		HttpSession session = request.getSession();
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		MemberMyDAO memDao = new MemberMyDAO();
		MemberDTO mem = memDao.memberInfo(auth.getUserId());

		ItemDAO itemDao = new ItemDAO();
		List<CartListDTO> list = itemDao.cartList(mem.getMemberNum());
		Integer totPri = 0;
		Integer totQtyt = 0;
		for (CartListDTO dto : list)  {
			totPri += dto.getTotalPrice();
			totQtyt += dto.getCartQty();
		}
		request.setAttribute("dtos", list);
		request.setAttribute("totPri", totPri);
		request.setAttribute("totQtyt", totQtyt);
	}
}
