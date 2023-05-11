package in.co.basics;

public class ReverseName {

	public static void main(String[] args) {
		String Name = "yoga of immortals";
		//String[]S = Name.split(" ");
		//System.out.println(S[0]);
		//System.out.println(S[1]);
		//System.out.println(S[2]);
		for(int i = Name.length()-1;i>=0; i--) {
			System.out.print(Name.charAt(i));
			
		}
	
}
}
