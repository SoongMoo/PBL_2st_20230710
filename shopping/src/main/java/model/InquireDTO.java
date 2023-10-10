package model;

import java.util.Date;

public class InquireDTO {
	Long inquireNum;
	String goodsNum;
	String memberNum;
	String inquireSubject;
	String inquireContent;
	String inquireKind;
	Date inquireDate;
	String inquireAnswer;
	Date inquireAnswerDate;
	String empNum;
	public Long getInquireNum() {
		return inquireNum;
	}
	public void setInquireNum(Long inquireNum) {
		this.inquireNum = inquireNum;
	}
	public String getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(String goodsNum) {
		this.goodsNum = goodsNum;
	}
	public String getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}
	public String getInquireSubject() {
		return inquireSubject;
	}
	public void setInquireSubject(String inquireSubject) {
		this.inquireSubject = inquireSubject;
	}
	public String getInquireContent() {
		return inquireContent;
	}
	public void setInquireContent(String inquireContent) {
		this.inquireContent = inquireContent;
	}
	public String getInquireKind() {
		return inquireKind;
	}
	public void setInquireKind(String inquireKind) {
		this.inquireKind = inquireKind;
	}
	public Date getInquireDate() {
		return inquireDate;
	}
	public void setInquireDate(Date inquireDate) {
		this.inquireDate = inquireDate;
	}
	public String getInquireAnswer() {
		return inquireAnswer;
	}
	public void setInquireAnswer(String inquireAnswer) {
		this.inquireAnswer = inquireAnswer;
	}
	public Date getInquireAnswerDate() {
		return inquireAnswerDate;
	}
	public void setInquireAnswerDate(Date inquireAnswerDate) {
		this.inquireAnswerDate = inquireAnswerDate;
	}
	public String getEmpNum() {
		return empNum;
	}
	public void setEmpNum(String empNum) {
		this.empNum = empNum;
	}
	
	
}
