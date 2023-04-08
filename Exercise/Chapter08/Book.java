package Exercise.Chapter08;

import java.util.Objects;

public abstract class Book {
	private int number;
	private String title;
	private String author;
	private static int countOfBooks;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		number = ++countOfBooks;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public abstract int getLateFee(int lateDays);
	
	
	
	@Override
	public boolean equals(Object obj) { //Object obj = new Book("","");
		//1. 주소가 같은 객체
		if(this == obj) {
			return true;
		}
		//2. title과 author가 같으면 같은 객체
//		if(obj instanceof Book) {
//			Book b = (Book) obj;
//			if(title.equals(b.title) && author.equals(b.author)) {
//				return true;
//			}
//		}
		
		if(!(obj instanceof Book)) {
			return false;
		}
		Book b = (Book) obj;
		//return title.equals(b.title) && author.equals(b.author);
		return Objects.equals(title, b.title) && Objects.equals(author, b.author);
	}
	
//	public boolean equals(Book b) {
//		if(b.title.equals(title) && b.author.equals(author)) {
//			return true;
//		}
//		return false;
//	}
	
	public int hashCode() {
		return Objects.hash(title, author);
	}

	@Override
	public String toString() {
		return String.format("관리번호: %d, 제목: %s, 작가: %s(일주일 연체료: %,d원)", number, title, author, getLateFee(7));
	}	
}
