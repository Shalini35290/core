package in.co.basics;

import java.text.SimpleDateFormat;
import java.util.Date;



public class DatePrac {
	public static void main(String[] args) {
	Date today= new Date();
	//System.out.println(today);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
 String S = sdf.format(today);
 System.out.println(S);

		
	}

}
