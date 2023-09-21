package controller.ipgo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import model.GoodsIpgoDAO;
import model.GoodsIpgoDTO;

public class GoodsIpgoUpdateService {
	public void execute(HttpServletRequest request) {
		String goodsIpgoNum = request.getParameter("goodsIpgoNum");
		String goodsNum = request.getParameter("goodsNum");
		String ipgoDate = request.getParameter("ipgoDate");
		String ipgoQty = request.getParameter("ipgoQty");
		String madeDate = request.getParameter("madeDate");
		String ipgoPrice = request.getParameter("ipgoPrice");
		
		GoodsIpgoDTO dto = new GoodsIpgoDTO();
		dto.setGoodsIpgoNum(goodsIpgoNum);
		dto.setGoodsNum(goodsNum);
		dto.setIpgoPrice(Integer.parseInt(ipgoPrice));
		dto.setIpgoQty(Integer.parseInt(ipgoQty));

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = sdf.parse(ipgoDate);
			dto.setIpgoDate(date);
			date = sdf.parse(madeDate);
			dto.setMadeDate(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		GoodsIpgoDAO dao = new GoodsIpgoDAO();
		dao.ipgoGoodsUpdate(dto);
	}
}