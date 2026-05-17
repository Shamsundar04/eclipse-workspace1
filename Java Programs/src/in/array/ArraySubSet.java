package in.array;

public class ArraySubSet {
    public static void main(String[] args) {

        int arr1[] = {11, 7, 1, 13, 21, 3, 7, 3};
        int arr2[] = {11,5, 3, 7, 1, 7};

//        Arrays.sort(arr1);
//        Arrays.sort(arr2);

        boolean isSubset = true;

        for (int j = 0; j < arr2.length; j++) {
            boolean found = false;

            for (int i = 0; i < arr1.length; i++) {
                if (arr2[j] == arr1[i]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                isSubset = false;
                break;
            }
        }

        if (isSubset) {
            System.out.println("b[] is a subset of a[]");
        } else {
            System.out.println("b[] is NOT a subset of a[]");
        }
    }
}
