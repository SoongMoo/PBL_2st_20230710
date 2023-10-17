package springBootMVCShopping.domain;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("mem")
public class MemberDTO { // member table의 컬럼명과 같아야 한다.
	   String memberNum;
	   String memberId;
	   String memberPw;
	   String memberName;
	   String memberAddr;
	   String memberAddrDetail;
	   String memberPost;
	   Date memberRegistDate;
	   String gender;
	   String memberPhone1;
	   String memberPhone2;
	   String memberEmail;
	   Date memberBirth;
}
