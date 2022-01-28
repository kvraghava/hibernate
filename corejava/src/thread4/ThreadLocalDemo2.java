package thread4;

public class ThreadLocalDemo2 {

	public static void main(String[] args) {
		CustomerThread c1 = new CustomerThread("customer Thread 1");
		CustomerThread c2 = new CustomerThread("customer Thread 2");
		CustomerThread c3 = new CustomerThread("customer Thread 3");
		CustomerThread c4 = new CustomerThread("customer Thread 4");
		c1.start();
		c2.start();
		c3.start();
		c4.start();
	}

}
