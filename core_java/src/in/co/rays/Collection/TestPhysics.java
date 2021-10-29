package in.co.rays.Collection;

import java.util.Comparator;

public class TestPhysics implements Comparator<Marksheet1> {

	@Override
	public int compare(Marksheet1 o1, Marksheet1 o2) {
		
		return o1.getPhy()-o2.getPhy();
	}

}
