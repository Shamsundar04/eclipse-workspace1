package thread.joinmethod;

class FileUploader extends Thread {
	private String fileName;

	public FileUploader(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void run() {
		System.out.println("Uploading " + fileName + " started...");
		try {
			// Simulate upload time
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Uploading " + fileName + " completed.");
	}
}

public class FileUploadApp {
	public static void main(String[] args) {
		FileUploader f1 = new FileUploader("ProjectReport.pdf");
		FileUploader f2 = new FileUploader("TeamPhoto.jpg");
		FileUploader f3 = new FileUploader("SourceCode.zip");
		
		

		// Start uploads in parallel
		f1.start();
		f2.start();
		f3.start();

		try {
			// Wait until all uploads are finished
			f1.join();
			f2.join();
			f3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("All uploads completed successfully!");
	}
}
