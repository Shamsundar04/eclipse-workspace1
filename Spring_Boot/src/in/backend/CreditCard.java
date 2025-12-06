package in.backend;

public class CreditCard implements Ipayment {

	@Override
	public String pay(double amount) {
		return "Payment success by the CreditCards";
	}

}
