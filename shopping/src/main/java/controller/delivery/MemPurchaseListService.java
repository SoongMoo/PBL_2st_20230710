package controller.delivery;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import model.BuyListDTO;
import model.MemPurchaseDAO;

public class MemPurchaseListService {
	public void execute(HttpServletRequest request) {
		MemPurchaseDAO dao = new MemPurchaseDAO();
		List<BuyListDTO> list = dao.buySelect();
		request.setAttribute("dtos", list);
	}
}
