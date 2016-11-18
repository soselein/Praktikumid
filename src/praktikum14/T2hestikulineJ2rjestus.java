package praktikum14;

import java.util.ArrayList;
import java.util.Collections;

public class T2hestikulineJ2rjestus {

	public static void main(String[] args) {
		ArrayList<String> failiRead = FailiLugeja.loeFail("kala.txt");
		System.out.println(failiRead);
		Collections.sort(failiRead);
		System.out.println(failiRead);

	}

}
