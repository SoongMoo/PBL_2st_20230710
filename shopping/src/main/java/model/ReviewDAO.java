package model;

import java.sql.SQLException;

public class ReviewDAO extends DataBaseInfo{
	public void reviewUpdate(String reviewNum,String reviewContent) {
		con = getConnection();
		sql = "update review"
			+ " set  review_content = ?"
			+ " where review_num = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, reviewContent);
			pstmt.setInt(2, Integer.parseInt(reviewNum));
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 수정되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
	}
	
	
	public ReviewDTO reviewDetail(String purchaseNum, String goodsNum) {
		ReviewDTO dto = null;
		con = getConnection();
		sql = " select goods_name "
			+ "      , review_content , review_num "
			+ " from goods g join  review r "
			+ " on g.goods_num = r.goods_num "
			+ " where r.purchase_Num = ? and r.goods_Num =?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, purchaseNum);
			pstmt.setString(2, goodsNum);
			rs = pstmt.executeQuery();
			rs.next();
			dto = new ReviewDTO();
			dto.setGoodsName(rs.getString("goods_name"));
			dto.setReviewContent(rs.getString("review_content"));
			dto.setReviewNum(rs.getInt("review_num"));
		} catch (SQLException e) {
			e.printStackTrace();
		}finally { close(); }
		return dto;
	}
	
	
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
