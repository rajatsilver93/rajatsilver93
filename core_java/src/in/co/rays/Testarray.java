package in.co.rays;

public class Testarray {

	public static void main(String[] args) {
		/*
		 * char[] Chlist= {'a','b','c','d','e','f','g','h','i'}; for (char A : Chlist)
		 * System.out.println(A);
		 */
		int c,i,j;
	int[][] a=new int[10][10];
	
	for ( i = 0; i < a.length; i++) {
		for (j = 2; j <= a[i].length; j++) {
			System.out.print( (i+1)*j + "\t");
			
		}System.out.println(" ");
	}			

	
	
	
	}

}
