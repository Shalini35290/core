package in.co.basics;

public class Shalini {
	
	public static void sum(int a, int b) {
		int c = a+b;
		System.out.println("sum=" + c);
	}
	public static void max(int a, int b) {
		if(a>b) {
			System.out.println("a is greater");
		} 
		else {
			System.out.println("b is greater");
		}
	}
	public static void armstrongnum(int i) {
			int number= 153;
			int n= number;
			int r;
			int sum= 0;
			while(n>0) {
				r= n%10;
				sum= sum+(r*r*r);
				n = n/10;
			}
			if(number==sum) {
				System.out.println("Armstrong number");
			}
			else {
				System.out.println("not armstrong number");
			}
          public static void Arraylength(String[].Arr) {
        	  System.out.println(arr.length);
        	// System.out.println("length ="+ arr.length); 
          }
			
	}
	}

	
	
	
	
	


