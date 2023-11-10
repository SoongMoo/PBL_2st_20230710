package springBootMVCShopping;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig  implements WebMvcConfigurer{
	@Autowired
	InteceptorConfig inteceptorConfig;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		List<String> addList = new ArrayList<String>();
		addList.add("/employee/**/*");
		addList.add("/member/**/*");
		addList.add("/goods/**/*");
		addList.add("/purchase/**/*");
		addList.add("/inquire/**/*");
		addList.add("/mypage/**/*");
		List<String> excludeList = new ArrayList<String>();
		excludeList.add("/register/**/*");
		excludeList.add("/help/**/*");
		excludeList.add("/login/**/*");
		excludeList.add("/corner/**/*");
		
		registry.addInterceptor(inteceptorConfig)
				.addPathPatterns(addList)    ///  session이 없으면 로그인페이지로
				.excludePathPatterns(excludeList); /// session이 없어도 해당 페이지그대로 사용		
	}
}
