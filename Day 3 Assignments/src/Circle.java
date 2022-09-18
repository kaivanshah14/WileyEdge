/*
 * 1.Create a class Circle with following details: 
 * Attributes: radius, area
 * Methods  : calculateArea
 * Create object of circle with given radius and calculate the area. 
 * (Use the concept of parameterized constructor, code recommendation and this keyword)
 */


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
