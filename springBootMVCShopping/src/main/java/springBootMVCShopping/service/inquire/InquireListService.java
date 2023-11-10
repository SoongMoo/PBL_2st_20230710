package springBootMVCShopping.service.inquire;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.domain.InquireDTO;
import springBootMVCShopping.repository.InquireRepository;

@Service
public class InquireListService {
	@Autowired
	InquireRepository inquireRepository;
	public void execute(String goodsNum, Model model) {
		List<InquireDTO> list = inquireRepository.inquireList(goodsNum);
		model.addAttribute("list", list);
	}
}
