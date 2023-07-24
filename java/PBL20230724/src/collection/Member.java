package collection;

public class Member {
	String memberNum;
	String memberId;
	String memberPw;
	String memberName;
	Integer age;
	Double height;
	
	public Member(String memberNum, String memberId, String memberPw, 
			String memberName, Integer age, Double height) {
		this.memberNum = memberNum;
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.age = age;
		this.height = height;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
}
