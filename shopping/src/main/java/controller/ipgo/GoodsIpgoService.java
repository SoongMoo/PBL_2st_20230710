package controller.ipgo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.AuthInfoDTO;
import model.EmployeeDAO;
import model.GoodsIpgoDAO;
import model.GoodsIpgoDTO;

public class GoodsIpgoService {
	public void execute(HttpServletRequest request) {
		String goodsIpgoNum = request.getParameter("goodsIpgoNum");
		String goodsNum = request.getParameter("goodsNum");
		String ipgoDate = request.getParameter("ipgoDate");
		String ipgoQty = request.getParameter("ipgoQty");
		String ipgoPrice = request.getParameter("ipgoPrice");
		String madeDate = request.getParameter("madeDate");
		
		HttpSession session = request.getSession();
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("dto");
		EmployeeDAO dao = new EmployeeDAO();
		String empNum = dao.getEmpNum(auth.getUserId());
		
		GoodsIpgoDTO dto = new GoodsIpgoDTO();
		dto.setEmpNum(empNum);
		dto.setGoodsIpgoNum(goodsIpgoNum);
		dto.setGoodsNum(goodsNum);
		dto.setIpgoPrice(Integer.parseInt(ipgoPrice));
		dto.setIpgoQty(Integer.parseInt(ipgoQty));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = sdf.parse(madeDate);
			dto.setMadeDate(date);
			date = sdf.parse(ipgoDate);
			dto.setIpgoDate(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		GoodsIpgoDAO dao1 = new GoodsIpgoDAO();
		dao1.goodsIpgoInsert(dto);		
	}
}
