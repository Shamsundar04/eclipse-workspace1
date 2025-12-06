package exception.customexception;
class Demo implements AutoCloseable {
    public void close() throws Exception {
        throw new Exception("Closing Exception");
    }
}

public class Test {
    public static void main(String[] args) throws Exception {
        try (Demo d = new Demo()) {
            throw new Exception("Try Exception");
        }
    }
}
