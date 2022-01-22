package thread;

public class ClassLevelLockTest2 {
	
	public static void main(String[] args) {
		ClassLevelLockDispaly d1 = new ClassLevelLockDispaly();
		ClassLevelLockDispaly d2 = new ClassLevelLockDispaly();
		ClassLevelLockThread t1 = new ClassLevelLockThread(d1,"raghava");
		ClassLevelLockThread t2 = new ClassLevelLockThread(d2,"raga");
		t1.start();
		t2.start();
	}
}
