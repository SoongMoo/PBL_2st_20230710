package springBootMVCShopping.mapper;

import org.apache.ibatis.annotations.Mapper;

import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.MemberDTO;

@Mapper
public interface UserMapper {
	public int userInsert(MemberDTO dto);
	public int userCkeckUpdate(String email);
	public AuthInfoDTO loginSelect(String userId);
}
