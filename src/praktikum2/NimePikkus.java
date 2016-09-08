package praktikum2;

import lib.TextIO;

public class NimePikkus {
	public static void main(String[] args) {

		String nimi;
		System.out.printf("Sisesta nimi ");
		nimi = TextIO.getln();
		int nimePikkus = nimi.length();
		System.out.printf("Nime pikkus on " + nimePikkus + " tähte");
	}

}
