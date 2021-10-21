package in.co.rays.oop;

public class Circle2 extends Shape2 {
	
		
	
	private int radius;
	 public Circle2() {
		// TODO Auto-generated constructor stub
	}
		

		
	public Circle2(int x) {
		radius=x;
	}
	public int getRadius() {
		return radius;
		
	}
	
	public double area() {
		double z=3.14*radius*radius;
		System.out.println("area of circle is-->"+z);
		return z;
	}
	
			
		}
		

		
		
		


