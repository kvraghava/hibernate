package thread4;

public class ParentThread2 implements Runnable{
	
	public static InheritableThreadLocal tl = new InheritableThreadLocal();

	@Override
	public void run() {
		tl.set("ParentThread");
		System.out.println("parent thread value= " + tl.get());
		ChildThread2 c = new ChildThread2();
		Thread t = new Thread(c);
		t.start();
	}
}
