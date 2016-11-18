package praktikum14;

import java.util.ArrayList;

public class TransponeeriMaatriks {

	public static void main(String[] args) {
		int[][] maatriks = new int[10][10];
		maatriks = loeMaatriks("Maatriks.txt");
	}

	private static int[][] loeMaatriks(String failiNimi) {
		ArrayList<String> failiRead = FailiLugeja.loeFail(failiNimi);
		for (String rida : failiRead) {
			String[] elemendid = rida.split(" ");
		
		}
		return null;	
	}

}
