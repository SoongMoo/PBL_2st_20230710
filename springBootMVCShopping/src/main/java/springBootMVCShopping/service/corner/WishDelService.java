package springBootMVCShopping.service.corner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.mapper.CartWishMapper;
import springBootMVCShopping.mapper.MemberMyMapper;

@Service
public class WishDelService {
	@Autowired
	MemberMyMapper memberMyMapper;
	@Autowired
	CartWishMapper cartWishMapper;
	public void execute(String goodsNum, HttpSession session) {
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		MemberDTO dto = memberMyMapper.memberInfo(auth.getUserId());
		cartWishMapper.wishDelete(goodsNum, dto.getMemberNum());
	}
}