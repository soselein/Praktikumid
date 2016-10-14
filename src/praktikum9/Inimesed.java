package praktikum9;

import java.util.ArrayList;

import lib.TextIO;

public class Inimesed {

	public static void main(String[] args) {

		ArrayList<Inimene> inimesed = new ArrayList<Inimene>();
		System.out.println("Sisestage inimeste andmeid, kui rohkem ei taha sisestada, jätke nimi tühjaks");
		while (true) {
			System.out.println("Palun sisesta nimi.");
			String nimi = TextIO.getlnString();
			System.out.println("Palun sisesta vanus.");
			int vanus = TextIO.getlnInt();
			inimesed.add(new Inimene(nimi, vanus));
			if (nimi.equals(""))
				break;
		}

		for (Inimene inimene : inimesed) {
			inimene.tervita();
		}

	}

}
