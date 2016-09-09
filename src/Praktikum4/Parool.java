package Praktikum4;

import lib.TextIO;

public class Parool {
	public static void main(String[] args) {

		String vanaParool = "parool123";
		String uusParool;

		System.out.printf("Sisesta uus parool ");
		uusParool = TextIO.getln();
		if (vanaParool.equals(uusParool))
			System.out.printf("Õige parool");
		else
			System.out.printf("Vale parool");

	}
}