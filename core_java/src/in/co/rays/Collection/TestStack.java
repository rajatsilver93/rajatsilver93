package in.co.rays.Collection;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		Stack a = new Stack();
		a.push("Rajat");
		a.push("Sonu");
		a.push("Vinay");
		System.out.println(a);

	a.pop();
	a.pop();
	a.pop();
	a.push(9);
	System.out.println(a);
	}

}
