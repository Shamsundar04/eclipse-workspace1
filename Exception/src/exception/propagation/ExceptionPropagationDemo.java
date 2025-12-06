package exception.propagation;

class ExceptionPropagationDemo {
    void method1() {
    	System.out.println("method 1");
        int data = 50 / 0;  // ArithmeticException
        System.out.println(data);
        
    }

    void method2() {
    	System.out.println("method 2");
        method1();  // Exception propagates here
    }

    void method3() {
        try {
        System.out.println("method 3");
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in method3");
        }
    }

    public static void main(String[] args) {
        ExceptionPropagationDemo obj = new ExceptionPropagationDemo();
        obj.method3();
        System.out.println("Program continues...");
    }
}
