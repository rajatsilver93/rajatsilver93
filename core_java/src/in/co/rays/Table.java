package in.co.rays;

public class Table {

	public static void main(String[] args) {
		int T [] [] =new int [10][20];
        for (int i = 0; i < T.length; i++) {
        for (int j = 2; j <= T[i].length; j++) {
        	System.out.print((i+1)*j+ "\t");
			
		}
			
		System.out.println("");
		
	}
	}
}


