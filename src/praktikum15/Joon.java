package praktikum15;

public class Joon {

	Punkt algus, lopp;

	public Joon(Punkt p1, Punkt p2) {
		algus = p1;
		lopp = p2;

	}

	@Override
	public String toString() {

		return "Joon " + algus + " --- " + lopp;
	}

	public double pikkus() {

		double a = lopp.x - algus.x;
		double b = lopp.y - algus.y;
		return Math.pow(Math.pow(a, 2) + Math.pow(b, 2), 0.5);
	}
}
