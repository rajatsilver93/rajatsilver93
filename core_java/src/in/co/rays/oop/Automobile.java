package in.co.rays.oop;

public class Automobile {
	private String color;
	private int speed;
	private String make;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	

	public void Break(double s) {
		if(speed>=s) {
		System.out.println("Break-->"+(speed-10));
	}
		}
		
	public void Acceleration(double r){
			if(speed<=r) {
				System.out.println("Accelerate-->"+(speed+30));
			}
		}
}

