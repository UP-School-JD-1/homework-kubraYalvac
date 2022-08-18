package shapes;

import java.util.Objects;

public class Triangle extends Shape {
	
	private int edge1;
	private int edge2;
	private int edge3;

	public Triangle(int edge1, int edge2, int edge3) {
		super("Triangle");
		this.edge1 = edge1;
		this.edge2 = edge2;
		this.edge3 = edge3;
	}

	public int getEdge1() {
		return edge1;
	}

	public int getEdge2() {
		return edge2;
	}

	public int getEdge3() {
		return edge3;
	}

	@Override
	void draw() {
		System.out.println("The triangle drawn");
	}

	@Override
	void erase() {
		System.out.println("The triangle erased");
	}

	@Override
	double calculateArea() {
		double U = (edge1 + edge2 + edge3) / 2;
		area = Math.sqrt(U * (U - edge1) * (U - edge2) * (U - edge3));
		return super.calculateArea();
	}

	@Override
	double calculateCircumference() {
		circumference = getEdge1() + getEdge2() + getEdge3();
		return super.calculateCircumference();
	}

	@Override
	public int hashCode() {
		return Objects.hash(edge1, edge2, edge3);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		return edge1 == other.edge2 && edge2 == other.edge2 && edge3 == other.edge3;
	}

	@Override
	public String toString() {
		return "Triangle [edge1=" + edge1 + ", edge2=" + edge2 + ", edge3=" + edge3 + "]";
	}

}
