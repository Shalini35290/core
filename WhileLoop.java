package in.co.basics;

public class WhileLoop {
	public static void main(String[] args) {
		int ring = 0;
		boolean start= true;
		while(start) {
			System.out.println("Ringing..."+ring);
			ring++;
			if(ring==10) {
				start=false;
				System.out.println("yor missed the alarm");
			}
		}
	}
	

}
