package thread.volatilekeyword;


//class SharedData {
//    boolean flag = false; // NOT volatile
//}
//
//class WorkerThread extends Thread {
//    SharedData data;
//
//    WorkerThread(SharedData data) {
//        this.data = data;
//    }
//
//    public void run() {
//        System.out.println("Worker thread started...");
//        while (!data.flag) {
//            // busy waiting (looping until flag becomes true)
//        }
//        System.out.println("Worker thread noticed flag = true!");
//    }
//}
//
//public class WithoutVolatileExample {
//    public static void main(String[] args) throws InterruptedException {
//        SharedData data = new SharedData();
//        WorkerThread t1 = new WorkerThread(data);
//        t1.start();
//
//        Thread.sleep(2000);
//        data.flag = true; // main thread updates flag
//        System.out.println("Main thread set flag = true");
//    }
//}
