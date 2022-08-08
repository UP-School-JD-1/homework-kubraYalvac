package point;

public class PointTest {

	public static void main(String[] args) {
		Point point = new Point(6, 8);
		Point point2 = new Point(6,10);
		Point point3 = new Point(1, 1);

		System.out.println("X coordinate of the point:" + point.getX());
		System.out.println("Y coordinate of the point:" + point.getY());
		
		System.out.println("Distance of the point from the origin:" + point.distanceToOrigin());
		System.out.println("Distance of the point from the other point:" + point.distanceToOtherPoint(point2));
		System.out.println("Distance of the point from the another point:" + point.distanceToOtherPoint(point3));
		
		point.move(4, -4);
		System.out.println("---point moved---");
		System.out.println("New X coordinate:" + point.getX());
		System.out.println("New Y coordinate:" + point.getY());

		point.clone(point);
		System.out.println("---Point object cloned---");
		System.out.println("Clone X coordinate : " + point.getX());
		System.out.println("Clone Y coordinate : " + point.getY());
	}

}
