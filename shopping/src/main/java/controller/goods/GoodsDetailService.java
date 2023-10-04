package controller.goods;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.AuthInfoDTO;
import model.GoodsDAO;
import model.GoodsDTO;
import model.ItemDAO;
import model.MemberDTO;
import model.MemberMyDAO;

public class GoodsDetailService {
	public void execute(HttpServletRequest request) {
		String goodsNum = request.getParameter("num");
		GoodsDAO dao = new GoodsDAO();
		GoodsDTO dto = dao.selectOne(goodsNum);
		request.setAttribute("dto", dto);
		request.setAttribute("newLine", "\n");
		
		HttpSession session = request.getSession();
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		int i = 0;
		if (auth != null) {
			MemberMyDAO memDao = new MemberMyDAO();
			MemberDTO memDTO = memDao.memberInfo(auth.getUserId());
		
			ItemDAO itemDao = new ItemDAO();
			i = itemDao.goodsSelect(goodsNum, memDTO.getMemberNum());
		}
		request.setAttribute("isTrue", i);	
	}
}