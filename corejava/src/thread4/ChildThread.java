package thread4;

public class ChildThread implements Runnable{

	@Override
	public void run() {
		System.out.println("parent Thread value in Child Thread= "+ParentThread.tl.get());
	}

}
