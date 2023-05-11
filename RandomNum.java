package in.co.basics;

public class RandomNum {
public static void main(String[] args) {
	
	for (int i = 0; i < 9; i++) {
		int a = (int)(Math.random()*10000);
		
		System.out.println(a);
	}
	
}
}
