package thread3;

public class PrintJob implements Runnable{
	
	private String name;
	
	PrintJob(String name){
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name +".... job started by Threads "+Thread.currentThread().getName());		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println(name+"...Job completed by Thread: "+Thread.currentThread().getName());
	}
}