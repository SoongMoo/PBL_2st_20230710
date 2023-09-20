package model;

import java.sql.SQLException;

public class GoodsIpgoDAO extends DataBaseInfo{
	public void goodsIpgoInsert(GoodsIpgoDTO dto) {
		con = getConnection();
		sql = " insert into goodsipgo(ipgo_num, goods_num, ipgo_qty"
			+ "                      ,made_date,ipgo_price,ipgo_date,emp_num)"
			+ " values(?,?,?,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getGoodsIpgoNum());
			pstmt.setString(2, dto.getGoodsNum());
			pstmt.setInt(3, dto.getIpgoQty());
			pstmt.setDate(4, new java.sql.Date(dto.getMadeDate().getTime()));
			pstmt.setInt(5, dto.getIpgoPrice());
			pstmt.setDate(6, new java.sql.Date(dto.getIpgoDate().getTime()));
			pstmt.setString(7, dto.getEmpNum());
			int i = pstmt.executeUpdate(); 
			System.out.println(i + "개행이(가) 삽입되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}
}
