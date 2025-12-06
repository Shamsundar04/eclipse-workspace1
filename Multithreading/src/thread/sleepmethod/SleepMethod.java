package thread.sleepmethod;

class SleepThread extends Thread{
	@Override
	public void run() {
		
		for(int i=1;i<=5;i++) {
			System.out.println("i value is : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
	}
}

public class SleepMethod {
	public static void main(String[] args) throws InterruptedException {
		
		SleepThread t1=new SleepThread();
		SleepThread t2=new SleepThread();
		t1.start();
		t2.start();
		System.out.println("Main() ended");
	}
}