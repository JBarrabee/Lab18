
public class Car {
	private String make;
	private String model;
	private int year;
	private double price;

	public Car(String m, String mm, int y, double p) {
		make = m;
		model = mm;
		year = y;
		price = p;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param make
	 *            the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @param model
	 *            the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @param year
	 *            the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	// carList.get(1).setMake("Fiat");
	// carList.get(1).setModel("Spyder");
	// carList.get(1).setYear(2017);
	// carList.get(1).setPrice(29999.50);

}
