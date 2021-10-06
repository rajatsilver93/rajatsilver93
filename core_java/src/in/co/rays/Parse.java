package in.co.rays;

public class Parse {

	public static void main(String[] args) {
		String s1= "10";
		String s2="20";
		String s3="5.5";
		String s4="6.23f";
		char h='A';
		int t=(int)h;
		System.out.println(t);
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		double d=Double.parseDouble(s3);
		float f=Float.parseFloat(s4);
		System.out.println(a+b);
		System.out.println(d);
		System.out.println(f);
	}

}
