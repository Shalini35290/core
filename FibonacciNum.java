package in.co.basics;

public class FibonacciNum {
	public static void main(String[] args) {
		int limit = 10;
		int a= 0, b= 1;
		int c;
		System.out.println(a + "\n" + b);
		for (int i=0; i<limit; i++) {
			c =a+b;
			System.out.println(" " + c);
			a=b;
			b=c;
		}
	}

}
