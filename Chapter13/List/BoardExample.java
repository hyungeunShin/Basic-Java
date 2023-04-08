package Chapter13.List;

import java.util.*;

public class BoardExample {
	public static void main(String[] args) {
		List<Board> a = new ArrayList<>();
		
		a.add(new Board("제목1", "내용1", "글쓴이1"));
		a.add(new Board("제목2", "내용2", "글쓴이2"));
		a.add(new Board("제목3", "내용3", "글쓴이3"));
		a.add(new Board("제목4", "내용4", "글쓴이4"));
		a.add(new Board("제목5", "내용5", "글쓴이5"));
		
		a.remove(2);
		a.remove(3);
		
		for (Board board : a) {
			//System.out.println(board.getTitle() + board.getContent() + board.getAuthor());
			System.out.println(board);  //toString 재정의
		}
	}
}
