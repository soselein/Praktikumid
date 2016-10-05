package intro;

import lib.TextIO;

public class Grade {

	public static void main(String[] p) {
		double percent;
		while (true) {
			System.out.print("Input percentage: ");
			percent = TextIO.getlnDouble();
			System.out.print(percent + ": ");
			System.out.println(grade(percent));
		} // while
	} // main

	public static String grade(double d) {
		String grade = "not defined";
		if (d < 0 || d > 150)
			throw new IllegalArgumentException("protsent liiga suur või väike " + d);
		if (d <= 50)
			return "fail";
		if (d > 50 && d <= 60)
			return "sufficient";
		if (d > 60 && d <= 70)
			return "satisfactory";
		if (d > 70 && d <= 80)
			return "good";
		if (d > 80 && d <= 90)
			return "very good";
		if (d > 90 && d <= 150)
			return "excellent";
		return grade;
	}
}
