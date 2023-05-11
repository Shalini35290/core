package in.co.basics;

public class SumDivisibleBySeven {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 101; i<200; i++) {
			if(i%7 == 0) {
				sum += i;
			}
		}
		System.out.println("sum of all integers between 100 and 200 that are divisible by 7:" + sum);
	}

}
