package springBootMVCShopping.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springBootMVCShopping.domain.ReviewDTO;

@Repository
public class ReviewRepository {
	@Autowired
	SqlSession sqlSession;
	String namespace = "reviewMapper";
	String statement;
	public Integer reviewWrite(ReviewDTO dto) {
		statement = namespace + ".reviewWrite";
		return sqlSession.insert(statement, dto);
	}
	public Integer reviewDelete(Integer reviewNum) {
		statement = namespace + ".reviewDelete";
		return sqlSession.delete(statement, reviewNum) ;
	}
	public ReviewDTO reviewSelect(Integer reviewNum) {
		statement = namespace + ".reviewSelect";
		return sqlSession.selectOne(statement, reviewNum);
	}
	public Integer reviewUpdate(ReviewDTO dto) {
		statement = namespace + ".reviewUpdate";
		return sqlSession.update(statement, dto) ;
	}
}
