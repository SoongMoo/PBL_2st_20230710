package springBootMVCShopping.service.corner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.GoodsDTO;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.mapper.CartWishMapper;
import springBootMVCShopping.mapper.MemberMyMapper;
@Service
public class GoodsWishListService {
	@Autowired
	MemberMyMapper memberMyMapper;
	@Autowired
	CartWishMapper cartWishMapper;
	public void execute(HttpSession session, Model model) {
		AuthInfoDTO authInfo = (AuthInfoDTO)session.getAttribute("auth");
		// 내 정보를 가져오기 위한 코드
		MemberDTO memDto = memberMyMapper.memberInfo(authInfo.getUserId());
		List<GoodsDTO> list = cartWishMapper.wishGoodsList(memDto.getMemberNum());
		model.addAttribute("dtos", list);
	}
}
