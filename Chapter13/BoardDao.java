package Chapter13;

import java.util.*;

public class BoardDao {
	public List<Board> getBoardList() {
		List<Board> a = new ArrayList<>();
		a.add(new Board("제목1", "내용1"));
		a.add(new Board("제목2", "내용2"));
		a.add(new Board("제목3", "내용3"));
		return a;
	}
}
