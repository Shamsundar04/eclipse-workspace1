package in.blc;

public class Car {

	int carNo;
	String carName;
	double carPrice;

	public void setCarData(int carNo, String carName, double carPrice, Car car) {
		this.carNo = carNo;
		this.carName = carName;
		this.carPrice = carPrice;

		car.getCarData();
	}

	public void getCarData() {
		System.out.println(carNo);
		System.out.println(carName);
		System.out.println(carPrice);
	}
}
