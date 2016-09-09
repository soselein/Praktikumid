package Praktikum4;

import lib.TextIO;
public class Vanused {
	public static void main(String[] args) {
		
		int yksVanus;
		int teineVanus;
		int vahetus;
		
		System.out.printf("Sisesta esimene vanus ");
		yksVanus = TextIO.getlnInt();
		System.out.printf("Sisesta teine vanus ");
		teineVanus = TextIO.getlnInt();
		
		if (teineVanus>yksVanus){
			vahetus = yksVanus;
			yksVanus = teineVanus;
			teineVanus = vahetus;
		}

		if (yksVanus-teineVanus>10)
			System.out.printf("WTF!?");
		else if (yksVanus-teineVanus>5)
			System.out.printf("Nasty!");
		else
			System.out.printf("Norm");
	}

}
