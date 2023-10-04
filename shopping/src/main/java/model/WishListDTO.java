package model;

import java.util.Date;

public class WishListDTO {
	String goodsNum;
	String goodsMainStore;
	String goodsName;
	Date wishDate;
	Integer goodsPrice;
	public Integer getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(Integer goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public String getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(String goodsNum) {
		this.goodsNum = goodsNum;
	}
	public String getGoodsMainStore() {
		return goodsMainStore;
	}
	public void setGoodsMainStore(String goodsMainStore) {
		this.goodsMainStore = goodsMainStore;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public Date getWishDate() {
		return wishDate;
	}
	public void setWishDate(Date wishDate) {
		this.wishDate = wishDate;
	}
}
