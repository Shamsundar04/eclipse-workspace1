package thread.volatilekeyword;

public class VolatileExampleDemo1 {

	private boolean flag = false;

	public void setTrue() {
		System.out.println("Writer therad made the thread true");
		flag = true;
	}

	public void printIfThreadTrue() {
		while (!flag) {
		}
		System.out.println("Flag is true !");
	}

	public static void main(String[] args) throws InterruptedException {
		VolatileExampleDemo1 obj = new VolatileExampleDemo1();

		Thread t1 = new Thread(() -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			obj.setTrue();
		});

		Thread t2 = new Thread(() -> obj.printIfThreadTrue());

		t1.start();
		t2.start();
	}
}
