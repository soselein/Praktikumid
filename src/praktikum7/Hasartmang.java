package praktikum7;

import praktikum6.Meetodid;

public class Hasartmang {
	public static void main(String[] args) {

		int kasutajaRaha = 100;
		System.out.println("0 on kull, 1 on kiri");

		while (kasutajaRaha > 0) {
			System.out.println("Sul on " + kasutajaRaha + "raha");

			int maxPanus = Math.min(25, kasutajaRaha);
			int panus = Meetodid.kasutajaSisestus("Sisesta panus, maksimaalne on " + maxPanus, 1, maxPanus);

			kasutajaRaha -= panus;
			int kullKiri = Meetodid.suvalineArv(0, 1);

			if (kullKiri == 1) {
				kasutajaRaha += 2 * panus;
				System.out.println("Tuli kiri, võitsid just " + 2 * panus);
			} else
				System.out.println("Tuli kull, kaotasid just " + panus);

		}
		System.out.println("Mäng läbi, raha otsas");
	}

}
