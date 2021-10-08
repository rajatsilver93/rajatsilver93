package in.co.rays;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateFormat {

	public static void main(String[] args) throws ParseException {
		Date d= new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MMM/yyyy"  +" hh:mm:ss");
		String s =format.format(d);
		System.out.println(s);

		Date d1 = format.parse(s);
		System.out.println(d1);

	}

}
