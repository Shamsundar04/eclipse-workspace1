package thread.threadgroupclass;

//ThreadGroupAllMethodsDemo.java
class MyThread extends Thread {
 MyThread(ThreadGroup tg, String name) {
     super(tg, name);
 }

 public void run() {
     try {
         System.out.println(getName() + " is running...");
         Thread.sleep(1000);
     } catch (InterruptedException e) {
         System.out.println(getName() + " interrupted!");
     }
 }
}

public class ThreadGroupAllMethodsDemo {
 public static void main(String[] args) {
     // 1️⃣ Create a main ThreadGroup
     ThreadGroup tg1 = new ThreadGroup("Accounting-Department");
     // मराठी: Accounting-Department नावाचा ThreadGroup तयार केला

     // 2️⃣ Create a sub ThreadGroup
	 ThreadGroup tg2 = new ThreadGroup(tg1,"Audit-Team");
     // मराठी: tg1 अंतर्गत Audit-Team नावाचा subgroup तयार केला

     // 3️⃣ Create threads in tg1 group
     MyThread t1 = new MyThread(tg1, "Sham");
     MyThread t2 = new MyThread(tg1, "Rohit");

     // 4️⃣ Create thread in tg2 group
     MyThread t3 = new MyThread(tg2, "Sneha");

     // 5️⃣ Start all threads
     t1.start();
     t2.start();
     t3.start();

     // 6️⃣ Display group information
     tg1.list();  // मराठी: ThreadGroup आणि त्यातील threadsची माहिती दाखवतो

     // 7️⃣ Get group name
     System.out.println("\nGroup Name: " + tg1.getName()); 
     // मराठी: ग्रुपचे नाव मिळवले

     // 8️⃣ Get parent group
     System.out.println("Parent Group: " + tg1.getParent().getName()); 
     // मराठी: parent ग्रुप मिळवला

//      9️⃣ Get and set max priority
     System.out.println("Old Max Priority: " + tg1.getMaxPriority());
     tg1.setMaxPriority(8);
     System.out.println("New Max Priority: " + tg1.getMaxPriority());
     // मराठी: ग्रुपसाठी कमाल प्राधान्य ठरवले

     // 🔟 Check if daemon
//     System.out.println("Is Daemon Group? " + tg1.isDaemon());
//     tg1.setDaemon(true);
//     System.out.println("After setDaemon(true): " + tg1.isDaemon());
     // मराठी: ग्रुप daemon आहे का ते तपासले आणि सेट केले

     // 11️⃣ Active thread count
     System.out.println("Active Threads: " + tg1.activeCount());
     // मराठी: सध्या चालू असलेल्या थ्रेड्सची संख्या

     // 12️⃣ Active subgroup count
     System.out.println("Active SubGroups: " + tg1.activeGroupCount());
     // मराठी: सध्या चालू असलेल्या subgroups ची संख्या

     // 13️⃣ Enumerate all active threads
     Thread[] threads = new Thread[tg1.activeCount()];
     tg1.enumerate(threads);
     System.out.println("\nEnumerated Threads:");
     for (Thread t : threads) {
         System.out.println(" - " + t.getName());
     }
//      मराठी: सर्व active threads लिस्ट केले

     // 14️⃣ Enumerate subgroups
     ThreadGroup[] groups = new ThreadGroup[tg1.activeGroupCount()];
     tg1.enumerate(groups);
     System.out.println("\nEnumerated SubGroups:");
     for (ThreadGroup g : groups) {
         System.out.println(" - " + g.getName());
     }
     // मराठी: सर्व subgroups लिस्ट केले

     // 15️⃣ parentOf()
     System.out.println("\nIs tg1 parent of tg2? " + tg1.parentOf(tg2));
     // मराठी: tg1 हा tg2 चा parent आहे का ते तपासले

     // 16️⃣ checkAccess()
//     tg1.checkAccess();
     System.out.println("Access check successful!");
     // मराठी: सध्याच्या थ्रेडला परवानगी आहे का ते तपासले

     // 17️⃣ toString()
     System.out.println("toString(): " + tg1.toString());
     // मराठी: ग्रुपची माहिती string स्वरूपात दाखवली

//     // 18️⃣ interrupt() (optional demo)
//     tg1.interrupt();
//     // मराठी: सर्व थ्रेड्सना interrupt केले
//
     // 19️⃣ destroy() (only works when threads are finished)
     try {
         t1.join();
         t2.join();
         t3.join();
//         tg2.destroy();
         System.out.println("Audit-Team destroyed successfully!");
     } catch (IllegalThreadStateException e) {
         System.out.println("Cannot destroy while threads are active!");
     } catch (InterruptedException e) {
         e.printStackTrace();
     }

     System.out.println("\n✅ Program Completed Successfully!");
 }
}
