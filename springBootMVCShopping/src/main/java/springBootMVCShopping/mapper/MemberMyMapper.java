package springBootMVCShopping.mapper;

import org.apache.ibatis.annotations.Mapper;

import springBootMVCShopping.domain.MemberDTO;

@Mapper
public interface MemberMyMapper {
	public MemberDTO memberInfo(String memberId);
	public int memberPwUpdate(String userPw, String memberId);
}
