//Chapter 9 Homework 3

package point;

public class Point {

	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(int x) {
		this(x, 0);
	}

	public Point() {
		this(0, 0);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double distanceToOrigin() {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

	public double distanceToOtherPoint(Point point) {
		return distanceToOtherPoint(point.getX(), point.getY());
	}

	public double distanceToOtherPoint(int x, int y) {
		return Math.sqrt(x * this.x) + (y * this.y);

	}

	public Point clone(Point point) {
		return new Point(point.getX(), point.getY());
	}

	public void move(int x, int y) {
		this.x += x;
		this.y += y;
	}
}
