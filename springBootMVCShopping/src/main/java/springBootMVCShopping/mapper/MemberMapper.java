package springBootMVCShopping.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.domain.StartEndPageDTO;

@Mapper
public interface MemberMapper {
	public int memberInsert(MemberDTO dto);
	public String memberAutoNum();
	public List<MemberDTO> selectAll(StartEndPageDTO sepDTO);
	public int membersDelete(@Param("membersNum") String [] memDels);
	public MemberDTO memberSelectOne(String memberNum);
	public int memberUpdate(MemberDTO dto);
	public int memberDelete(String memberNum);
	public int memberCount(String searchWord);
}
