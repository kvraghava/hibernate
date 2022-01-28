package thread3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintJob[] jobs = { new PrintJob("suresh"), new PrintJob("raghava"), new PrintJob("sree"), new PrintJob("Hari"),
				new PrintJob("Guru") };
		ExecutorService service = Executors.newFixedThreadPool(2);
		for(PrintJob job: jobs) {
			service.submit(job);
		}
		service.shutdown();
	}
}