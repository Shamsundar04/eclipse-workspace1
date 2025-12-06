package thread.synchronization;

class Table {

    // 🔒 Static synchronized method
    synchronized static void printTable(int n) {
        String name = Thread.currentThread().getName();
        System.out.println("Running by: " + name);

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("----------------------------------");
    }
}

// Runnable implementation for each thread
class MyThread1 implements Runnable {
    int number;

    MyThread1(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        Table.printTable(number); // static synchronized call
    }
}

public class StaticSynchronization {
    public static void main(String[] args) {

        // Create 4 Runnable objects with different tables
        MyThread1 t1 = new MyThread1(5);
        MyThread1 t2 = new MyThread1(7);
        MyThread1 t3 = new MyThread1(9);
        MyThread1 t4 = new MyThread1(12);

        // Create 4 threads and give them names
        Thread th1 = new Thread(t1, "Thread-A");
        Thread th2 = new Thread(t2, "Thread-B");
        Thread th3 = new Thread(t3, "Thread-C");
        Thread th4 = new Thread(t4, "Thread-D");

        // Start all threads
        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }
}
