package in.co.rays;

public class Triangle extends Testshape{
	
	public int base;
	public int height;
	public Triangle() {
		
	}
public Triangle(int c,int v) {
		base=c;
		height=v;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height; 
	
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double area() {
		return base*height;
	}
		public static void main(String[] args) {
			
		
		Triangle t=new Triangle();
		
		t.setBase(12);
		t.setHeight(12);
		
		System.out.println(t.area());
	}
		
	}
