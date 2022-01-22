package thread;

public class EvenOdd {

	public static void main(String[] args) {
		EvenOddThread e = new EvenOddThread();
		Thread t1 = new Thread(e,"even");
		Thread t2 = new Thread(e,"odd");
		t2.start();
		t1.start();
	}

}
