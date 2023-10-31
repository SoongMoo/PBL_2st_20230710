package springBootMVCShopping.service.goodsIpgo;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootMVCShopping.command.GoodsIpgoCommand;
import springBootMVCShopping.domain.GoodsIpgoDTO;
import springBootMVCShopping.mapper.GoodsIpgoMapper;

@Service
public class GoodsIpgoUpdateService {
	@Autowired
	GoodsIpgoMapper goodsIpgoMapper;
	public void execute(GoodsIpgoCommand goodsIpgoCommand) {
		GoodsIpgoDTO dto = new GoodsIpgoDTO();
		dto.setGoodsNum(goodsIpgoCommand.getGoodsNum());
		dto.setIpgoDate(goodsIpgoCommand.getIpgoDate());
		dto.setIpgoNum(goodsIpgoCommand.getGoodsIpgoNum());
		dto.setIpgoPrice(goodsIpgoCommand.getIpgoPrice());
		dto.setIpgoQty(goodsIpgoCommand.getIpgoQty());
		dto.setMadeDate(Timestamp.valueOf(goodsIpgoCommand.getMadeDate()));
		goodsIpgoMapper.goodsIpgoUpdate(dto);
	}
}
