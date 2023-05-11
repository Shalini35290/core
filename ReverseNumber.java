package in.co.basics;

public class ReverseNumber {
	public static void main(String[] args) {
		int number= 153;
		int n= number;
		int r;
		int sum= 0;
		while(n>0) {
			r= n%10;
			sum= sum*10+r;
			n= n/10;
		}
		System.out.println(sum);
	}
}
