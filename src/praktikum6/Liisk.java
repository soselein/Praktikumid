package praktikum6;

import lib.TextIO;

public class Liisk {
	public static void main(String[] args) {
		System.out.println("Mitu inimest osaleb?");
		int inimesed = TextIO.getlnInt();
		
		for(int i=0; i<10;i++)
		System.out.println("Võitja on " + Meetodid.suvalineArv(1, inimesed));
	}

}
