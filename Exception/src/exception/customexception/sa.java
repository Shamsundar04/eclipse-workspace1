package exception.customexception;

class CustomEx extends Exception {
	private static final long serialVersionUID = 1L;

	CustomEx(String msg) { super(msg); }
}

public class sa {
    static void risky() throws CustomEx {
        throw new CustomEx("Danger!");
    }

    public static void main(String[] args) throws Exception,RuntimeException {
        try {
            risky();
        } catch (RuntimeException e) {
            System.out.println("Runtime");
        }
        
    }
}
