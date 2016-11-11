package praktikum13;

public class Methods {

	public static void main(String[] args) {

		int[][] neo = { { 1, 1, 1, 1, 1 }, 
						{ 2, 3, 4, 5, 6 },
						{ 3, 4, 5, 6, 7 },
						{ 4, 5, 6, 7, 8 },
						{ 5, 6, 7, 8, 9 }, 
						};

		int[] paleo = { 1, 8, 9, 4, 7, 2 };

	}

	// Trükib ühemõõtmelise täisarvumassiivi elemendid
	public static void tryki(int[] massiiv) {
		for(int arv : massiiv){
			System.out.print(arv + " ");
		}
	}

	// Trükib maatriksi elemendid
	public static void tryki(int[][] maatriks) {
		for(int[] rida : maatriks){
			tryki(rida);
			System.out.println("");
		}
	}

	// Arvutab iga rea elementide summa
	public static int[] ridadeSummad(int[][] maatriks) {
		int[] ridadeSummad = new int[maatriks.length];
		for (int i = 0; i < maatriks.length; i++) {
			for (int j = 0; j < maatriks.length; j++) {
				ridadeSummad[i] += maatriks[i][j];
			}
		}
		return ridadeSummad;
	}

	// Arvutab kõrvaldiagonaali elementide summa
	public static int korvalDiagonaaliSumma(int[][] maatriks) {
		int korvalDiagonaaliSumma = 0;
		for (int i = 0; i < maatriks.length; i++) {
			for (int j = 0; j < maatriks.length; j++) {
				if (i + j == maatriks.length - 1) {
					korvalDiagonaaliSumma += maatriks[i][j];
				}
			}
		}
		return korvalDiagonaaliSumma;
	}

	// Leiab iga rea suurima elemendi
	public static int[] ridadeMaksimumid(int[][] maatriks) {
		int[] ridadeMaksimumid = new int[maatriks.length];
		for (int i = 0; i < maatriks.length; i++) {
			for (int j = 0; j < maatriks.length; j++) {
				if (j == 0) {
					ridadeMaksimumid[i] = maatriks[i][j];
				}
				if (ridadeMaksimumid[i] < maatriks[i][j]) {
					ridadeMaksimumid[i] = maatriks[i][j];
				}
			}
		}
		return ridadeMaksimumid;
	}

	/*
	 * Genereerib etteantud suurusega maatriksi, iga element on indeksite summa
	 * 2-ga jagamise jääk
	 */
	public static int[][] kahegaJaakMaatriks(int ridu, int veerge) {
		int[][] kahegaJaakMaatriks = new int[ridu][veerge];
		for (int i = 0; i < ridu; i++) {
			for (int j = 0; j < veerge; j++) {
				kahegaJaakMaatriks[i][j] = (i + j) % 2;
			}
		}
		return kahegaJaakMaatriks;
	}
	
	

}
