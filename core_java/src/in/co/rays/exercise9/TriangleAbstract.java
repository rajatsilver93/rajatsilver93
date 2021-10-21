package in.co.rays.oop.exercise9;

public  class TriangleAbstract extends ShapeAbstract {
	private int hieght;
	private int base;
	public int getHieght() {
		return hieght;
	}
	public void setHieght(int hieght) {
		this.hieght = hieght;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public void area(double d) {
		 d=0.5*base*hieght;
		System.out.println(d);
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}

	

}
