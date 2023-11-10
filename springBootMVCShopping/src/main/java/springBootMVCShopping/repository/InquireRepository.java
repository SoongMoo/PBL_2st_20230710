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
	public List<InquireDTO> inquireList(String goodsNum){
		statement = namespace + ".inquireList";
		return sqlSession.selectList(statement, goodsNum);
	}
}
