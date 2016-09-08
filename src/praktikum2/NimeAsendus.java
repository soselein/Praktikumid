package praktikum2;

import lib.TextIO;

public class NimeAsendus {
	public static void main(String[] args) {

		System.out.printf("Sisesta tekst ");
		String tekst = TextIO.getln();

		String uusTekst = tekst.replace('a', '_');
		System.out.println(uusTekst);

	}

}
