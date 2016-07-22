package lck01_J_NCEISO;

public class TestThread implements Runnable{
	
	private final String lock = new String("LOCK").intern();

	public void run() {
		synchronized (lock) {
			// ... 
			}
	}
	
	public static void main(String[] args) throws Exception { 
		
		TestThread t = new TestThread();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
	}

}