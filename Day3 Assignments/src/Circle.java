
public class Circle {
	private double radius;
	private double area ;
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
		area = 3.142*radius*radius;
	}
	public Circle() {
	}
	
	public static void main(String args[]) {
		Circle c = new Circle(7);
		System.out.println(c.getArea());
		Circle c1 = new Circle(1);
		System.out.println(c1.getArea());
	}

}
