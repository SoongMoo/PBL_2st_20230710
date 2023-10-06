package model;

public class BuyListDTO {
	Long purchaseNum;
	Long purchasePrice; 
	String memberNum; 
	Long confirmNum;
	Long deliveryNum;
	String deliveryState;
	public String getDeliveryState() {
		return deliveryState;
	}
	public void setDeliveryState(String deliveryState) {
		this.deliveryState = deliveryState;
	}
	
	public Long getPurchaseNum() {
		return purchaseNum;
	}
	public void setPurchaseNum(Long purchaseNum) {
		this.purchaseNum = purchaseNum;
	}
	public Long getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(Long purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public String getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}
	public Long getConfirmNum() {
		return confirmNum;
	}
	public void setConfirmNum(Long confirmNum) {
		this.confirmNum = confirmNum;
	}
	public Long getDeliveryNum() {
		return deliveryNum;
	}
	public void setDeliveryNum(Long deliveryNum) {
		this.deliveryNum = deliveryNum;
	}
}
