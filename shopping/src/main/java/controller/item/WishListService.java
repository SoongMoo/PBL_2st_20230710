package controller.item;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.AuthInfoDTO;
import model.ItemDAO;
import model.MemberDTO;
import model.MemberMyDAO;
import model.WishListDTO;

public class WishListService {
	public void execute(HttpServletRequest request) {
		HttpSession session = request.getSession();
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		
		MemberMyDAO myDao = new MemberMyDAO();
		MemberDTO memDto = myDao.memberInfo(auth.getUserId());
		
		ItemDAO dao = new ItemDAO();
		List<WishListDTO> list = dao.wishListSelect(memDto.getMemberNum()) ;
		
		request.setAttribute("dtos", list);
	}
}
