package thread2;

public class ReentrantLockDemo {

	public static void main(String[] args) {		
		Display d = new Display();
		MyThread m1 = new MyThread(d,"raghava");
		MyThread m2 = new MyThread(d,"sreekanth");
		MyThread m3 = new MyThread(d,"suresh");
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		Thread t3 = new Thread(m3);
		t1.start();
		t2.start();
		t3.start();
	}
}