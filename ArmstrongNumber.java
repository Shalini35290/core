package in.co.basics;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int number= 153;
		int n= number;
		int r;
		int sum= 0;
		while(n>0) {
			r= n%10;
			sum= sum+(r*r*r);
			n= n/10;
		}
		if(number==sum){
			System.out.println("Armstrong Number");
		}
		
		else {	System.out.println("Not Armstrong Number");
	}
	}
}
