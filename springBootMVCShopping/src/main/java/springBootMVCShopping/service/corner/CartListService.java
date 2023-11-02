package springBootMVCShopping.service.corner;

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
public class CartListService {
	@Autowired
	MemberMyMapper memberMyMapper;
	@Autowired
	CartWishMapper cartWishMapper;
	public void execute(Model model, HttpSession session) {
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		MemberDTO memDto = memberMyMapper.memberInfo(auth.getUserId());
		List<CartGoodsDTO> list = cartWishMapper.cartList(memDto.getMemberNum());
		Integer sumPrice = cartWishMapper.sumPrice(memDto.getMemberNum());
		model.addAttribute("list", list);
		model.addAttribute("sumPrice", sumPrice);
	}
}
