package springBootMVCShopping.domain;

import org.apache.ibatis.type.Alias;

@Alias("startEndPageVO")
public class StartEndPageDTO {
	int startRow;
	int endRow;
	String searchWord;
	public int getStartRow() {
		return startRow;
	}
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}
	public int getEndRow() {
		return endRow;
	}
	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}
	public String getSearchWord() {
		return searchWord;
	}
	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}
}
