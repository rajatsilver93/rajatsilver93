package in.co.rays.oop;

public class Rectangle2 extends Shape2 {
private int lenght;
private int widht;

public Rectangle2(int l , int w) {
	lenght=l;
	widht=w;
		
}
public Rectangle2() {
	// TODO Auto-generated constructor stub
}
public int getLenght() {
	return lenght;
}

public int getWidht() {
	return widht;
}
public double area () {
	int d=lenght*widht;
	System.out.println(d);
	return d;
}

}
