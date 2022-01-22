package thread2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread2 extends Thread {

	static ReentrantLock rl = new ReentrantLock();

	public void run() {
		try {
			if (rl.tryLock(5000, TimeUnit.MILLISECONDS)) {
				System.out.println("first thread get the lock");
				Thread.sleep(2000);
				rl.unlock();
			} else {
				System.out.println("alternative code is running");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
