package springBootMVCShopping.command;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class FindIdCommand {
	@NotBlank(message = "등록한 전화번호를 입력해주세요.")
	String userPhone;
	@NotEmpty(message = "등록한 이메일을 입력해주세요.")
	String userEmail;
}
