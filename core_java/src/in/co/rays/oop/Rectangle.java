package in.co.rays.oop;

public class Rectangle extends Shape1 {
private int lenght;
private int width;

	public int getLenght() {
	return lenght;
}

public void setLenght(int lenght) {
	this.lenght = lenght;
}

public int getWidth() {
	return width;
}

public void setWidth(int width) {
	this.width = width;
}
public int area() {
	return lenght*width;
}
	public static void main(String[] args) {
		Rectangle r= new Rectangle();
		r.setLenght(7);
		r.setWidth(8);
		r.setBorderwidth(2);
		r.setColor("blue");
		
		System.out.println("area of rectangle is-->"+r.area());
		System.out.println("lenght of rectangle is-->"+r.lenght);
		System.out.println("width of rectangle is-->"+r.width);
		System.out.println("color of rectangle is-->"+r.getColor());
		System.out.println("borderwidth of rectangle is-->"+r.getBorderwidth());
		
	}

}
