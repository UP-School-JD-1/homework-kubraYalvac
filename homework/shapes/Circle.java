package shapes;

import java.util.Objects;

public class Circle extends Shape {
	
	private int radius;

	public Circle(int radius) {
		super("Circle");
		this.radius = radius;

	}

	public int getRadius() {
		return radius;
	}

	@Override
	void draw() {
		System.out.println("The circle drawn");
	}

	@Override
	void erase() {
		System.out.println("The circle erased");
	}

	@Override
	double calculateArea() {
		area = Math.PI * (radius * radius);
		return super.calculateArea();
	}

	@Override
	double calculateCircumference() {
		circumference = 2 * Math.PI * radius;
		return super.calculateCircumference();
	}

	@Override
	public int hashCode() {
		return Objects.hash(radius);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		return radius == other.radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
