package dependencyTest3.Repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dependencyTest3.model.BoardDTO;

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
	public BoardDTO selectOne(Integer num) {
		BoardDTO dto = null;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		String statement = namespace + ".selectOne";
		dto = sqlSession.selectOne(statement, num);
		return dto;
	}
	public void boardUpdate(BoardDTO dto) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		String statement = namespace + ".boardUpdate";
		int i = sqlSession.update(statement, dto);
		System.out.println(i + "개가 수정되었습니다. ");
		sqlSession.commit();
		sqlSession.close();
	}
	
	public void boardDel(Integer num) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		String statement = namespace + ".boardDel";
		int i = sqlSession.delete(statement, num);
		System.out.println(i + "개가 삭제되었습니다. ");
		sqlSession.commit();
		sqlSession.close();
	}
}