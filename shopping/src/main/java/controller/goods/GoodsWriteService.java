package controller.goods;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.AuthInfoDTO;
import model.EmployeeDAO;
import model.GoodsDAO;
import model.GoodsDTO;

public class GoodsWriteService {
	public void execute(HttpServletRequest request) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	
		String goodsNum = request.getParameter("goodsNum");
		String goodsName = request.getParameter("goodsName");
		String goodsPrice = request.getParameter("goodsPrice");
		String goodscontent = request.getParameter("goodsContent");
		String deliveryCost = request.getParameter("deliveryCost");
		
		GoodsDTO dto = new GoodsDTO();
		dto.setGoodsContent(goodscontent);
		dto.setGoodsName(goodsName);
		dto.setGoodsNum(goodsNum);
		dto.setGoodsPrice(Integer.parseInt(goodsPrice));
		dto.setDeliveryCost(Integer.parseInt(deliveryCost));
		
		HttpSession session = request.getSession();
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("dto");
		String empId = auth.getUserId();
		EmployeeDAO empDao = new EmployeeDAO();
		String empNum = empDao.getEmpNum(empId);
		dto.setEmployeeNum(empNum);
		
		GoodsDAO dao = new GoodsDAO();
		dao.goodsInsert(dto);
	}
}
