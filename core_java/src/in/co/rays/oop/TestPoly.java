package in.co.rays.oop;


public class TestPoly {

public static void main(String[] args) {
	Shape2[] s=new Shape2[3];

	s[0]=new Rectangle2(4,6);
	s[1]=new Triangle2(6,6);
	s[2]=new Circle2(4);
	double totalArea =CalcArea(s);
	System.out.println(totalArea);
	
	}

public static double CalcArea(Shape2[] s) {

	double totalArea=0;
	for (int i = 0; i < s.length; i++) {
	totalArea=totalArea+s[i].area();	
	}
return totalArea;
}
}