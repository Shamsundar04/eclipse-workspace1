class GameLoop extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getClass().getName());
	}
}

class EnemyAI extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getClass().getName());
	}
}

class BackgroundMusic extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getClass().getName());
	}
}

public class MultiThreadedGame {
	public static void main(String[] args) {
		new GameLoop().start();
		new EnemyAI().start();
		new BackgroundMusic().start();
	}
}