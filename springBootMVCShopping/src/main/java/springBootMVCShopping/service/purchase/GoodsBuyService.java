package springBootMVCShopping.service.purchase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.CartGoodsDTO;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.mapper.CartWishMapper;
import springBootMVCShopping.mapper.MemberMyMapper;

@Service
public class GoodsBuyService {
	@Autowired
	MemberMyMapper memberMyMapper;
	@Autowired
	CartWishMapper cartWishMapper;
	public void execute(String [] prodCk,HttpSession session, Model model) {
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");	
		MemberDTO memDto = memberMyMapper.memberInfo(auth.getUserId());
		List<CartGoodsDTO> list = cartWishMapper.cartList(memDto.getMemberNum(),prodCk);
		Integer sumPrice = 0;
		Integer sumTotalPrice = 0;
		Integer sumDeliveryCost = 0;
		String goodsNums = "";
		for(CartGoodsDTO dto : list) {
			sumPrice += dto.getGoodsDTO().getGoodsPrice() * dto.getCartDTO().getCartQty();
			sumTotalPrice += dto.getTotalPrice();
			sumDeliveryCost += dto.getGoodsDTO().getDeliveryCost();
			goodsNums += dto.getGoodsDTO().getGoodsNum() + "-";
		}
		model.addAttribute("list", list);
		model.addAttribute("sumPrice", sumPrice);
		model.addAttribute("sumTotalPrice", sumTotalPrice);
		model.addAttribute("sumDeliveryCost", sumDeliveryCost);
		model.addAttribute("goodsNums", goodsNums);
	}
}