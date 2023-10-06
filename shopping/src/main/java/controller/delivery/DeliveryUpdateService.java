package controller.delivery;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import model.DeliveryDAO;
import model.DeliveryDTO;

public class DeliveryUpdateService {
	public void execute(HttpServletRequest request) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String deliveryNum = request.getParameter("deliveryNum");
		String purchaseNum = request.getParameter("purchaseNum");
		String deliveryState = request.getParameter("deliveryState");
		
		DeliveryDTO dto = new DeliveryDTO();
		dto.setDeliveryNum(deliveryNum);
		dto.setPurchaseNum(purchaseNum);
		dto.setDeliveryState(deliveryState);
		
		DeliveryDAO  dao = new DeliveryDAO();
		dao.deliveryUpdate(dto);
	}
}
