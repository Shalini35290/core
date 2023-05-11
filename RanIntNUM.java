package in.co.basics;

import java.util.Random;

public class RanIntNUM {
	public static void main(String[] args) {
		Random random= new Random();
		int [] numbers= new int[5];
		
		for(int i=0; i<5; i++) {
			numbers[i] = random.nextInt(100)+1;
			//i++;
		}
		System.out.println("5 random numbers between 1 to 100");
		for(int i=0; i<5; i++) {
			System.out.println(numbers[i]);
		}

	}

}
