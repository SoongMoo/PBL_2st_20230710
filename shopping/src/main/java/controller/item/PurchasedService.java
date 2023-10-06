package controller.item;

import javax.servlet.http.HttpServletRequest;

import model.ItemDAO;

public class PurchasedService {
	public void execute(HttpServletRequest request) {
		String purchaseNum = request.getParameter("purchaseNum");
		ItemDAO dao = new ItemDAO();
		dao.deliveryStatusUpdate(purchaseNum);		
	}
}
