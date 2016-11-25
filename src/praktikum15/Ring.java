package praktikum15;

public class Ring {

	Punkt keskpunkt;
	double raadius;

	public Ring(Punkt p, double r) {
		keskpunkt = p;
		raadius = r;

	}

	public String toString() {

		return "Ring(" + keskpunkt + ", raadius " + raadius + ")";
	}

	public double umbermoot() {

		return 2 * Math.PI * raadius;
	}

	public double pindala() {

		return Math.PI * Math.pow(raadius, 2);
	}

}
