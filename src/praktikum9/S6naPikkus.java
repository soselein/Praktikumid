package praktikum9;

import lib.TextIO;

public class S6naPikkus {

	public static void main(String[] args) {

		String[] sonad = new String[10];
		System.out.println("Sisesta 10 sõna, palun.");

		for (int i = 0; i < 10; i++) {
			sonad[i] = TextIO.getlnString();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(sonad[i].length() + " " + sonad[i]);
		}
	}

}
