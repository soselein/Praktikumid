package praktikum8;

import java.util.ArrayList;
import java.util.Collections;
import lib.TextIO;

public class T2hestikuJ2rjekord {
	public static void main(String[] args) {
		System.out.println("Sisesta nimed ");

		ArrayList<String> Nimed = new ArrayList<String>();
		System.out.println("Sisesta nimesid, peatamiseks vajuta enterit");
		while (true) {
			String nimi = TextIO.getln();
			if (nimi.equals("")) {
				break;
			}
			Nimed.add(nimi);
		}
		Collections.sort(Nimed);
		for (String nimi : Nimed) {
			System.out.println(nimi);
		}

	}

}
