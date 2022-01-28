package thread3;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Object> {

	int num;
	MyCallable(int num){
		this.num = num;
	}
	
	@Override
	public Object call() throws Exception {
		System.out.println("Thread: "+Thread.currentThread().getName());
		int sum =0;
		for(int i =1;i<=num;i++) {
			sum = sum +i;
		}
		return sum;
	}
}