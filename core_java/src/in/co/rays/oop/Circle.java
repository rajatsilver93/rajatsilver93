package in.co.rays.oop;

public class Circle extends Shape1 {
private int radius;


public int getRadius() {
	return radius;
}


public void setRadius(int radius) {
	this.radius = radius;
}
public double area() {
	return Math.PI*radius*radius;
}


public static void main(String[] args) {
	Circle f=new Circle();
	f.setRadius(3);
	f.setColor("black");
	f.setBorderwidth(5);
	
	
    System.out.println("area of circle is-->"+f.area());
    
    System.out.println("radius of circle is-->"+f.getRadius());
    System.out.println();
    System.out.println("color of circle is-->"+f.getColor());
    
    System.out.println("borderwidth of circle is-->"+f.getBorderwidth());
}


}
