package shapes;

import java.util.Objects;

public class Rectangle extends Shape {
	private int width;
	private int length;

	public Rectangle(int width, int length) {
		super("Rectangle");
		this.width = width;
		this.length = length;

	}

	public int getWidth() {
		return width;
	}

	public int getLength() {
		return length;
	}

	@Override
	void draw() {
		System.out.println("The rectangle drawn");
	}

	@Override
	void erase() {
		System.out.println("The rectangle erased");
	}

	@Override
	double calculateArea() {
		area = getWidth() * getLength();
		return super.calculateArea();
	}

	@Override
	double calculateCircumference() {
		circumference = 2 * (getWidth() + getLength());
		return super.calculateCircumference();
	}

	@Override
	public int hashCode() {
		return Objects.hash(length, width);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		return length == other.length && width == other.width;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}

}
