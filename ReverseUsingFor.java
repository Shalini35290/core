package in.co.basics;

public class ReverseUsingFor {
	public static void main(String[] args) {
		String name= "vijay dinanath chouhan";
		for(int i=name.length()-1; i>=0; i--){
			System.out.print(name.charAt(i));
		}
	}

}
