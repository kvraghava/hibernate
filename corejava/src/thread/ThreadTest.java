package thread;

public class ThreadTest {

	public static void main(String[] args) {
		Display d = new Display();
		MyThread t1 = new MyThread(d,"raghava");
		MyThread t2 = new MyThread(d,"raga");
		t1.start();
		t2.start();
	}

}
