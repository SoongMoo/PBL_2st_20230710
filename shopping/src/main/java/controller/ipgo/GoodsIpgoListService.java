package controller.ipgo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import model.GoodsIpgoDAO;
import model.GoodsIpgoDTO;

public class GoodsIpgoListService {
	public void execute(HttpServletRequest request) {
		GoodsIpgoDAO dao = new GoodsIpgoDAO();
		List<GoodsIpgoDTO> list =  dao.selectAll();
		System.out.println(list.size());
		request.setAttribute("dtos", list);
	}
}
