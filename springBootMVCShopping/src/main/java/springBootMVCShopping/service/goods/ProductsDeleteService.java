package springBootMVCShopping.service.goods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootMVCShopping.mapper.GoodsMapper;

@Service
public class ProductsDeleteService {
	@Autowired
	GoodsMapper goodsMapper;
	public void execute(String products[]) {
		goodsMapper.productsDelete(products);
	}
}
