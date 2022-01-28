package thread3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFeatureDemo {

	public static void main(String[] args) throws Exception {
		MyCallable[] jobs = { new MyCallable(10), new MyCallable(20), new MyCallable(30), new MyCallable(40),
				new MyCallable(50) };
		ExecutorService service = Executors.newFixedThreadPool(3);
		for(MyCallable job:jobs) {
			Future<Object> f=service.submit(job);
			System.out.println("Sum ="+f.get());
		}
		service.shutdown();
	}

}
