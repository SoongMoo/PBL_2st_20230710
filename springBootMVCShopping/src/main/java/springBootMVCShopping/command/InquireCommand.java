package springBootMVCShopping.command;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class InquireCommand {
	Integer inquireNum;
	String goodsNum;
	String inquireKind;
	String inquireSubject;
	String inquireContent;
	String inquireAnswer;
	String memberNum;
}
