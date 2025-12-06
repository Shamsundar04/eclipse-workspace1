package in.backend;

public class AmexCard implements Ipayment{

	@Override
	public String pay(double amount) {
		return "Payment successful through AmexCard";
	}
}
