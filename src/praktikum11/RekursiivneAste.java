package praktikum11;

public class RekursiivneAste {

	public static void main(String[] args) {

		int vastus = astenda(2, 4);
		System.out.println(vastus);

	}

	private static int astenda(int arv, int aste) {
		if (aste == 1) {
			return arv;
		} else
			return arv*astenda(arv, aste - 1);

	}

}
