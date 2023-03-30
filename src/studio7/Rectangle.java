package studio7;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double area() {
		return length*width;
	}
	
	public double perimeter() {
		return 2*(length+width);
	}
	
	public boolean isSquare() {
		if (length == width) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isLarger(Rectangle a, Rectangle b) {
		if (a.area()>b.area()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle a = new Rectangle(10,5);
		Rectangle b = new Rectangle(7,8);
		System.out.println(a.area());
		System.out.println(a.perimeter());
		System.out.println(a.isSquare());
		System.out.println(b.isSquare());
		System.out.println(a.isLarger(a,b));
	}

}
