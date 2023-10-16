package dependencyTest1.Repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dependencyTest1.model.BoardDTO;

public class BoardRepository extends DataBaseInfoRepository{
	String namespace = "dependencyTest1.Repository.mapper.BoardMapper";
	public void boardInsert(BoardDTO dto) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		String statement = namespace + ".boardInsert";
		int i = sqlSession.insert(statement, dto);
		System.out.println(i + "개가 삽입되었습니다. ");
		sqlSession.commit();
		sqlSession.close();
	}
	public List<BoardDTO> selectAll(){
		List<BoardDTO> list = null;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		String statement = namespace + ".selectAll";
		list  = sqlSession.selectList(statement);
		return list;
	}
	
	
	
	
	
	
	
}