package springBootMVCShopping.service;

import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootMVCShopping.mapper.LoginMapper;

@Service
public class EmailCheckService {
	@Autowired
	LoginMapper loginMapper;
	public String execute(String userEmail) {
		String resultEmail = loginMapper.selectEmailCheck(userEmail);
		return resultEmail;
	}
}