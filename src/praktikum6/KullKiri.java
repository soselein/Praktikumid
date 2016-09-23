package praktikum6;

public class KullKiri {

	public static void main(String[] args) {

		int kasutajaArvamus = Meetodid.kasutajaSisestus("Kull (0) või kiri (1)? ", 0, 1);
		int myndiVise = Meetodid.suvalineArv(0, 1);

		System.out.println("Kasutaja sisestas: " + kasutajaArvamus);
		System.out.println("Arvuti mündivise: " + myndiVise);

		if (myndiVise == kasutajaArvamus)
			System.out.println("Congratzzz");
		else
			System.out.println("Tough luck");

	}

}
