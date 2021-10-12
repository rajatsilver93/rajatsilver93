package in.co.rays.oop;

public class Triangle extends Shape1{
	private int base;
	private int hieght;
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHieght() {
		return hieght;
	}
	public void setHieght(int hieght) {
		this.hieght = hieght;
	}
	public double area() {
		return 0.5*base*hieght;
	}
	public static void main(String[] args) {
		Triangle t=new Triangle();
		t.setBase(5);
		t.setHieght(7);
		t.setBorderwidth(2);
		t.setColor("green");
		
		System.out.println("area of triangle is-->"+t.area());
		System.out.println("base of triangle is-->"+t.getBase());
		System.out.println("hieght of triangle is-->"+t.getHieght());

		System.out.println("color of triangle is-->"+t.getColor());

		System.out.println("borderwidth of triangle is-->"+t.getBorderwidth());
	}
		
	}
