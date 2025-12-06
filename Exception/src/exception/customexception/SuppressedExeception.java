package exception.customexception;

public class SuppressedExeception {
    public static void main(String[] args) throws Exception {
        try {
            throw new Exception("From try");
        } finally {
//            throw new Exception("From finally");
        }
    }
}
