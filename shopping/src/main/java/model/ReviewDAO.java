package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReviewDAO extends DataBaseInfo{
	public List<ReviewDTO> reviewSelectAll(String goodsNum){
		List<ReviewDTO> list = new ArrayList<ReviewDTO>();
		con = getConnection();
		sql = " select REVIEW_NUM, REVIEW_CONTENT , review_date "
			+ "       ,member_id "
			+ " from review "
			+ " where goods_num = ? ";
		System.out.println(sql);
		System.out.println(goodsNum);
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, goodsNum);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ReviewDTO dto = new ReviewDTO();
				dto.setReviewNum(rs.getInt("REVIEW_NUM"));
				dto.setReviewContent(rs.getString("REVIEW_CONTENT"));
				dto.setMemberId(rs.getString("member_id"));
				dto.setReviewDate(rs.getDate("review_date"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
		return list;
	}
	public void reviewDelete(String reviewNum) {
		con = getConnection();
		sql = " delete from review "
			+ " where review_Num= ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(reviewNum));
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 삭제되었습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {close();}
	}
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
