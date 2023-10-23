package springBootMVCShopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootMVCShopping.mapper.UserMapper;

@Service
public class UserEmailCheckService {
	@Autowired
	UserMapper userMapper;
	public int execute(String email) {
		int i = userMapper.userCkeckUpdate(email);
		return i;
	}
}
