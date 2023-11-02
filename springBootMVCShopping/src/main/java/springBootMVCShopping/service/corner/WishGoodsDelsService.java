package springBootMVCShopping.service.corner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.mapper.CartWishMapper;
import springBootMVCShopping.mapper.MemberMyMapper;

@Service
public class WishGoodsDelsService {
	@Autowired
	CartWishMapper cartWishMapper;
	@Autowired
	MemberMyMapper memberMyMapper;
	public void execute(String wishGoodsDels[], HttpSession session) {
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		MemberDTO dto = memberMyMapper.memberInfo(auth.getUserId());
		cartWishMapper.wishGoodsDeletes(wishGoodsDels, dto.getMemberNum());
	}
}


