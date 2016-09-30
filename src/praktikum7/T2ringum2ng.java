package praktikum7;

import praktikum6.Meetodid;

public class T2ringum2ng {
	public static void main(String[] args) {

		int kasutajaRaha = 100;

		while (kasutajaRaha > 0) {
			System.out.println("Sul on " + kasutajaRaha + "raha");

			int pakkumine = Meetodid.kasutajaSisestus(1, 6);
			int panus = Meetodid.kasutajaSisestus("Sisesta panus, maksimaalne on " + kasutajaRaha, 1, kasutajaRaha);

			kasutajaRaha -= panus;
			int t2ringuVise = Meetodid.suvalineArv(1, 6);
			System.out.println("Sina arvasid " + pakkumine + " täringul tuli " + t2ringuVise + " silma");
			
			if (t2ringuVise == pakkumine) {
				kasutajaRaha += 6 * panus;
				System.out.println("Ennustasid õigesti, võitsid just " + 6 * panus);
			} else
				System.out.println("Ennustasid valesti, kaotasid just " + panus);

		}
		System.out.println("Mäng läbi, raha otsas");
	}
}
