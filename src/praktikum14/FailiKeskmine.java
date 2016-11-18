package praktikum14;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class FailiKeskmine {

	public static void main(String[] args) {
		ArrayList<String> failiSisu = FailiLugeja.loeFail("numbrid.txt");
		System.out.println(failiSisu);

		ArrayList<Double> numbrid = teeNumbriteks(failiSisu);
		System.out.println(numbrid);
		System.out.println(keskmine(numbrid));
	}

	public static ArrayList<Double> teeNumbriteks(ArrayList<String> read) {
		ArrayList<Double> numbrid = new ArrayList<Double>();

		for (String rida : read) {
			try {
				double nr = Double.parseDouble(rida);
				numbrid.add(nr);

			} catch (NumberFormatException e) {
				System.out.println("Failis pole ainult arvud: \n" + e.getMessage());
			} catch (Exception e) {
				System.out.println("Error, jee, mingi muu error: " + e.getMessage());
			}
		}
		return numbrid;
	}
	
	public static Double keskmine(ArrayList<Double>numbrid){
		int i=0;
		double summa = 0;
		for(Double number: numbrid){
			i++;
			summa += number;
		}
		Double keskmine = summa/i;
		
		return keskmine;
	}

}
