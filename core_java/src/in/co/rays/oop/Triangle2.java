package in.co.rays.oop;

public class Triangle2 extends Shape2 {
	private int base;
	private int hieght;
	
	public Triangle2(int b, int h){
		base=b;
		hieght=h;
		
	}
public Triangle2() {
	
}
	public int getBase() {
		return base;
	}

	public int getHieght() {
		return hieght;
	}
	public double area() {
	double z=	0.5*base*hieght;
	System.out.println(z);
	return z;
	}
	

}
