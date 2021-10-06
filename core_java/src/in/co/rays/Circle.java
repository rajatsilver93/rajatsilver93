package in.co.rays;

public class Circle extends Testshape {
private int radius;
public Circle() {
	
}
public Circle(int x) {
	radius=x;
}
public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;

}
public double area() {
	return  3.14*radius*radius;
	
}
	public static void main(String[] args) {
		Circle c= new Circle();
		c.setRadius(9);
		c.setBorderWidth(15);
		c.setColor("black");
	
		System.out.println(c.getColor());
		System.out.println(c.getBorderWidth());
		System.out.println(c.area());
		
	}
	

	
	}
	
