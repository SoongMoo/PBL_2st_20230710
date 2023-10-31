package springBootMVCShopping.service.goodsIpgo;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.GoodsIpgoCommand;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.GoodsIpgoDTO;
import springBootMVCShopping.mapper.EmployeeMapper;
import springBootMVCShopping.mapper.GoodsIpgoMapper;

@Service
public class GoodsIpgoService {
	@Autowired
	EmployeeMapper employeeMapper;
	@Autowired
	GoodsIpgoMapper goodsIpgoMapper;
	public void execute(GoodsIpgoCommand goodsIpgoCommand, HttpSession session) {
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		String empNum = employeeMapper.getEmpNum(auth.getUserId());
		GoodsIpgoDTO dto = new GoodsIpgoDTO();
		dto.setEmpNum(empNum);
		dto.setGoodsNum(goodsIpgoCommand.getGoodsNum());
		dto.setIpgoDate(goodsIpgoCommand.getIpgoDate());
		dto.setIpgoNum(goodsIpgoCommand.getGoodsIpgoNum());
		dto.setIpgoPrice(goodsIpgoCommand.getIpgoPrice());
		dto.setIpgoQty(goodsIpgoCommand.getIpgoQty());
		dto.setMadeDate(Timestamp.valueOf(goodsIpgoCommand.getMadeDate()));
		goodsIpgoMapper.goodsIpgoInsert(dto);
	}
}







