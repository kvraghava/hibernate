package thread4;

public class ThreadLocalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadLocal tl = new ThreadLocal();
		System.out.println(tl.get());
		tl.set(50);
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get());
		
		ThreadLocal tl2 = new ThreadLocal() {
			@Override
			public Object initialValue() {
				return "raghava";
			}
		};
		System.out.println(tl2.get());
		tl2.set(50);
		System.out.println(tl2.get());
		tl2.remove();
		System.out.println(tl2.get());
	}

}
