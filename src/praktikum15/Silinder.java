package praktikum15;

public class Silinder extends Ring {

	double korgus;

	public Silinder(Ring r, double h) {
		super(r.keskpunkt, r.raadius);
		korgus = h;
	}

	public String toString() {

		return "Silinder(Raadius " + raadius + ", kõrgus " + korgus + ")";
	}

	public double pindala() {

		return 2 * super.pindala() + super.umbermoot() * korgus;
	}

	public double ruumala() {

		return super.pindala() * korgus;
	}

}
