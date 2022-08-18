package shapes;

import java.util.Objects;

public class Square extends Shape {
	private int edge;

	public Square(int edge) {
		super("Square");
		this.edge = edge;
	}

	public int getEdge() {
		return edge;
	}

	@Override
	void draw() {
		System.out.println("The square drawn");
	}

	@Override
	void erase() {
		System.out.println("The square erased");
	}

	@Override
	double calculateArea() {
		area = Math.pow(getEdge(), 2);
		return super.calculateArea();
	}

	@Override
	double calculateCircumference() {
		circumference = 4 * (getEdge());
		return super.calculateCircumference();
	}

	@Override
	public int hashCode() {
		return Objects.hash(edge);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Square other = (Square) obj;
		return edge == other.edge;
	}

	@Override
	public String toString() {
		return "Square [edge=" + edge + "]";
	}

}