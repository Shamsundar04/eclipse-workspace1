package thread.preferable;

class SharedTask implements Runnable {
    int count = 0;

    @Override
    public void run() {
        count++;
        System.out.println(
            Thread.currentThread().getName() +
            " | count = " + count +
            " | object hash = " + this.hashCode()
        );
    }
}

public class RunnableProof {
    public static void main(String[] args) {
        SharedTask task = new SharedTask(); // SINGLE object

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();
    }
}
