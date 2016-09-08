package praktikum2;

import lib.TextIO;

public class Grupp {
	public static void main(String[] args) {

		int inimesteArv;
		int grupiSuurus;
		int grupiArv;
		int ilmaGrupita;

		System.out.printf("Sisesta inimeste arv ");
		inimesteArv = TextIO.getlnInt();
		System.out.printf("Sisesta grupi suurus ");
		grupiSuurus = TextIO.getlnInt();
		grupiArv = inimesteArv / grupiSuurus;
		ilmaGrupita = inimesteArv % grupiSuurus;
		System.out.printf("Gruppe tuleb " + grupiArv + " üle jääb " + ilmaGrupita);
	}

}
