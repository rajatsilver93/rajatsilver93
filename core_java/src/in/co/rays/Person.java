package in.co.rays;

public class Person {
	public String Name;
	public String DOB;
	public String Adress;
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	public static void main(String[] args) {
		Person s=new Person();
		s.setName("rajat");
		s.setDOB("30/01/1993");
		s.setAdress("indore");
		System.out.println(s.getName());
		System.out.println(s.getDOB());
		System.out.println(s.getAdress());
}

}







