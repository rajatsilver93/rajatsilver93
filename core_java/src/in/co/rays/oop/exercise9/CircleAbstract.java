package in.co.rays.oop.exercise9;

public  class CircleAbstract extends ShapeAbstract{
	private int Radius;

	public int getRadius() {
		return Radius;
	}

	public void setRadius(int radius) {
		Radius = radius;
	}
	public void area(double c) {
		 c=Math.PI*Radius*Radius;
		System.out.println(c);
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}

	
		
	

}
