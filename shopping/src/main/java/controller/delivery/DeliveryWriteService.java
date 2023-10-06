package controller.delivery;

import javax.servlet.http.HttpServletRequest;

import model.DeliveryDAO;

public class DeliveryWriteService {
	public void execute(HttpServletRequest request) {
		String purchaseNum = request.getParameter("purchaseNum");
		String deliveryNum = request.getParameter("deliveryNum");
		
		DeliveryDAO dao = new DeliveryDAO();
		dao.deliveryInsert(purchaseNum, deliveryNum);
	}
}
