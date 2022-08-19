package book;

public class ReaderTest {

	public static void main(String[] args) {

		Author author1 = new Author("Emily Bronte");

		Book book2 = new Book("Wuthering Heights", 200, BookType.FICTION, false, 75, author1);

		Reader reader = new Reader("Kubra", 23, 'F');
		reader.getInfo();
		book2.getInfo();
		author1.getInfo();
	}

}
