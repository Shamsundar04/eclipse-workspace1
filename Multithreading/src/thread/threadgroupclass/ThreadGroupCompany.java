package thread.threadgroupclass;

class Accounting extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is processing salary in Accounting Department");
        try {
            Thread.sleep(1000); // simulate accounting work
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " accounting task interrupted");
        }
    }
}

class Marketing extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is preparing a new campaign in Marketing Department");
        try {
            Thread.sleep(1500); // simulate marketing work
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " marketing task interrupted");
        }
    }
}

class HR extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is conducting an interview in HR Department");
        try {
            Thread.sleep(2000); // simulate HR work
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " HR task interrupted");
        }
    }
}

public class ThreadGroupCompany {

    public static void main(String[] args) throws InterruptedException {

        // Company main thread group
        ThreadGroup companyGroup = new ThreadGroup("Company-Group");

        // Department groups under the main company
        ThreadGroup accountingDept = new ThreadGroup(companyGroup, "Accounting-Department");
        ThreadGroup marketingDept = new ThreadGroup(companyGroup, "Marketing-Department");
        ThreadGroup hrDept = new ThreadGroup(companyGroup, "HR-Department");

        // Accounting employees
        Thread t1 = new Thread(accountingDept, new Accounting(), "Sham");
        Thread t2 = new Thread(accountingDept, new Accounting(), "Vijay");
        Thread t3 = new Thread(accountingDept, new Accounting(), "Ajay");

        // Marketing employees
        Thread m1 = new Thread(marketingDept, new Marketing(), "Rohan");
        Thread m2 = new Thread(marketingDept, new Marketing(), "Kiran");

        // HR employees
        Thread h1 = new Thread(hrDept, new HR(), "Sita");
        Thread h2 = new Thread(hrDept, new HR(), "Geeta");

        // Start all employees
        t1.start();
        t2.start();
        t3.start();
        m1.start();
        m2.start();
        h1.start();
        h2.start();
        
        // Let threads start
        Thread.sleep(200);

        // Company monitoring system
        System.out.println("\n===== Company Monitoring System =====");
        System.out.println("Total Active Threads in Company: " + companyGroup.activeCount());
        System.out.println("Total Active Departments: " + companyGroup.activeGroupCount());
//
//        // Print hierarchy
        companyGroup.list();
//
//        // Example: Interrupting all marketing threads (e.g., project cancelled)
//        Thread.sleep(500);
//        System.out.println("\n[ALERT] Marketing project cancelled! Interrupting Marketing Department...");
//        marketingDept.interrupt();
    }
}
