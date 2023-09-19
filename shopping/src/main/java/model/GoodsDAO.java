package model;

import java.sql.SQLException;

public class GoodsDAO extends DataBaseInfo{
	public String goodsAutoNum() {
		String goodsNum = "";
		con = getConnection();
		sql = " select "
			+ " concat('gd' , coalesce(max(substr(goods_num,3))::integer,1000000) + 1)"
			+ " from goods";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
			goodsNum = rs.getString(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return goodsNum;
		
	}
}
