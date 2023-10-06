package model;

import java.sql.SQLException;

public class DeliveryDAO extends DataBaseInfo{
	public void deliveryUpdate(DeliveryDTO dto) {
		con = getConnection();
		sql = " update delivery "
			+ " set DELIVERY_NUM = ? "
			+ "     ,DELIVERY_STATE = ? "
			+ " where PURCHASE_NUM = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getDeliveryNum());
			pstmt.setString(2, dto.getDeliveryState());
			pstmt.setString(3, dto.getPurchaseNum());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 수정되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
	}
	public DeliveryDTO deliverySelect(String purchaseNum) {
		DeliveryDTO dto = null;
		con = getConnection();
		sql= " select DELIVERY_NUM, PURCHASE_NUM, DELIVERY_DATE "
		   + "	    , DELIVERY_STATE "
		   + " from DELIVERY"
		   + " where PURCHASE_NUM = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, purchaseNum);
			rs = pstmt.executeQuery();
			rs.next();
			dto = new DeliveryDTO();
			dto.setDeliveryDate(rs.getDate("DELIVERY_DATE"));
			dto.setDeliveryNum(rs.getString("DELIVERY_NUM"));
			dto.setPurchaseNum(rs.getString("PURCHASE_NUM"));
			dto.setDeliveryState(rs.getString("DELIVERY_STATE"));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return dto;
	}
	
	public void deliveryInsert(String purchaseNum,String deliveryNum) {
		con = getConnection();
		sql = " insert into DELIVERY ( PURCHASE_NUM, DELIVERY_NUM, DELIVERY_DATE "
			+ "                    , DELIVERY_STATE ) "
			+ " values(?,?, now(), '배송중')";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, purchaseNum);
			pstmt.setString(2, deliveryNum);
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 삽입되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
	}
	
}
