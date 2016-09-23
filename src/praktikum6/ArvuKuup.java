package praktikum6;

import lib.TextIO;

public class ArvuKuup {
	public static void main(String[] args) {

		System.out.print("Sisesta arv, millest võtta kuup ");
		int arv = TextIO.getlnInt();
		int arvuKuup = Meetodid.kuup(arv);
		System.out.print("Antud arvu kuup on " + arvuKuup);

	}

	

}
