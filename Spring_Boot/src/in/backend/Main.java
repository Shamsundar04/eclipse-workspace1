package in.backend;

public class Main {
	public static void main(String[] args) {
        int a = 5, b = 3, c = 1;
        int result = a * (b + c++) / (--b);
        System.out.println(result);
    }
}
