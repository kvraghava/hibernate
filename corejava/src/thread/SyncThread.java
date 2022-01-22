package thread;

public class SyncThread extends Thread{
	SyncDisplay d;
	String name;

	SyncThread(SyncDisplay d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}
