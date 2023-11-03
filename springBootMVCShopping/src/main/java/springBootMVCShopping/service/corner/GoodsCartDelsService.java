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
public class GoodsCartDelsService {
	@Autowired
	MemberMyMapper memberMyMapper;
	@Autowired
	CartWishMapper cartWishMapper;
	public String execute(String[] goodsNums ,  HttpSession session) {
		AuthInfoDTO auth  = (AuthInfoDTO)session.getAttribute("auth");
		MemberDTO memDto = memberMyMapper.memberInfo(auth.getUserId());
		CartDTO  dto = new CartDTO();
		dto.setMemberNum(memDto.getMemberNum());
		dto.setGoodsNums(goodsNums);
		int i = cartWishMapper.goodsNumsDelete(dto);
		if(i >= 1) return "200";
		else return "900";
	}
}
