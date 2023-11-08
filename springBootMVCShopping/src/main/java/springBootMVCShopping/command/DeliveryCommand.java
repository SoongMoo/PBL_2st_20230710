package springBootMVCShopping.command;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Alias("delivery")
public class DeliveryCommand {
	String purchaseNum;
	String deliveryNumber;
	Date deliveryDate;
	String deliveryState;
	String deliveryCompany;
}
