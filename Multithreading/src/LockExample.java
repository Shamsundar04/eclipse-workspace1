
class ATM {
    synchronized void useATM(String name) {
        System.out.println(name + " entered the ATM");
        try {
            Thread.sleep(2000); // Simulate using ATM
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " left the ATM");
    }
}

public class LockExample {
    public static void main(String[] args) {
        ATM atm = new ATM(); // Shared object (1 lock)

        Thread t1 = new Thread(() -> atm.useATM("Person 1"));
        Thread t2 = new Thread(() -> atm.useATM("Person 2"));

        t1.start();
        t2.start();
    }
}
