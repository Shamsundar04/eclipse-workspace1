//class MyThrea{
//	public void table(int n){
//		
//		synchronized(this){
//		for(int i=1;i<=10;i++){
//			System.out.println(i+" * "+n+" = "+i*n);
//			
//			try{
//				Thread.sleep(500);
//			}
//			catch(InterruptedException e){
//				e.printStackTrace();
//			}
//		}
//		System.out.println("----------------------------------");
//		}
//	}
//}
//
//public class a{
//	public static void main(String args[]){
//		
//		MyThread myThread=new MyThread();
//		Runnable run=new Runnable(){
//		String name = Thread.currentThread().getName();
//
//			@Override
//			public void run() {
//				System.out.println(name);
//				myThread.table(5);
//			}
//		};
//		
//		new Thread(run).start();
//		
//		
////		Thread t1=new Thread(()->myThread.table(2),"child-1");
////		Thread t2=new Thread(()->myThread.table(5),"child-2");
//		
//	
////		t2.start();
//	}
//}