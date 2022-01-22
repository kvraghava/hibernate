package thread;

public class ThreadSyncTest {
	
	public static void main(String[] args) {
		SyncDisplay d = new SyncDisplay();
		SyncThread t1 = new SyncThread(d,"raghava");
		SyncThread t2 = new SyncThread(d,"raga");
		t1.start();
		t2.start();
	}
}
