package springBootMVCShopping.service.corner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.CartDTO;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.mapper.CartWishMapper;
import springBootMVCShopping.mapper.MemberMyMapper;

@Service
public class CartInsertService {
	@Autowired
	MemberMyMapper memberMyMapper;
	@Autowired
	CartWishMapper cartWishMapper;
	public String execute(String goodsNum, Integer qty, HttpSession session) {
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		if(auth.getGrade().equals("mem")) {
			MemberDTO  memDto = memberMyMapper.memberInfo(auth.getUserId());
			CartDTO dto = new CartDTO();
			dto.setCartQty(qty);
			dto.setGoodsNum(goodsNum);
			dto.setMemberNum(memDto.getMemberNum());
			cartWishMapper.cartInsert(dto);
			return "200";
		}else {
			return "999";
		}
	}
}
