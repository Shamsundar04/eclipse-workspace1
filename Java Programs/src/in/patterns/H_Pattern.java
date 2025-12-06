package in.patterns;
class H_Pattern {
    public static void main(String[] args) {
        int height = 7; // Adjust height as needed (must be odd for a clear middle bar)
        int width = 5;  // Adjust width as needed

//        for (int i = 0; i < height; i++) {
//            for (int j = 0; j < width; j++) {
//                // Print '*' for the vertical lines (left and right edges)
//                if (j == 0 || j == width - 1) {
//                    System.out.print("*");
//                } 
//                // Print '*' for the horizontal middle line
//                else if (i == height / 2) {
//                    System.out.print("*");
//                } 
//                // Print space for other positions
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println(); // Move to the next line after each row
//        }
        
        
        for(int i = 1; i <= height; i++) {
            for(int j = 1; j <= width; j++) {

                if(j == 1 || j == width) {
                    System.out.print("*");
                } else if(i == (height+1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}