package Exam;

public class MultiThreadInterface implements Runnable{
	public void run() {
		System.out.println("Running");
		
	}
	
	public  static void main (String [] args) {
		MultiThreadInterface thread = new MultiThreadInterface();
		Thread newThread = new Thread(thread);
		newThread.start();
	}

}
