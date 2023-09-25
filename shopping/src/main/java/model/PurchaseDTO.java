package model;

import java.util.Date;

public class PurchaseDTO {
	String purchaseNum;
	Date purchaseDate;
	String purchasePhone;
	String purchaseAddr;
	String purchaseAddr2;
	String purchasePost;
	String purchaseMessage;
	String purchaseStatus;
	String memberNum;
	Long purchasePrice;
	public String getPurchaseNum() {
		return purchaseNum;
	}
	public void setPurchaseNum(String purchaseNum) {
		this.purchaseNum = purchaseNum;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getPurchasePhone() {
		return purchasePhone;
	}
	public void setPurchasePhone(String purchasePhone) {
		this.purchasePhone = purchasePhone;
	}
	public String getPurchaseAddr() {
		return purchaseAddr;
	}
	public void setPurchaseAddr(String purchaseAddr) {
		this.purchaseAddr = purchaseAddr;
	}
	public String getPurchaseAddr2() {
		return purchaseAddr2;
	}
	public void setPurchaseAddr2(String purchaseAddr2) {
		this.purchaseAddr2 = purchaseAddr2;
	}
	public String getPurchasePost() {
		return purchasePost;
	}
	public void setPurchasePost(String purchasePost) {
		this.purchasePost = purchasePost;
	}
	public String getPurchaseMessage() {
		return purchaseMessage;
	}
	public void setPurchaseMessage(String purchaseMessage) {
		this.purchaseMessage = purchaseMessage;
	}
	public String getPurchaseStatus() {
		return purchaseStatus;
	}
	public void setPurchaseStatus(String purchaseStatus) {
		this.purchaseStatus = purchaseStatus;
	}
	public String getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}
	public Long getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(Long purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
}
