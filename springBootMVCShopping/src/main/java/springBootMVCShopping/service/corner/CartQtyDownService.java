package springBootMVCShopping.service.corner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.CartGoodsDTO;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.mapper.CartGoodsMapper;
import springBootMVCShopping.mapper.CartWishMapper;
import springBootMVCShopping.mapper.MemberMyMapper;

@Service
public class CartQtyDownService {
	@Autowired
	MemberMyMapper memberMyMapper;
	@Autowired
	CartWishMapper cartWishMapper;
	@Autowired
	CartGoodsMapper cartGoodsMapper;
	public CartGoodsDTO execute(String goodsNum, HttpSession session) {
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		MemberDTO memdto =  memberMyMapper.memberInfo(auth.getUserId());
		cartWishMapper.cartQtyDown(goodsNum, memdto.getMemberNum());
		CartGoodsDTO dto =  cartGoodsMapper.goodsPriceMulCartQty(goodsNum, memdto.getMemberNum());
		return dto;
	}
}
