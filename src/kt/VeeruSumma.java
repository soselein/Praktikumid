package kt;

public class VeeruSumma {
	public static void main(String[] args) {
		int[] res = veeruSummad(new int[][] { { 1, 2, 3 }, { 4, 5, 6 } }); // {5,
																			// 7// 9}
		
	}

	public static int[] veeruSummad(int[][] m) {
		int suurus = 0;
		
		for (int i = 0; i < m.length; i++) {
			if (suurus < m[i].length) {
				suurus = m[i].length;
			}
		}
		int[] veeruSummad = new int[suurus];
		for(int i = 0; i<suurus; i++){
			for(int j =0; j<suurus; j++){
				veeruSummad[i] = m[i][j];
			}
		}
		
		return veeruSummad;
	}
}
