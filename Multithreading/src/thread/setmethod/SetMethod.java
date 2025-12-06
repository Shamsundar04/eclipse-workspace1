package thread.setmethod;

import java.util.Scanner;

class BatchAssignment extends Thread {

	@Override
	public void run() {
		String thread = Thread.currentThread().getName();
		if (thread != null && thread.equals("placement")) {
			this.placement();
		} else if (thread != null && thread.equals("regular")) {
			this.regular();
		}
	}

	private void regular() {
		System.out.println("Regular batch student Assignment");
	}

	private void placement() {
		System.out.println("Placemetn batch student Assignment");
	}
}

public class SetMethod {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try (sc) {

			System.out.print("Enter your Batch type [Placement/Regular] ");
			String batch = sc.next().trim().toLowerCase();
			BatchAssignment t1 = new BatchAssignment();
			t1.setName(batch);
			t1.start();
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
}
