package in.co.basics;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalenderConvPract {
	

	public static void main(String[] args) {
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		Date today= new Date();
		Calendar cal= Calendar.getInstance();
		cal.setTime(today);
		cal.add(Calendar.DATE, 2);
		//System.out.println(cal.getTime());
		for(int i= 1; i<=12;i++) {
			cal.add(Calendar.DATE, 30);
			System.out.println(sdf.format(cal.getTime()));
		}
	}

}
