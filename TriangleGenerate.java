package in.co.basics;

public class TriangleGenerate {
	public static void main(String[] args) {
		int rows = 4;
		//Generate the triangle
		for(int i = 1; i<=rows;i++) {
			for(int j = 1; j<=i;j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
	}

}
