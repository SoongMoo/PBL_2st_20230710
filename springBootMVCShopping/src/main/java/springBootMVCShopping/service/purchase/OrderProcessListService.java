package springBootMVCShopping.service.purchase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.domain.OrderListDTO;
import springBootMVCShopping.mapper.MemberMyMapper;
import springBootMVCShopping.mapper.PurchaseMapper;

@Service
public class OrderProcessListService {
	@Autowired
	MemberMyMapper memberMyMapper;
	@Autowired
	PurchaseMapper purchaseMapper;
	public void execute(HttpSession session, Model model) {
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		MemberDTO memDto = memberMyMapper.memberInfo(auth.getUserId());
		List<OrderListDTO> list = purchaseMapper.orderList(memDto.getMemberNum(), null);
		model.addAttribute("list", list);
	}
}
