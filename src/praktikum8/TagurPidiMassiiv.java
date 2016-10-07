package praktikum8;

import lib.TextIO;

public class TagurPidiMassiiv {
	public static void main(String[] args) {

		int[] arvud = new int[10];

		for (int i = 0; i < arvud.length; i++) {
			System.out.println("Sisesta " + i + ". arv ");
			arvud[i] = TextIO.getlnInt();
		}
		System.out.println("Massiiv tagurpidi on ");
		for (int i = arvud.length-1; i >= 0; i--) {
			System.out.print(arvud[i] + "; ");
		}
	}

}
