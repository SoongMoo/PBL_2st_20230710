package model;

public class PaymentDTO {
	String purchaseNum;
	String confirmNumber; // applNum :승인번호
	String cardNum; // 카드번호
	String tid; // 거래번호
	String totalPrice; // 결제 금액
	String resultMessage; // 결과 메세지
	String payMethod; // 결제 방법
	String applDate; // 승인날짜
	String applTime; // 승인시간
	String purchaseName; // 제품명
	public String getPurchaseNum() {
		return purchaseNum;
	}
	public void setPurchaseNum(String purchaseNum) {
		this.purchaseNum = purchaseNum;
	}
	public String getConfirmNumber() {
		return confirmNumber;
	}
	public void setConfirmNumber(String confirmNumber) {
		this.confirmNumber = confirmNumber;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getResultMessage() {
		return resultMessage;
	}
	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	public String getPayMethod() {
		return payMethod;
	}
	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}
	public String getApplDate() {
		return applDate;
	}
	public void setApplDate(String applDate) {
		this.applDate = applDate;
	}
	public String getApplTime() {
		return applTime;
	}
	public void setApplTime(String applTime) {
		this.applTime = applTime;
	}
	public String getPurchaseName() {
		return purchaseName;
	}
	public void setPurchaseName(String purchaseName) {
		this.purchaseName = purchaseName;
	}
}
