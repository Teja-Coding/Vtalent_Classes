package org.com.Has_A_realationShip;

public class Author {
	public Book b;

	public Author(Book b) {
		this.b = b;
	}
	public void write() {
		b.openBook();
		b.turnPage();
		b.closeBook();
	}
	public static void main(String[] args) {
		Author a1=new Author(new Book());
		a1.write();
		
		
	}
}
