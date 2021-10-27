package in.co.rays.Collection;

public class Marksheet implements Comparable<Marksheet> {
	public String rollNo;
	public String name;
	public int marks;

	public Marksheet(String r, String n, int m) {
		this.rollNo = r;
		this.name = n;
		this.marks = m;
	}

	public int compareTo(Marksheet m) {
		return rollNo.compareTo(m.rollNo);

	}

	public String toString() {
		return  rollNo + ", " + name + ", " + marks;

	}
}
