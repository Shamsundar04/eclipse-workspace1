package in.backend;

public class Test {

	 static public void main(String[] args) {
		
		BillCollector bc=new BillCollector();
		bc.setPayment(new DebitCard());
		bc.collectPayment(400);
	}
}