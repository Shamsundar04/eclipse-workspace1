//package thread.synchronization;
//
//public class EcommerceOrderProcessing {
//	public static void main(String[] args) {
//		
//		Runnable inventoryCheck = new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("InventoryCheck started...");
//
//				try {
//					Thread.sleep(2000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				System.out.println("InventoryCheck completed!!!");
//			}
//		};
//
//		Runnable paymentProcessing = new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("PaymentProcessing started...");
//				try {
//					Thread.sleep(1500);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				System.out.println("PaymentProcessing completed!!!");
//			}
//
//		};
//
//		Runnable packings = new Runnable() {
//
//			@Override
//			public synchronized void run() {
//				System.out.println("Packaging started...");
//
//				try {
//					Thread.sleep(2000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//
//				System.out.println("Packaging completed!");
//			}
//		};
//
//		Runnable dispatchs = new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("Dispatch started...");
//				try {
//					Thread.sleep(2000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				System.out.println("Dispatch completed!");
//			}
//
//		};
//		
//		try {
//			
//			Thread inventory=new Thread(inventoryCheck);
//			Thread payment=new Thread(paymentProcessing);
//			Thread packing=new Thread(packings);
//			Thread dispatch=new Thread(dispatchs);
//			
//			inventory.start();
//			payment.start();
//			
//			inventory.join();
//			payment.join();
//			
//			packing.start();
//			packing.join();
//			
//			dispatch.start();
//			dispatch.join();
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//
//	}
//}
//
//
//
//
//
//
//









































package thread.synchronization;

class InventoryCheck extends Thread {

	@Override
	public void run() {
		System.out.println("InventoryCheck started...");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("InventoryCheck completed!!!");
	}
}

class PaymentProcessing extends Thread {

	@Override
	public void run() {
		System.out.println("PaymentProcessing started...");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("PaymentProcessing completed!!!");
	}
}

class Packing extends Thread {

	@Override
	public synchronized void run() {
		System.out.println("Packaging started...");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Packaging completed!");
	}
}

class Dispatch extends Thread {

	@Override
	public void run() {
		System.out.println("Dispatch started...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Dispatch completed!");
	}
}

public class EcommerceOrderProcessing {
	public static void main(String[] args) {
		
		try {
			InventoryCheck inventoryCheck=new InventoryCheck();
			PaymentProcessing paymentProcessing=new PaymentProcessing();
			Packing packing=new Packing();
			Dispatch dispatch=new Dispatch();
			
			inventoryCheck.start();
			Thread.sleep(500);
			paymentProcessing.start();
			
			inventoryCheck.join();
			paymentProcessing.join();
			
			packing.start();
			packing.join();
			
			dispatch.start();
			dispatch.join();
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
