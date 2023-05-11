package in.co.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestSimpleDateConv {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String S = "18/04/2023";
		Date today= new Date();
		Calendar cal= Calendar.getInstance();
		cal.setTime(today);
		cal.setTime(sdf.parse(S));
		for(int i=1;i<=2;i++) {
			cal.add(Calendar.DATE,30);
			System.out.println(cal.getTime());
		}
				
		
	}

}
