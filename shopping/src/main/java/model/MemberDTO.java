package model;

import java.util.Date;

public class MemberDTO {
	String memberNum;
	String memberId;
	String memberPw;
	String memberName;
	String memberPhone1;
	String memberPhone2;
	String memberAddr;
	String memberAddrDetail;
	String memberPost;
	String memberEmail;
	String memberGender;
	Date memberBirth;
	Date memberRegist;
	
	public Date getMemberRegist() {
		return memberRegist;
	}
	public void setMemberRegist(Date memberRegist) {
		this.memberRegist = memberRegist;
	}
	public String getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(String memberNum) {
		this.memberNum = memberNum;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberPhone1() {
		return memberPhone1;
	}
	public void setMemberPhone1(String memberPhone1) {
		this.memberPhone1 = memberPhone1;
	}
	public String getMemberPhone2() {
		return memberPhone2;
	}
	public void setMemberPhone2(String memberPhone2) {
		this.memberPhone2 = memberPhone2;
	}
	public String getMemberAddr() {
		return memberAddr;
	}
	public void setMemberAddr(String memberAddr) {
		this.memberAddr = memberAddr;
	}
	public String getMemberAddrDetail() {
		return memberAddrDetail;
	}
	public void setMemberAddrDetail(String memberAddrDetail) {
		this.memberAddrDetail = memberAddrDetail;
	}
	public String getMemberPost() {
		return memberPost;
	}
	public void setMemberPost(String memberPost) {
		this.memberPost = memberPost;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberGender() {
		return memberGender;
	}
	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}
	public Date getMemberBirth() {
		return memberBirth;
	}
	public void setMemberBirth(Date memberBirth) {
		this.memberBirth = memberBirth;
	}
	
}