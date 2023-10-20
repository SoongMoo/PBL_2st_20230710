package springBootMVCShopping.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import springBootMVCShopping.domain.MemberDTO;

@Mapper
public interface MemberMapper {
	public void memberInsert(MemberDTO dto);
	public String memberAutoNum();
	public List<MemberDTO> selectAll();
}
