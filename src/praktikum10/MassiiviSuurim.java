package praktikum10;

public class MassiiviSuurim {

	public static void main(String[] args) {

		int[][] neo = {
			    {1, 3, 6, 7},
			    {2, 3, 3, 1},
			    {17, 4, 5, 0},
			    {-20, 13, 16, 17}
			};
		
		int suurim = getSuurim(neo);
		System.out.println("Suurim element massiivis on " + suurim);
	}

	private static int getSuurim(int[][] neo) {
		int suurim = Integer.MIN_VALUE;

		for (int i = 0; i < neo.length; i++) {
			for (int j = 0; j < neo.length; j++) {
				if (suurim < neo[i][j])
					suurim = neo[i][j];
			}
		}
		return suurim;
	}

}
