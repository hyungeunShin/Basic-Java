package Chapter13.List;

public class Board {
	private String title;
	private String content;
	private String author;
	
	public Board(String title, String content, String author) {
		this.title = title;
		this.content = content;
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return String.format("Board [제목: %s, 내용: %s, 작가: %s]", title, content, author);
	}	
}
