package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	public List<GoodsIpgoDTO> selectAll() {
		List<GoodsIpgoDTO> list = new ArrayList<GoodsIpgoDTO>();
		con = getConnection();
		sql = "select ipgo_num, goods_num, ipgo_qty, made_date"
				+ "   ,ipgo_price, ipgo_date, emp_num"
			+ " from goodsIpgo"
			+ " order by ipgo_num desc, goods_num";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				GoodsIpgoDTO dto = new GoodsIpgoDTO();
				dto.setGoodsIpgoNum(rs.getString("ipgo_num"));
				dto.setGoodsNum(rs.getString(2));
				dto.setIpgoQty(rs.getInt(3));
				dto.setMadeDate(rs.getDate(4));
				dto.setIpgoPrice(rs.getInt(5));
				dto.setIpgoDate(rs.getDate(6));
				dto.setEmpNum(rs.getString(7));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}
	
	public GoodsIpgoDTO selectIpgoGoods(String ipgoNum , String goodsNum) {
		GoodsIpgoDTO dto = new GoodsIpgoDTO();
		con = getConnection();
		sql = "select ipgo_num, i.goods_num, ipgo_qty, made_date"
				+ "   ,ipgo_price, ipgo_date, i.emp_num "
				+ "   , goods_name"
			+ " from goodsIpgo i , goods g"
			+ " where i.goods_num = g.goods_num "
			+ "   and i.ipgo_num = ? and i.goods_num = ? "
			+ " order by ipgo_num desc, goods_num";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(2, goodsNum);
			pstmt.setString(1, ipgoNum);
			rs = pstmt.executeQuery();
			rs.next();
			dto.setEmpNum(rs.getString("emp_num"));
			dto.setGoodsIpgoNum(rs.getString("ipgo_num"));
			dto.setGoodsName(rs.getString("goods_name"));
			dto.setGoodsNum(rs.getString("goods_num"));
			dto.setIpgoDate(rs.getDate("ipgo_date"));
			dto.setIpgoPrice(rs.getInt("ipgo_price"));
			dto.setIpgoQty(rs.getInt("ipgo_qty"));
			dto.setMadeDate(rs.getDate("made_date"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;
	}
	
	public void ipgoGoodsUpdate(GoodsIpgoDTO dto) {
		con = getConnection();
		sql = " update goodsIpgo "
			+ " set ipgo_Date = ?, ipgo_Qty =? "
			+ "    , made_Date = ? , ipgo_Price = ?"
			+ " where ipgo_Num = ? "
			+ "   and goods_Num = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setDate(1, new java.sql.Date(dto.getIpgoDate().getTime()));
			pstmt.setInt(2, dto.getIpgoQty());
			pstmt.setDate(3, new java.sql.Date(dto.getMadeDate().getTime()));
			pstmt.setInt(4, dto.getIpgoPrice());
			pstmt.setString(5, dto.getGoodsIpgoNum());
			pstmt.setString(6, dto.getGoodsNum());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개 행이(가) 수정되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void goodsIpgoDelete(String ipgoNum, String goodsNum) {
		con = getConnection();
		sql = " delete from goodsIpgo "
			+ " where ipgo_num = ? and goods_num = ?";
		try {
			pstmt =con.prepareStatement(sql);
			pstmt.setString(1, ipgoNum);
			pstmt.setString(2, goodsNum);
			int i = pstmt.executeUpdate();
			System.out.println(i + "개행이(가) 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
	}
	
	
	

}
