package thread2;

import java.util.concurrent.locks.ReentrantLock;

public class Display {

	ReentrantLock l = new ReentrantLock();

	public void wish(String name) {
		l.lock();
		for (int i = 0; i < 10; i++) {
			System.out.print("good morning:");
			try{
				Thread.sleep(1000);
			}catch(Exception e) {				
			}
			System.out.println(name);
		}
		l.unlock();
	}
}
