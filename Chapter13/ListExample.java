package Chapter13;

import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		BoardDao b = new BoardDao();
		List<Board> list = b.getBoardList();
		for (Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	} 
}
