package thread.joinmethod;
class DataFetcher extends Thread {
    private String apiName;

    public DataFetcher(String apiName) {
        this.apiName = apiName;
    }

    @Override
    public void run() {
        System.out.println("Fetching data from " + apiName + " API...");
        try {
            Thread.sleep(2000); // simulate API delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(apiName + " data fetched.");
    }
}

public class DashboardApp {
    public static void main(String[] args) {
        DataFetcher productAPI = new DataFetcher("Product");
        DataFetcher userAPI = new DataFetcher("User");
        DataFetcher salesAPI = new DataFetcher("Sales");

        // Run all fetches in parallel
        productAPI.start();
        userAPI.start();
        salesAPI.start();

        try {
            // Wait for all to finish before generating report
            productAPI.join();
            userAPI.join();
            salesAPI.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("✅ All APIs fetched — generating analytics report...");
    }
}
