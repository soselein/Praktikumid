package praktikum6;

import lib.TextIO;

public class Meetodid {

	public static int kuup(int arv) {
		return (int) Math.pow(arv, 3);

	}

	public static int kasutajaSisestus(int min, int max) {
		while (true) {
			int sisestus = TextIO.getlnInt();
			if (sisestus >= min && sisestus <= max)
				return sisestus;
			else
				System.out.println("ei sobi");
		}
	}

	public static int kasutajaSisestus(String kysimus, int min, int max) {
		System.out.println(kysimus);
		return kasutajaSisestus(min, max);

	}

	public static int suvalineArv(int min, int max) {
		int vahemik = max - min + 1;
		return min = (int) (Math.random() * vahemik);
	}
}
