// Course 2 Chapter 8 Functional Programming Hw 2 

package bookHw2;

import java.util.function.BinaryOperator;

public class BookTest {
	public static void main(String[] args) {

		Book b1 = new Book("Wuthering Heights", 400);
		Book b2 = new Book("Outliers", 304);

		BinaryOperator<Integer> op = BinaryOperator.maxBy((a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1));
		System.out.println(op.apply(b1.getPages(), b2.getPages()));
	}
}
