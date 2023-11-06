package springBootMVCShopping.service.purchase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.PurchaseCommand;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.CartDTO;
import springBootMVCShopping.domain.GoodsDTO;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.domain.PurchaseDTO;
import springBootMVCShopping.domain.PurchaseListDTO;
import springBootMVCShopping.mapper.CartGoodsMapper;
import springBootMVCShopping.mapper.CartWishMapper;
import springBootMVCShopping.mapper.MemberMyMapper;
import springBootMVCShopping.mapper.PurchaseMapper;

@Service
public class GoodsOrderService {
	@Autowired
	MemberMyMapper memberMyMapper;
	@Autowired
	PurchaseMapper purchaseMapper;
	@Autowired
	CartGoodsMapper cartGoodsMapper;
	@Autowired 
	CartWishMapper cartWishMapper;
	public PurchaseDTO execute(PurchaseCommand purchaseCommand, HttpSession session, Model model) {
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		MemberDTO memDto = memberMyMapper.memberInfo(auth.getUserId());
		String purchaseNum = purchaseMapper.selectNum();
		//System.out.println(purchaseNum);
		
		String [] goodsNums = purchaseCommand.getGoodsNums().split("-");
		List<GoodsDTO> list = cartWishMapper.goodsSelectAll(goodsNums[0]);
		String purchaseName = list.get(0).getGoodsName() + "외_" + String.valueOf(goodsNums.length - 1);
		
		PurchaseDTO dto = new PurchaseDTO();
		dto.setPurchaseName(purchaseName);
		dto.setPurchaseNum(purchaseNum);
		dto.setDeliveryAddr(purchaseCommand.getDeliveryAddr());
		dto.setDeliveryAddrDetail(purchaseCommand.getDeliveryAddrDetail());
		dto.setDeliveryName(purchaseCommand.getDeliverName());
		dto.setDeliveryPhone(purchaseCommand.getDeliveryPhone());
		dto.setDeliveryPost(purchaseCommand.getDeliveryPost());
		dto.setMemberNum(memDto.getMemberNum());
		dto.setMessage(purchaseCommand.getMessage());
		dto.setPurchasePrice(purchaseCommand.getSumPrice());
		dto.setPurchaseStatus("입급대기중");
		dto.setUserEmail(memDto.getMemberEmail());
		purchaseMapper.purchaseInsert(dto);
		
		PurchaseListDTO plDto = new PurchaseListDTO();
		plDto.setGoodsNums(goodsNums);
		plDto.setPurchaseNum(purchaseNum);	
		plDto.setMemberNum(memDto.getMemberNum()); // cart의 정보를 가져오기 위해서
		purchaseMapper.purchaseListInsert(plDto);
		
		CartDTO cartDto = new CartDTO();
		cartDto.setMemberNum(memDto.getMemberNum());
		cartDto.setGoodsNums(goodsNums);
		cartGoodsMapper.cartGoodsDeletes(cartDto);
		
		
		return dto;
	}
}
