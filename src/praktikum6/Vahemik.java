package praktikum6;

import lib.TextIO;

public class Vahemik {
	public static void main(String[] args) {

		System.out.println("Sisesta vahemiku miinimum- ja siis maksimumkoht ");

		int min = TextIO.getlnInt();
		int max = TextIO.getlnInt();
		int minmax = Meetodid.kasutajaSisestus(min, max);
		System.out.println("Sisestatud arv " + minmax);
	}

}
