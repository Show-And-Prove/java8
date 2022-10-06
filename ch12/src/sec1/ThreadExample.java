package sec1;

public class ThreadExample {

	public static void main(String[] args) {

		Thread thread = new MovieThread();
		
		thread.start();
		
		Thread thread2 = new Thread(new MusicRunnable());
		
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		
		thread.interrupt();
	}

}
