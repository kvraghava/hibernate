package thread;

public class EvenOddThread implements Runnable {

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<11; i++) {
			try {
				if(i%2==0 && Thread.currentThread().getName().equals("even")) {
					System.out.println("even thread :"+i);
					notify();
					wait();
				}else if(i%2!=0 && Thread.currentThread().getName().equals("odd")) {
					System.out.println("odd thread :"+i);
					notify();
					wait();
				}else {
					//System.out.println("failed");
				}
				notify();
			}catch(Exception e) {
				
			}
		}
	}

}
