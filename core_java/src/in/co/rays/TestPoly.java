package in.co.rays;

public class TestPoly {
public static void main(String[] args) {
	Testshape[] s=new Testshape[3];
	s[0]=new Circle(2);
	s[1]=new Rectangle(2,2);
	s[2]=new Triangle(3,2);
	double TotalArea=CalArea(s);
	System.out.println("Total area is "+TotalArea);
	
}
public static double CalArea(Testshape[] s) {
	double TotalArea=0;
	for(int i=0;i<s.length;i++) {
		TotalArea +=s[i].area();
	}
	return TotalArea;
		
	
}
}
