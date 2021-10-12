package in.co.rays.oop;

public class Constructer {
	private String color;
	private int borderwidth;
	public Constructer() {
		System.out.println("this is default constructer");
		
		
	}
	public String getColor() {
		return color;
	}
	public int getBorderwidth() {
		return borderwidth;
	}
	public Constructer(String s , int a) {
		color=s;
		borderwidth=a;
		
	}
	
	
	}

