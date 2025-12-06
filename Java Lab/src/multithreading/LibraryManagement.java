package multithreading;

class Library {
	private int bookCount = 0;
	private final int MAX_BOOKS = 5;

	public synchronized void addBook() {
		while (this.bookCount == MAX_BOOKS) {
			try {
				System.out.println("Library full. Producer waiting...");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		bookCount++;
		System.out.println("Book added. Total books in library: " + bookCount);
		notify();
	}

	public synchronized void borrowBook() {

		while (this.bookCount == 0) {
			try {
				System.out.println("No books available. Consumer waiting...");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		bookCount--;
		System.out.println("Book borrowed. Remaining books in library: " + this.bookCount);
		notify();
	}
}

class BookProducer extends Thread {
	private Library library;

	public BookProducer(Library library) {
		super();
		this.library = library;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 7; i++) {

			library.addBook();

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}

		System.out.println("Producer finished adding books.");
	}
}

class BookConsumer extends Thread {
	private Library library;

	public BookConsumer(Library library) {
		super();
		this.library = library;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 7; i++) {

			library.borrowBook();

			try {
				Thread.sleep(1200);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		System.out.println("Consumer finished borrowing books.");
	}

}

class LibraryMonitor extends Thread {

	@Override
	public void run() {
		while (true) {
			System.out.println("  \nMonitoring library system...\n");

			try {

				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}

public class LibraryManagement {

	public static void main(String[] args) throws InterruptedException {
		Library library = new Library();

		BookProducer bookProducer = new BookProducer(library);
		bookProducer.setName("Producer");
		bookProducer.setPriority(Thread.MAX_PRIORITY);

		BookConsumer bookConsumer = new BookConsumer(library);
		bookConsumer.setName("Consumer");
		bookConsumer.setPriority(Thread.NORM_PRIORITY);

		LibraryMonitor libraryMonitor = new LibraryMonitor();
		libraryMonitor.setDaemon(true);

		libraryMonitor.start();
		bookProducer.start();
		bookConsumer.start();

		bookProducer.join();
		bookConsumer.join();

		System.out.println("All library operations completed.");

	}

}
