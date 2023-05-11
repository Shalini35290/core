package in.co.basics;

public class StringBuff {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("shalini");
		sb.append("sonali");
		System.out.println("length"+sb.length());
		System.out.println("7th character is "+sb.charAt(6));
		System.out.println("halin index is " +sb.indexOf("halin"));
		System.out.println("first s position of "+ sb.indexOf("s"));
		System.out.println("Last a position of "+ sb.indexOf("a"));
		System.out.println("replace "+ sb.replace(5, 6, "sona"));
		System.out.println("ends with ini "+ sb.indexOf("ini"));
		System.out.println("ends with ali "+ sb.indexOf("ali"));
		System.out.println("reverse "+ sb.reverse());
		
	
}

}
