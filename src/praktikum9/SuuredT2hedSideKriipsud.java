package praktikum9;

import lib.TextIO;
import praktikum6.Meetodid;

public class SuuredT2hedSideKriipsud {

	public static void main(String[] args) {

		System.out.println("Palun sisesta sõna.");
		String sona = TextIO.getlnString();

		sona = Meetodid.suuredTahedSideKriips(sona);

	}

}
