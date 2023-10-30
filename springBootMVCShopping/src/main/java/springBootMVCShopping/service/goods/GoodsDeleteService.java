package springBootMVCShopping.service.goods;

import java.io.File;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootMVCShopping.domain.GoodsDTO;
import springBootMVCShopping.mapper.GoodsMapper;

@Service
public class GoodsDeleteService {
	@Autowired
	GoodsMapper goodsMapper;
	public void execute(String goodsNum) {
		GoodsDTO dto = goodsMapper.selectOne(goodsNum);
		int i = goodsMapper.goodsDelete(goodsNum);
		if(i > 0) {
			URL resource = getClass().getClassLoader().getResource("static/upload");
			String fileDir = resource.getFile(); 
			
			File file = new File(fileDir + "/" + dto.getGoodsMainStore());
			if(file.exists())file.delete();//
			
			if(dto.getGoodsImages() != null) {
				String [] img = dto.getGoodsImages().split("-");
				for(String fileName : img) {
					file = new File(fileDir + "/" +  fileName);
					if(file.exists())file.delete();
				}
			}
		}
	}
}
