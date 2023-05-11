package in.co.basics;

public class CharCount {
	public static void main(String[] args) {
		String name= "Shalini Singh Rajput";
		int count= 0;
		
		for(char C= 'a';C<='z';C++) {
			for(int i=0; i<name.length();i++) {
				if(name.charAt(i)==C) {
					count++;
				}
			}
			//System.out.println(count);
			if(count>=0) {
				System.out.print(C+"= "+count);
				count=0;
			}
		}
		}

}
