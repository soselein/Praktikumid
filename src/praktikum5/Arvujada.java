package praktikum5;

public class Arvujada {
	public static void main(String[] args) {
		// lihtsalt 10st 1ni
		for (int i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}

		System.out.print("\n");
		// 0st 10ni paarisarvud
		for (int j = 0; j <= 10; j++) {
			if (j % 2 == 0)
				System.out.print(j + " ");
		}

		System.out.print("\n");
		// 30st alla kõik kolmega jaguvad arvud
		for (int k = 30; k > 0; k--) {
			if (k % 3 == 0)
				System.out.print(k + " ");
		}

	}

}
