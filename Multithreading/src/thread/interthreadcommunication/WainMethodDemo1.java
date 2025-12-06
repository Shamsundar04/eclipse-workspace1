package thread.interthreadcommunication;

class TotalEarning extends Thread{
	
	int totalEarn;
	@Override
	public synchronized void run() {
		for(int i=1;i<=5;i++) {
			totalEarn+=100;
		}
		
		notify();
	}
}

public class WainMethodDemo1 {
	public static void main(String[] args) throws InterruptedException {
		TotalEarning t1=new TotalEarning();
		t1.start();
		
		synchronized (t1) {
			t1.wait();
		}
		System.out.println(t1.totalEarn);
	}
}
