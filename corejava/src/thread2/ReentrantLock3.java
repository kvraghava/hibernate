package thread2;

public class ReentrantLock3 {

	public static void main(String[] args) {
		MyThread2 my1 = new MyThread2();
		MyThread2 my2 = new MyThread2();
		my1.start();
		my2.start();
	}

}
