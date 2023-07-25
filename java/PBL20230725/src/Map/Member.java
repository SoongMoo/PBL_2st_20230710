package Map;

public class Member {
	int memberId; 
	String memberName;
	String addr;
	public Member(int memberId, String memberName
			,String addr){ //생성자
		this.memberId = memberId;
		this.memberName = memberName;
		this.addr = addr;
	}
	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getMemberId() {  //
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
}