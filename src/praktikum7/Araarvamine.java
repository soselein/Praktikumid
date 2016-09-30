package praktikum7;

import praktikum6.Meetodid;

public class Araarvamine {

	public static void main(String[] args) {

		int arvutiArv = Meetodid.suvalineArv(1, 100);
		int kasutajaArv = Meetodid.kasutajaSisestus(1, 100);

		while (true) {
			kasutajaArv = Meetodid.kasutajaSisestus(1, 100);
			if (arvutiArv == kasutajaArv) {
				System.out.println("GG");
				break;
			} else if (arvutiArv < kasutajaArv)
				System.out.println("Mõeldud arv on väiksem");
			else
				System.out.println("Mõeldud arv on suurem");
		}
	}

}
