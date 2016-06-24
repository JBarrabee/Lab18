
public class UsedCar extends Car {

	private int miles;

	public UsedCar(String m, String mm, int y, double p, int mmm) {
		super(m, mm, y, p);

		miles = mmm;

	}

	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}
}
