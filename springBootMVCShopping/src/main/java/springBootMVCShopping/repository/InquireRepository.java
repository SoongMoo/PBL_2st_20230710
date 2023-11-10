package springBootMVCShopping.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springBootMVCShopping.domain.InquireDTO;

@Repository
public class InquireRepository {
	@Autowired
	SqlSession sqlSession;
	String namespace = "InquireMapper";
	String statement;
	public List<InquireDTO> inquireList(String goodsNum, Integer inquireNum){
		InquireDTO dto = new InquireDTO();
		dto.setGoodsNum(goodsNum);
		dto.setInquireNum(inquireNum);
		statement = namespace + ".inquireList";
		return sqlSession.selectList(statement, dto);
	}
	public Integer inquireInsert(InquireDTO dto) {
		statement = namespace + ".inquireInsert";
		return sqlSession.insert(statement, dto);
	}
	public Integer inquireUpdate(InquireDTO dto) {
		statement = namespace + ".inquireUpdate";
		return sqlSession.update(statement, dto);
	}
	public Integer inquireDelete(Integer inquireNum) {
		statement = namespace + ".inquireDelete";
		return sqlSession.delete(statement, inquireNum);
	}
}



