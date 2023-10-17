package springBootMVCShopping.command;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
@Data
public class MemberCommand { // html의 input name과 같아야 한다.
	String memberNum;
	String memberId;
	String memberPw;
	String memberPwCon;
	String memberName;
	String memberAddr;
	String memberAddr2;
	String memberPost;
	String memberGender;
	String memberPhone1;
	String memberPhone2;
	String memberEmail;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date memberBirth;

	public boolean isMemberPwEqualsMemberPwCon() {
		return memberPw.equals(memberPwCon);
	}
}











