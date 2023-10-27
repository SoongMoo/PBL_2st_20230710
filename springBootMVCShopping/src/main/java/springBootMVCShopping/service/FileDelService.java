package springBootMVCShopping.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.FileCommand;

@Service
public class FileDelService {
//  이것을 이용하면 session을 이용한 장바구니도 가능하다.
	public String execute(FileCommand fileCommand, HttpSession session) {
		String num = "";
		Boolean newFile = true; // 새로운 상품인지 아니지를 확인 하기 위한 변수
		// 이미 상품이 등록되어 있다면 session이 있을 것이므로 session의 존재 유무를 확인한다.
		List<FileCommand> list = 
				(List<FileCommand>)session.getAttribute("fileList");
		// 첫 상품인 경우 session이 존재하지 않는 다는 것은 list가 없다.
		// session이 없으면 list부터 만든다.
		if(list == null) {
			list = new ArrayList<FileCommand>();
		}
		
		// session이 있다면 list가 있으므로 list에 어떻한 상품이 존재하는 지 확인
		for(int i = 0 ; i < list.size() ; i++) {
			if(list.get(i).getStoreFile().equals(fileCommand.getStoreFile())) {
				//fileInfoCommand.setQty(fileInfoCommand.getQty() + 1);
				list.remove(i);
				newFile = false;
				num =  "0";
				break;
			}
		}
		//  새로운 상품인 경우
		if(newFile) {
			list.add(fileCommand);
			num = "1";
		}
		session.setAttribute("fileList", list);
		return num;
	}
}
