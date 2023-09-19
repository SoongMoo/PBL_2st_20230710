package model;

import java.util.Date;

public class GoodsDTO {
	String goodsNum;
	String goodsName;
	int goodsPrice;
	String goodsContent;
	String goodsMainStore;
	String goodsMainStoreImg;
	String goodsImages;
	String goodsImagesImg;
	int deliveryCost;
	int visitCount;
	
	String employeeNum;
	Date goodsRegist;
	String updateEmpNum;
	Date goodsUpdateDate;
	
	public String getGoodsMainStore() {
		return goodsMainStore;
	}
	public void setGoodsMainStore(String goodsMainStore) {
		this.goodsMainStore = goodsMainStore;
	}
	public String getGoodsMainStoreImg() {
		return goodsMainStoreImg;
	}
	public void setGoodsMainStoreImg(String goodsMainStoreImg) {
		this.goodsMainStoreImg = goodsMainStoreImg;
	}
	public String getGoodsImages() {
		return goodsImages;
	}
	public void setGoodsImages(String goodsImages) {
		this.goodsImages = goodsImages;
	}
	public String getGoodsImagesImg() {
		return goodsImagesImg;
	}
	public void setGoodsImagesImg(String goodsImagesImg) {
		this.goodsImagesImg = goodsImagesImg;
	}
	public int getVisitCount() {
		return visitCount;
	}
	public void setVisitCount(int visitCount) {
		this.visitCount = visitCount;
	}
	public Date getGoodsRegist() {
		return goodsRegist;
	}
	public void setGoodsRegist(Date goodsRegist) {
		this.goodsRegist = goodsRegist;
	}
	public String getUpdateEmpNum() {
		return updateEmpNum;
	}
	public void setUpdateEmpNum(String updateEmpNum) {
		this.updateEmpNum = updateEmpNum;
	}
	public Date getGoodsUpdateDate() {
		return goodsUpdateDate;
	}
	public void setGoodsUpdateDate(Date goodsUpdateDate) {
		this.goodsUpdateDate = goodsUpdateDate;
	}
	public String getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(String goodsNum) {
		this.goodsNum = goodsNum;
	}
	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public int getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public String getGoodsContent() {
		return goodsContent;
	}

	public void setGoodsContent(String goodsContent) {
		this.goodsContent = goodsContent;
	}

	public int getDeliveryCost() {
		return deliveryCost;
	}

	public void setDeliveryCost(int deliveryCost) {
		this.deliveryCost = deliveryCost;
	}

	public String getEmployeeNum() {
		return employeeNum;
	}

	public void setEmployeeNum(String employeeNum) {
		this.employeeNum = employeeNum;
	}
}
