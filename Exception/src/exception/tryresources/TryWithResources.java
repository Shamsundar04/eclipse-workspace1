package exception.tryresources;

import java.io.Closeable;
import java.io.IOException;

class DatabaseManager implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Database connection closed");
	}
}

class FileManager implements Closeable {

	@Override
	public void close() throws IOException {
		System.out.println("File connection closed");
	}
}

public class TryWithResources {

	public static void main(String[] args) {

		DatabaseManager db = new DatabaseManager();
		FileManager fm = new FileManager(); // try with resources enhancement from java 9 version

		try (db; fm) { // Only resources will handled
		} catch (Exception e) { // Both resources and exception will handled
			System.out.println(e);
		}
	}
}