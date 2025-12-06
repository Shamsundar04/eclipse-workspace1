package thread.synchronization;

class TicketBooking implements Runnable {
    private int totalTicket = 5;

    public synchronized void acceptTicket(int n) {
        String name = Thread.currentThread().getName();
        if (totalTicket >= n) {
            System.out.println(name + " is trying to book a ticket...");
            totalTicket -= n;
            System.out.println(name + " booked 1 seat successfully! Seats left: " + totalTicket);
            try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        } else {
            System.out.println("Sorry " + name + ", no seats available!");
        }
    }

    @Override
    public void run() {
        acceptTicket(1);
    }
}

public class OnlineTicketBookingSystem {
    public static void main(String[] args) {

        TicketBooking ticketBooking = new TicketBooking();

        Thread t1 = new Thread(ticketBooking, "User-1");
        Thread t2 = new Thread(ticketBooking, "User-2");
        Thread t3 = new Thread(ticketBooking, "User-3");
        Thread t4 = new Thread(ticketBooking, "User-4");
        Thread t5 = new Thread(ticketBooking, "User-5");
        Thread t6 = new Thread(ticketBooking, "User-6"); // extra user to test sold out

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
