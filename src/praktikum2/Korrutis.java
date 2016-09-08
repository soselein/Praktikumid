package praktikum2;

import lib.TextIO;

public class Korrutis {
	public static void main(String[] args) {

		double esimeneTegur;
		double teineTegur;
		double korrutis;

		System.out.printf("Sisesta kaks tegurit ");
		esimeneTegur = TextIO.getlnDouble();
		teineTegur = TextIO.getlnDouble();
		korrutis = esimeneTegur * teineTegur;
		System.out.printf("Nende korrutis on " + korrutis);
	}
}