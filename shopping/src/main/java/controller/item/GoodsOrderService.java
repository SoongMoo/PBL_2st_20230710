package controller.item;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.AuthInfoDTO;
import model.ItemDAO;
import model.MemberDTO;
import model.MemberMyDAO;
import model.PurchaseDTO;
import model.PurchaseListDTO;

public class GoodsOrderService {
	public PurchaseDTO execute(HttpServletRequest request) {	
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		HttpSession session = request.getSession();
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		MemberMyDAO myDao = new MemberMyDAO();
		MemberDTO memberDTO = myDao.memberInfo(auth.getUserId());
		
		String deliveryName = request.getParameter("deliveryName");
		String deliveryAddr = request.getParameter("deliveryAddr");
		String deliveryAddrDetail = request.getParameter("deliveryAddrDetail");
		String deliveryPost = request.getParameter("deliveryPost");
		String deliveryPhone = request.getParameter("deliveryPhone");
		Long purchasePrice = Long.parseLong(request.getParameter("goodsTotalPrice"));
		String message = request.getParameter("message");
		String memberNum  = memberDTO.getMemberNum();
		
		PurchaseDTO dto = new PurchaseDTO();
		dto.setDeliveryAddr(deliveryAddr);
		dto.setDeliveryAddrDetail(deliveryAddrDetail);
		dto.setDeliveryName(deliveryName);
		dto.setDeliveryPhone(deliveryPhone);
		dto.setDeliveryPost(deliveryPost);
		dto.setMemberNum(memberNum);
		dto.setMessage(message);
		dto.setPurchasePrice(purchasePrice);	
		
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		// new Date()하면 현재날짜 가져옴.
		String purchaseNum = df.format(new Date());
		dto.setPurchaseNum(purchaseNum);
		
		ItemDAO dao = new ItemDAO();
		dao.purchaseInsert(dto);
		
		String nums = request.getParameter("goodsNums");
		String goodsNums [] = nums.split("-");
		for (String goodsNum : goodsNums) {
			PurchaseListDTO dto1 = new PurchaseListDTO();
			dto1.setGoodsNum(goodsNum);
			dto1.setPurchaseNum(purchaseNum);
			int i = dao.purchaseListInsert(dto1, memberNum);
			if(i >= 0) dao.cartItemDelete(goodsNum, memberNum);
		}
		return dto;
	}
}
