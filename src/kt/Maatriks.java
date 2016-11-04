package kt;

public class Maatriks {

	public static void main(String[] args) {
		int[][] res = muster(9);
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(res[i][j]);
			}
			System.out.println("");
		}

	}

	private static int[][] muster(int n) {
		
		int[][] res = new int [n][n];
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if (i < j) {
					res[i][j] = i;
				} else {
					res[i][j] = j;
				}
			}
		}
		return res;
	}
}
