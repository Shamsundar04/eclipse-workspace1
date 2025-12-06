package in.backend;

public class DebitCard implements Ipayment{

	@Override
	public String pay(double amount) {
		return "Payment success by the DebitCard";
	}

}
