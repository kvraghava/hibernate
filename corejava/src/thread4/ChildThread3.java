package thread4;

public class ChildThread3 implements Runnable{

	@Override
	public void run() {
		System.out.println("parent Thread value in Child Thread= "+ParentThread3.tl.get());
	}

}
