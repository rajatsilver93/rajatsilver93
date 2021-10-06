package in.co.rays;

public class Rectangle extends Testshape {
public int lenght;
public int width;
public Rectangle() {
	}
public Rectangle(int x,int y) {
	lenght=x;
	width=y;
}
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
public double area () {
	return lenght*width;
}
public static void main(String[] args) {
	Rectangle r=new Rectangle();
	r.setLenght(12);
	r.setWidth(15);
	
	System.out.println(r.area());
	System.out.println("lenght is"+r.lenght);
	System.out.println("width is"+r.width);
}
}
