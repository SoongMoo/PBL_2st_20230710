package springBootMVCShopping.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
	public String selectIdCheck(String userId);
	public String selectEmailCheck(String userEmail);
}
