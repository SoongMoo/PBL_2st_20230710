package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemPurchaseDAO extends DataBaseInfo{
	public List<BuyListDTO> buySelect() {
		List<BuyListDTO> list = new ArrayList<BuyListDTO>();
		con = getConnection();
		sql = " select p.purchase_Num, purchase_price , MEMBER_NUM"
			+ "       ,CONFIRMNUMBER "
			+ "       , DELIVERY_NUM "
			+ " from purchase p left outer join  payment pm "
			+ " on p.purchase_Num = pm.purchase_Num "
			+ "					left outer join DELIVERY d"
			+ " on p.purchase_Num = d.purchase_Num ";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {	
				BuyListDTO dto = new BuyListDTO();
				dto.setConfirmNum(rs.getLong("CONFIRMNUMBER"));
				dto.setDeliveryNum(rs.getLong("DELIVERY_NUM"));
				dto.setPurchaseNum(rs.getLong("purchase_Num"));
				dto.setPurchasePrice(rs.getLong("purchase_price"));
				dto.setMemberNum(rs.getString("MEMBER_NUM"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
