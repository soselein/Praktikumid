package praktikum7;

import lib.TextIO;

public class Tagurpidi {
	public static void main(String[] args) {
		System.out.println("Sisesta sõna ");
		String s6na = TextIO.getlnWord();
		System.out.println(tagurpidi(s6na));

	}

	public static String tagurpidi(String oigetpidi) {
		String tagurpidi = "";
		for (int i = oigetpidi.length() - 1; i >= 0; i--) {
			System.out.println(oigetpidi.charAt(i));
			tagurpidi += oigetpidi.charAt(i);
		}
		return tagurpidi;
	}
}
