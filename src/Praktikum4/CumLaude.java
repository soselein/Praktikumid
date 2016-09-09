package Praktikum4;

import lib.TextIO;

public class CumLaude {
	public static void main(String[] args) {

		double keskHinne;
		double lopuHinne;

		System.out.printf("Sisesta oma keskmine hinne ");
		keskHinne = TextIO.getlnDouble();
		System.out.printf("Sisesta oma lõputöö hinne ");
		lopuHinne = TextIO.getlnDouble();

		if (keskHinne >= 4.5 && lopuHinne == 5 && keskHinne <= 5)
			System.out.printf("Jah saad cum laude diplomile!");
		else if (keskHinne > 5 || lopuHinne > 5 || keskHinne < 0 || lopuHinne < 0)
			System.out.printf("!VEATEADE!");
		else
			System.out.printf("Ei saa!");

	}

}
