package in.co.rays;

public class Testshape extends TestPoly{

	public String color;
	public int borderWidth;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
		
	}
	public double  area() {
		return 0.0;
	}
	public static void main(String[] args) {
		Testshape y=new Circle(2);
		Testshape y1=new Rectangle(2,3);
		Testshape y2=new Triangle(3,2);
	System.out.println(y.area());
	System.out.println(y1.area());
	System.out.println(y2.area());
	}
}
