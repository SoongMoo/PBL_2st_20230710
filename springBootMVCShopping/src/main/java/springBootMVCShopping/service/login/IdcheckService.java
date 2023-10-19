package springBootMVCShopping.service.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootMVCShopping.mapper.LoginMapper;
@Service
public class IdcheckService {
	@Autowired
	LoginMapper loginMapper;
	public String execute( String userId ) {
		String resultId = loginMapper.selectIdCheck(userId) ;
		return resultId;
	}
}
