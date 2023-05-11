package in.co.basics;

public class ReverseNameOnTheirPlaces {
	public static void main(String[] args) {
		String name = "Yoga Of Immortals";
		String[] S = name.split(" ");
		for(String a : S) {
			for(int i= a.length()-1; i>=0;i--) {
				//System.out.print(a.charAt(i));
				
			}
			System.out.print(" ");
		}
		
		
	}

}
