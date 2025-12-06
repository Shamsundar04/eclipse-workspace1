package in.array;


public class ShiftingArrayElements {
    public static void main(String[] args) {
        
//    	 Right Rotation
          int[] arr = {10, 20, 30, 40, 50};
          int k = 2; // number of shifts
          int n = arr.length;

          // Temporary array
          int[] temp = new int[n];

          for (int i = 0; i < n; i++) {
              temp[(i + k) % n] = arr[i];
          }
          // Copy back
          arr = temp;

          for (int num : arr) {
              System.out.print(num + " ");
          }
    	
    	
//    	Left Rotation
//    	 int[] arr = {10, 20, 30, 40, 50};
//         int k = 2; // number of shifts
//         int n = arr.length;
//         
//         int temp[]=new int[n];
//         
//         for(int i=0;i<n;i++) {
////        	 			   6 % 5
//        	 temp[i]=arr[(i+k)%n];
////        	 30 40 50 10 20
////        	 0	1  2  3  4
//         }
//         
//         arr=temp;
//         
//         for(int a:arr) {
//        	 System.out.print(a+" ");
//         }
    }
}
