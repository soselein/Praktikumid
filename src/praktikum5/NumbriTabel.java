package praktikum5;

public class NumbriTabel {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i > 0) {
					
					if (j + i >= 10)
						System.out.print(j + i - 10 + " ");
					else
						System.out.print(j + i + " ");
				}
				
			}
			System.out.print("\n");
		}

	}

}
