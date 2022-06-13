package chapter13.sec01.verify.exam07;

import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		BoardDAO dao = new BoardDAO();
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle()+"-"+board.getContent());
		}
	}
}
