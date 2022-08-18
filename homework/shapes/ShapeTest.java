package shapes;

public class ShapeTest {

	public static void main(String[] args) {
		Circle circle1 = new Circle(6);
		Circle circle2 = new Circle(6);
        Square square1 = new Square(10);
        Rectangle rectangle1 = new Rectangle(3, 4);
        Triangle triangle1 = new Triangle(5, 12, 13);
        
        
        circle1.draw();
        square1.draw();
        rectangle1.draw();
        triangle1.draw();
        
        
        System.out.println("Area of circle (" + circle1 + ") " + circle1.calculateArea());
        System.out.println("Circumference of circle (" + circle1 + ") " + circle1.calculateCircumference());

        System.out.println("Area of square (" + square1 + ") " + square1.calculateArea());
        System.out.println("Circumference of square (" + square1 + ") " + square1.calculateCircumference());

        System.out.println("Area of rectangle (" + rectangle1 + ") " + rectangle1.calculateArea());
        System.out.println("Circumference of rectangle (" + rectangle1 + ") " + rectangle1.calculateCircumference());

        System.out.println("Area of triangle (" + triangle1 + ") " + triangle1.calculateArea());
        System.out.println("Circumference of triangle (" + triangle1 + ") " + triangle1.calculateCircumference());
        
        
        
        System.out.println("Circle1 hashCode = " + circle1.hashCode() );
		System.out.println("Circle1 hashCode = " + circle2.hashCode() );
		System.out.println("Circle1 and Circle2 are equals = " + circle1.equals(circle2));
		System.out.println(circle1.toString());
		System.out.println(circle2.toString());
        
        
        circle1.erase();
        square1.erase();
        rectangle1.erase();
        triangle1.erase();

	}
}
