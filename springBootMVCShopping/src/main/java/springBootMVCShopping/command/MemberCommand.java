package springBootMVCShopping.command;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
@Data
public class MemberCommand { // html의 input name과 같아야 한다.
	String memberNum;
	@NotEmpty(message = "아이디를 입력해주세요")
	String memberId;
	@Pattern(regexp = "^(?=.*?[A-Za-z])(?=.*?[0-9])(?=.*?[#!@$%^&*-+?~]).{8,}$",
			message = "영문자와 숫자 그리고 특수문자가 포함된 8글자 이상")
	String memberPw;
	@NotBlank(message = "비밀번호 확인을 입력해주세요.")
	String memberPwCon;
	@NotBlank(message = "이름을 입력하여 주세요.")
	String memberName;
	@NotBlank(message = "주소를 입력하여 주세요.")
	String memberAddr;
	String memberAddr2;
	String memberPost;
	String memberGender;
	@NotBlank(message = "연락처을 입력하여 주세요.")
	String memberPhone1;
	String memberPhone2;
	@NotEmpty(message = "이메일을 입력하여 주세요.")
	String memberEmail;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull(message="생년월일을 입력해주세요.") /// NotNull은 String을 제외한 나머지
	Date memberBirth;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date memberRegiDate;
	public boolean isMemberPwEqualsMemberPwCon() {
		return memberPw.equals(memberPwCon);
	}
}











