package praktikum5;

import lib.TextIO;

public class Tabel {
	public static void main(String[] args) {

		System.out.printf("Kui suur tuleb tabel? ");
		int x = TextIO.getlnInt();
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				if (i == j)
					System.out.print("1");
				else
					System.out.print("0");

			}
			System.out.print("\n");
		}

	}

}
