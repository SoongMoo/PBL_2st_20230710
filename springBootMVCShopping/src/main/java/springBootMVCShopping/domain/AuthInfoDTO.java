package springBootMVCShopping.domain;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Alias("authInfo")
@AllArgsConstructor
public class AuthInfoDTO {
	String userId;
	String userPw;
	String userName;
	String grade;
	String userEmail;
	String userEmailCheck;
	
	String tableName;
	String pwColumName;
	String userIdColumName;
}
