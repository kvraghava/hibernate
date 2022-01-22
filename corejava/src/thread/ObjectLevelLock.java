package thread;

public class ObjectLevelLock {
	//object level lock breakage
	public static void main(String[] args) {
		SyncDisplay d1 = new SyncDisplay();
		SyncDisplay d2 = new SyncDisplay();
		SyncThread t1 = new SyncThread(d1,"raghava");
		SyncThread t2 = new SyncThread(d2,"raga");
		t1.start();
		t2.start();
	}

}
