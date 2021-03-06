package thread4;

public class ParentThread implements Runnable {

	public static ThreadLocal tl = new ThreadLocal();

	@Override
	public void run() {
		tl.set("ParentThread");
		System.out.println("parent thread value= " + tl.get());
		ChildThread c = new ChildThread();
		Thread t = new Thread(c);
		t.start();
	}

}
