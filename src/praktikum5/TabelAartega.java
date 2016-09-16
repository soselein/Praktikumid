package praktikum5;

import lib.TextIO;

public class TabelAartega {
	public static void main(String[] args) {

		System.out.printf("Kui suur tuleb tabel? ");
		int x = TextIO.getlnInt();

		for (int i = 0; i < x; i++)
			System.out.print(" -");
		System.out.print("\n");
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				if (j == 0)
					System.out.print("| ");
				if (i == j || i + j == x - 1)
					System.out.print("x ");
				else
					System.out.print("0 ");
				if (j == x - 1)
					System.out.print("|");

			}
			System.out.print("\n");
		}

		for (int i = 0; i < x; i++)
			System.out.print(" -");
	}

}
