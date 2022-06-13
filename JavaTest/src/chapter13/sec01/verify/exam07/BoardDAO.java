package chapter13.sec01.verify.exam07;

import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
	// 코드 작성
	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<Board>();
		
		list.add(new Board("제목1","내용1"));
		list.add(new Board("제목2","내용2"));
		list.add(new Board("제목3","내용3"));
		
		return list;  
	}
}
