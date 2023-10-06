package controller.delivery;

import javax.servlet.http.HttpServletRequest;

import model.DeliveryDAO;
import model.DeliveryDTO;

public class DeliveryModifyService {
	public void execute(HttpServletRequest request) {
		String purchaseNum = request.getParameter("purchaseNum");
		DeliveryDAO dao = new DeliveryDAO();
		DeliveryDTO dto = dao.deliverySelect(purchaseNum);
		request.setAttribute("dto", dto);
	}
}