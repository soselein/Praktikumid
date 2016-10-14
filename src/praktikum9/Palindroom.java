package praktikum9;

import lib.TextIO;
import praktikum6.Meetodid;

public class Palindroom {

	public static void main(String[] args) {
		System.out.println("Sisesta palindroom kontrolliks.");
		String sona = TextIO.getlnString();
		String tagurpidisona = Meetodid.tagurpidi(sona);
		System.out.println(onPalindroom(sona, tagurpidisona));

	}

	public static boolean onPalindroom(String sona, String tagurpidisona) {
		return sona.equals(tagurpidisona);
	}
}
