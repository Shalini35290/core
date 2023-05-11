package in.co.basics;

public class MultiplicationTableArr {
	public static void main(String[] args) {
	int[][] table = new int[9][10];
	for(int i = 0; i<9; i++) {
		for(int j =0; j<10; j++) {
			table[i][j]= (i+2) *(j+1);
		}
	}
	//display the array
	for(int i = 0; i<9; i++) {
		for(int j = 0; j<10;j++) {
			System.out.print( table[i][j]);
		}
		System.out.println();
	}
	}

}
