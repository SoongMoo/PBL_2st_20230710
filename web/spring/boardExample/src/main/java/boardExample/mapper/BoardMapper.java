package boardExample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import boardExample.domain.BoardDTO;

@Mapper
public interface BoardMapper {
	public void boardInsert(BoardDTO dto);
	public List<BoardDTO> selectAll();
	public BoardDTO selectOne(Integer num);
	public void boardUpdate(BoardDTO dto);
	public void boardDel(Integer boardNum);
}
