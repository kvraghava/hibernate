package thread;

public class ClassLevelLockThread extends Thread{
	ClassLevelLockDispaly d;
	String name;

	ClassLevelLockThread(ClassLevelLockDispaly d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}
