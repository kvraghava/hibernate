package thread4;

public class ThreadLocalDemo3 {
	public static void main(String[] args) {
		//ParentThread pt = new ParentThread();
		ParentThread2 pt = new ParentThread2();
		//ParentThread3 pt = new ParentThread3();
		
		Thread t= new Thread(pt);
		t.start();
	}
	
	/*
	 * pt result is 
	 * parent thread value= ParentThread 
	 * parent Thread value in Child Thread= null
	 */
	
	/*
	 * pt2 result is 
	 * parent thread value= ParentThread 
	 * parent Thread value in Child Thread= ParentThread
	 */
	
	/*
	 * pt3 result is 
	 * parent thread value= ParentThread 
	 * parent Thread value in Child Thread= child Thread t
	 */
}
