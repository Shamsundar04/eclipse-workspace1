package in.array;
public class CountDuplicateElements {
    public static void main(String[] args) {
    	
        int[] numbers = {1,2,1,3,4,6,2,5,4};
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
            	             		  	  
                if (numbers[i] == numbers[j]) {
                    count++; 
                    break;
                }
            }
        }

        System.out.println("Total duplicate elements: " + count);
    }
}
