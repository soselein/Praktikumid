package praktikum10;

import java.util.ArrayList;
import java.util.Scanner;

public class TulpDiagramm {

	public static void main(String[] args) {

		int suurim = Integer.MIN_VALUE;

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numbrid = new ArrayList<Integer>();

		while (true) {
			System.out.println("Sisesta number diagrammi jaoks.");
			int input = sc.nextInt();

			if (input == 0) {
				break;
			}

			if (suurim < input) {
				suurim = input;
			}
			numbrid.add(input);
		}

		double kordaja = 10.0 / suurim;
		String[] iksid = new String[numbrid.size()];

		for (int i = 0; i < numbrid.size(); i++) {
			iksid[i] = genereeriIksid((int) numbrid.get(i), kordaja);
		}

		for (int j = 9; j >= 0; j--) {
			for (int i = 0; i < iksid.length; i++) {
				if (iksid[i].length() > j) {
					System.out.printf("%2s ", iksid[i].charAt(j));
				}
			}
			System.out.println();
		}
		
		
		System.out.println("-----------");
		for (int i = numbrid.size() - 1; i >= 0; i--) {
			System.out.printf("%2d ", numbrid.get(i));
		}

		if (sc != null) {
			sc.close();
		}
	}

	private static String genereeriIksid(int nr, double kordaja) {
		String iksid = "";
		for (int i = 0; i < nr * kordaja; i++) {
			iksid = iksid + "x";
		}
		return iksid;
	}
}
