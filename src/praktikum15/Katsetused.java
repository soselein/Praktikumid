package praktikum15;

public class Katsetused {

	public static void main(String[] args) {
	 
		Punkt p1 = new Punkt(1,3);
		Punkt p2 = new Punkt(5,7);
		System.out.println(p1);
		System.out.println(p2);
		
		Joon j = new Joon(p1, p2);
		System.out.println(j);
		System.out.println("Joone pikkus on: " + j.pikkus());
		
		Ring r = new Ring(p1, j.pikkus());
		System.out.println(r);
		System.out.println("Ringi ümbermõõt on " + r.umbermoot());
		System.out.println("Ringi pindala on " + r.pindala());
		
		Silinder s = new Silinder(r, 15);
		System.out.println(s);
		System.out.println("Silindri pindala on " + s.pindala());
		System.out.println("Silindri ruumala on " + s.ruumala());

	}

}
