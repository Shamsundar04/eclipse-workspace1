package collection;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

// Record for Book
record Book(Integer id, String title, String author) {}

// Business Logic Class (BLC)
class Library {

    // 1) Display all books
    public void displayAvailableBooks(Vector<Book> books) {
        if (books.isEmpty()) {
            System.out.println("No books available in the Library.");
            return;
        }

        System.out.println("Available Books in the Library :");
        for (Book book : books) {
            System.out.println("  " + book);
        }
    }

    // 2) Issue a book by ID
    public void issueBook(Vector<Book> books, Scanner sc) {
        System.out.print("Enter the Book ID to issue : ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        Iterator<Book> itr = books.iterator();
        boolean found = false;

        while (itr.hasNext()) {
            Book book = itr.next();
            if (book.id() == id) {
                itr.remove(); // remove the book
                System.out.println("Book with ID " + id + " has been issued successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book with ID " + id + " not Found");
        }
    }

    // 3) Search book by title or author
    public void searchBook(Vector<Book> books, Scanner sc) {
        System.out.print("Enter the title or author to search : ");
        String keyword = sc.nextLine();

        boolean found = false;

        for (Book book : books) {
            if (book.title().equalsIgnoreCase(keyword) || book.author().equalsIgnoreCase(keyword)) {
                System.out.println("Book Found");
                System.out.println("  " + book);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching books found.");
        }
    }
}

// Execution Logic Class (ELC)
public class LibraryManagementVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Library book collection
        Vector<Book> bookList = new Vector<>();
        bookList.add(new Book(101, "Core Java", "Mr James"));
        bookList.add(new Book(102, "Adv Java", "Mr Robert"));
        bookList.add(new Book(103, "Head First Java", "Miss Kathy Sierra"));
        bookList.add(new Book(104, "Programming in C", "Mr Denis"));

        Library library = new Library();

        // Menu loop
        while (true) {
            System.out.println("\nSelect from the Menu :");
            System.out.println("\t1) Display Books Available in the Library :");
            System.out.println("\t2) Search a Book in the Library :");
            System.out.println("\t3) Issue a Book from the Library :");
            System.out.println("\t4) Exit from the application :");
            System.out.print("Please Enter your Choice : ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> library.displayAvailableBooks(bookList);
                case 2 -> library.searchBook(bookList, sc);
                case 3 -> library.issueBook(bookList, sc);
                case 4 -> {
                    System.out.println("Thank you for using the Library Management System!");
                    sc.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
