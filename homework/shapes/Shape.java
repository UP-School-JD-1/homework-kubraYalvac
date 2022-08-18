//Ch12 Hw1

package shapes;

public class Shape {

	protected String name;
	double area;
	double circumference;

	public Shape(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void draw() {
		System.out.println(name + "drawn");

	}

	void erase() {
		System.out.println(name + "erased");
	}

	double calculateArea() {
		System.out.println("The area =" + area);
		return area;

	}

	double calculateCircumference() {
		System.out.println("The circumfrence =" + circumference);
		return circumference;
	}
}
