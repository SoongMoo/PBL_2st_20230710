package controller.item;

import javax.servlet.http.HttpServletRequest;

import model.ItemDAO;

public class PurchaseDeleteService {
	public void execute(HttpServletRequest request) {
		String purchaseNum = request.getParameter("purchaseNum");
		ItemDAO dao = new ItemDAO();
		dao.purchaseDelete(purchaseNum);
	}
}