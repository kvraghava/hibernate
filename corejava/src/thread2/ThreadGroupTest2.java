package thread2;

public class ThreadGroupTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		Thread[] threads = new Thread[system.activeCount()];
		system.enumerate(threads);
		for(Thread t: threads) {
			System.out.println(t.getName()+"   "+t.isDaemon());
		}
	}

}
