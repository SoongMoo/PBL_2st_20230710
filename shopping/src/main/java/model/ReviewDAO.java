package model;

import java.sql.SQLException;

public class ReviewDAO extends DataBaseInfo{
	public void reviewInsert(ReviewDTO dto) {
		con = getConnection();
		sql = " insert into review (purchase_num, goods_num , review_date "
				+ "                , score , review_content, member_id ) "
			+ " values( ?, ?, now(), 0, ?, ? )";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getPurchaseNum());
			pstmt.setString(2, dto.getGoodsNum());
			pstmt.setString(3, dto.getReviewContent());
			pstmt.setString(4, dto.getMemberId());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 십입되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
	}
}
