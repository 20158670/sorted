package sorted;

public class Exercise4 {

	public static void main(String[] args) {
		int[][] a = new int[3][4];
		for (int row = 0; row<a.length; row++){
			for (int col = 0; col<a[row].length; col++){
				a[row][col] = row + col;
			}
		}
		for (int i = 0; i<a.length; i++){
			System.out.print("Player " + (i+1) + " ");
			for (int j = 0; j<a[0].length; j++){
				System.out.print("|" + a[i][j]);				
			}
			System.out.println("|");
		}
	}

}
