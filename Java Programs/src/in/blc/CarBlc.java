package in.blc;

public class CarBlc {

	private String model;
	private int year;
	private double price;

	public CarBlc(String model, int year, double price) {
		setModel(model);
		setYear(year);
		setPrice(price);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		if (model.equals("null") || model.trim().isEmpty()) {
			throw new IllegalArgumentException("Name must me something");
		}
		this.model = model.trim();
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year <= 2010)
			throw new IllegalArgumentException("year must be greater than 2010");
		else
			this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 0)
			throw new IllegalArgumentException("Price must be positive integer");
		else
			this.price = price;
	}

	@Override
	public String toString() {
		return "CarBlc [model=" + model + ", year=" + year + ", price=" + price + "]";
	}
}
