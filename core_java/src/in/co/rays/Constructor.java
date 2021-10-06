package in.co.rays;

public class Constructor {
public int a1;
//public int a2;
	public Constructor() {
		System.out.println("default constructor");
	
		
	}
	public Constructor(int x,  int y) {
		a1=x+y;
		//a2=y;
		//System.out.println(x+y);
	}
	

	public static void main(String[] args) {
		Constructor c=new Constructor(5,6);
		System.out.println(c.a1);
		

	}

}