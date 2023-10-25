package springBootMVCShopping.domain;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Alias("authInfo")
@NoArgsConstructor
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
	public AuthInfoDTO(String userId, String userPw, String userName, 
			String grade, String userEmail, String userEmailCheck) {
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.grade = grade;
		this.userEmail = userEmail;
		this.userEmailCheck = userEmailCheck;
	}
}