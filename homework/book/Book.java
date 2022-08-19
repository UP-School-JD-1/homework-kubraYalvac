package book;

public class Book {

	String title;
	int page;
	BookType type;
	boolean isHardCover;
	int currentPage;
	Author author;

	Book(String title, int page, BookType type, boolean isHardCover, int currentPage, Author author) {

		this.type = type;
		this.title = title;
		this.page = page;
		this.isHardCover = isHardCover;
		this.currentPage = currentPage;
		this.author = author;
	}

	public String getTitle() {
		return title;

	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getType() {
		return type.getDescription();
	}

	public void setType(BookType type) {
		this.type = type;
	}

	public void BookType(BookType type) {
		this.type = type;
	}

	public boolean isHardCover() {
		return isHardCover;
	}

	public void setHardCover(boolean hardCover) {
		isHardCover = hardCover;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public void getInfo() {

		System.out.println("Book Information : title = " + title + ", author = " + author.name + ", type = "
				+ type.getDescription() + ", page = " + page + ", currentpage = " + currentPage + ", ishardcover = "
				+ isHardCover);
	}

}