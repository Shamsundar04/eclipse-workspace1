package multithreading;
import java.util.Scanner;
class OddEvenUsingThread{
    public static void main(String args[]) 
    throws InterruptedException {
        try (Scanner scn = new Scanner(System.in)) {
			int no=scn.nextInt();

			Thread0 thread1=new Thread0(no);
			Thread0 thread2=new Thread0(no);
			
			thread1.setName("Child-1");
			thread2.setName("Child-2");
			thread1.start();
			thread1.join();

			thread2.start();
			thread2.join();
		}
    }
}

class Thread0 extends Thread {
    int no=0;
    
    public Thread0(int no){
        this.no=no;
    }

    public void run(){

        String name=Thread.currentThread().getName();
        
        if (name.equals("Child-1")) {
        	for(int i=1;i<=no;i++){
                if(i%2==0){
                System.out.println(i+" by "+name);
                }
            }
		}
        
        if (name.equals("Child-2")) {
        	for(int i=1;i<=no;i++){
                if(i%2!=0){
                System.out.println(i+" by "+name);
                }
            }
			
		}
        

         
    }
}
