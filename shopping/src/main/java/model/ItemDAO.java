package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemDAO extends DataBaseInfo{
	public void cartInsert(CartDTO dto) {
		con = getConnection();
		sql = " merge into cart c "
			+ " using (select goods_num from goods "
			+ "        where goods_num = ? ) g"
			+ " on (c.goods_num = g.goods_num and c.member_num = ? ) "
			+ " WHEN MATCHED THEN "
			+ " update set "
			+ " 	cart_qty = cart_qty + ? "
			+ " WHEN NOT MATCHED THEN"
			+ " insert ( MEMBER_NUM, GOODS_NUM, CART_DATE, CART_QTY) "
			+ " values ( ?, ?, now() , ?) ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getGoodsNum());
			pstmt.setString(2, dto.getMemberNum());
			pstmt.setInt(3, dto.getCartQty());
			pstmt.setString(4, dto.getMemberNum());
			pstmt.setString(5, dto.getGoodsNum());
			pstmt.setInt(6, dto.getCartQty());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 삽입되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}	
	}
	public CartListDTO selectOne(String memberNum, String goodsNum) {
		CartListDTO dto = new CartListDTO();
		con = getConnection();
		sql = " select MEMBER_NUM, c.GOODS_NUM, CART_QTY, CART_DATE"
			+ "    ,goods_name, goods_price * CART_QTY total_price"
			+ "    ,goods_main_store , delivery_Cost"
			+ " from cart c, goods g"
			+ " where c.GOODS_NUM = g.GOODS_NUM and MEMBER_NUM = ? "
			+ " and c.goods_num = ? "
			+ " order by c.GOODS_NUM desc";		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memberNum);
			pstmt.setString(2, goodsNum);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto.setCartDate(rs.getDate("CART_DATE"));
				dto.setCartQty(rs.getInt("CART_QTY"));
				dto.setGoodsName(rs.getString("goods_name"));
				dto.setGoodsNum(rs.getString("GOODS_NUM"));
				dto.setMemberNum(rs.getString("MEMBER_NUM"));
				dto.setTotalPrice(rs.getInt("total_price"));
				dto.setGoodsImage(rs.getString("goods_main_store"));
				dto.setDeliveryCost(rs.getInt("delivery_Cost"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return dto;
	}
	
	public List<CartListDTO> cartList(String memberNum){
		List<CartListDTO> list = new ArrayList<CartListDTO>();
		con = getConnection();
		sql = " select MEMBER_NUM, c.GOODS_NUM, CART_QTY, CART_DATE"
			+ "    ,goods_name, goods_price * CART_QTY total_price"
			+ "    ,goods_main_store"
			+ " from cart c, goods g"
			+ " where c.GOODS_NUM = g.GOODS_NUM and MEMBER_NUM = ? "
			+ " order by c.GOODS_NUM desc";		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memberNum);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				CartListDTO dto = new CartListDTO();
				dto.setCartDate(rs.getDate("CART_DATE"));
				dto.setCartQty(rs.getInt("CART_QTY"));
				dto.setGoodsName(rs.getString("goods_name"));
				dto.setGoodsNum(rs.getString("GOODS_NUM"));
				dto.setMemberNum(rs.getString("MEMBER_NUM"));
				dto.setTotalPrice(rs.getInt("total_price"));
				dto.setGoodsImage(rs.getString("goods_main_store"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}		
		return list;
	}
	
	public void itemQtyDown(String goodsNum, String memberNum) {
		con = getConnection();
		sql = " update cart "
			+ " set cart_qty = cart_qty - 1 "
			+ " where  MEMBER_NUM = ? and GOODS_NUM = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memberNum);
			pstmt.setString(2, goodsNum);
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 수정되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
	}
	public void itemDelete(String memberNum, String goodNum) {
		con = getConnection();
		sql = " delete from cart "
			+ "	where member_Num=? and goods_num=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memberNum);
			pstmt.setString(2, goodNum);
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 삭되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
	}
	
	public void purchaseInsert(PurchaseDTO dto) {
		con = getConnection();
		sql = " insert into purchase(purchase_Num, purchase_Date, delivery_Name, delivery_Phone"
			+ "                     ,delivery_Addr, delivery_Addr_Detail, delivery_Post"
			+ "                     ,message, purchase_Status, member_Num,  PURCHASE_PRICE )"
			+ " values              (?, now(), ?, ?, ?, ?, ?, ?, '결제대기중', ?, ?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getPurchaseNum());
			pstmt.setString(2, dto.getDeliveryName());
			pstmt.setString(3, dto.getDeliveryPhone());
			pstmt.setString(4, dto.getDeliveryAddr());
			pstmt.setString(5, dto.getDeliveryAddrDetail());
			pstmt.setString(6, dto.getDeliveryPost());
			pstmt.setString(7, dto.getMessage());
			pstmt.setString(8, dto.getMemberNum());
			pstmt.setLong(9, dto.getPurchasePrice());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개 행이(가) 삽입되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
	}
	public void purchaseListInsert(PurchaseListDTO dto, String memberNum) {
		con = getConnection();
		sql = " insert into purchase_list(PURCHASE_NUM, GOODS_NUM, PURCHASE_QTY, total_price) "
			+ " select ?, c.GOODS_NUM, cart_qty, cart_qty * goods_price "
			+ " from cart c join goods g "
			+ " on c.goods_num=g.goods_num "
			+ " where c.goods_num = ? and member_num = ? ";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getPurchaseNum());
			pstmt.setString(2, dto.getGoodsNum());
			pstmt.setString(3, memberNum);
			int i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
	}
	public void cartItemDelete(String goodsNum, String memberNum) {
		con = getConnection();
		sql = " delete from cart "
			+ " where MEMBER_NUM = ? and GOODS_NUM = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memberNum);
			pstmt.setString(2, goodsNum);
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
	}
	
	
	
	
	
	
	
	
	
}