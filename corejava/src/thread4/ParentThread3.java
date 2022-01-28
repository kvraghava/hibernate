package thread4;

public class ParentThread3 implements Runnable{
	public static InheritableThreadLocal tl = new InheritableThreadLocal() {
		@Override
		public Object childValue(Object p) {
			return "child Thread t";
		}
	};

	@Override
	public void run() {
		tl.set("ParentThread");
		System.out.println("parent thread value= " + tl.get());
		ChildThread3 c = new ChildThread3();
		Thread t = new Thread(c);
		t.start();
	}
}
