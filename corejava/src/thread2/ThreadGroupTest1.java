package thread2;

public class ThreadGroupTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent() .getName());
		
		ThreadGroup tg = new ThreadGroup("raghava");
		System.out.println(tg.getParent().getName());
		System.out.println(tg.getMaxPriority());
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().getThreadGroup().list();
		System.out.println(Thread.currentThread().getThreadGroup().activeCount());
		//-----------------------------
		
		Thread t1 =new Thread(tg,"Thread1");
		tg.setMaxPriority(3);
		Thread t2 =new Thread(tg,"Thread2");
		Thread t3 =new Thread(tg,"Thread3");
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		Thread.currentThread().getThreadGroup().list();
		//tg.list();
		System.out.println(tg.activeCount());
	}

}
