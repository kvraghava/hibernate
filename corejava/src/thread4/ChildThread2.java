package thread4;

public class ChildThread2 implements Runnable{

	@Override
	public void run() {
		System.out.println("parent Thread value in Child Thread= "+ParentThread2.tl.get());
	}

}
